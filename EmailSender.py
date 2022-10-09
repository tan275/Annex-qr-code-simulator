from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
from email.mime.image import MIMEImage
from email.mime.application import MIMEApplication
import smtplib
import ssl
from datetime import date
from email_validator import validate_email
import jwt

class Email:
    def __init__(self):
        self.__smtp_server = "smtp.gmail.com"
        self.__port = 587
        self.__context = ssl.create_default_context()
        self.__sender_email = "sender email"
        self.__sender_password = "sender email password"
        self.__today_date = date.today().strftime("%d-%m-%y")
        self.__token = {"some": "payload"}
    
    def EmailValidator(self,email):
        try:
            validate_email(email)
            return True
        except:
            return False
        
    def send(self,**kwargs):
        print(kwargs)
        msg = MIMEMultipart()
        receiver_email = kwargs["receiver_email"]
        verificationLink = kwargs["verify_link"]
        email = kwargs["email"]
        number = kwargs["number"]
        image_url = kwargs["image_url"]
        print("Receiver Email :",receiver_email)
        
        if(self.EmailValidator(receiver_email[0])):
            msg["Subject"] = "Techyshivang Blog : Email Verify on {}".format(self.__today_date)
            msg["From"] = self.__sender_email
            msg['To'] = ", ".join(receiver_email)
            text = """Welcome,this is a Verification Email for your complete Process."""
            body_text = MIMEText(text, 'plain') 
            msg.attach(body_text)
            # html = """\
            #     <html>
            #     <body>
            #         <br>
            #         Just Click om this Link {} \nor paste it over the browser to complete your sign up process in case of any 
            #         difficulty please contact over this email {} or our customer support Number {} <br>
            #         Thank you. <br>
            #         <br>
            #         <br>
            #         Thanks & Regards<br>
            #         Shivang Saxena
            #         </p>
                    
            #     </body>
            #     </html>
            # """
            html = open("verify.html")
            # body_html = MIMEText(html.format(verificationLink,email,number), 'html')
            body_html = MIMEText(html.format(verificationLink,verificationLink,verificationLink), 'html')
            
            msg.attach(body_html)
            # img_name = image_url.split("/")[6] # TODO: replace your image filepath/name
            img_name = "index.webp"
            with open(image_url, 'rb') as fp:
                img = MIMEImage(fp.read())
                img.add_header('Content-Disposition', 'attachment', filename=img_name)
                msg.attach(img)
            try:
                server = smtplib.SMTP(self.__smtp_server, self.__port)
                server.ehlo() 
                server.starttls(context=self.__context)
                server.ehlo() 
                server.login(self.__sender_email, self.__sender_password)

                # Send email here
                server.sendmail(self.__sender_email,receiver_email,msg.as_string())

            except Exception as e:
                return {
                    "statusCode":500,
                    "message":"Email Not sent",
                    "error":e
                }
            finally:
                server.quit()
                return {
                    "statusCode":200,
                    "message":"verification email send successfully !!"
                } 
                
        else:
            return {
                "statusCode":403,
                "message":"Email is Not Valid !!"
            }
            
    def validateEmail(self,verify_link):
        try:
            token = verify_link
            res = jwt.decode(token,"secret", algorithms=["HS256"])
            return {
                "statusCode":200,
                "message":"Signature Valid !!",
                "data":res
            }  
        except Exception as e:
            return {
                "statusCode":403,
                "message":"Signature InValid !!",
                "error":e
            }
                        

email = Email()
response = email.send(
    receiver_email=["receiver_email"],
    email="support@myblog.com",
    number="+91 XXXXXXXXXX",
    verify_link="http://localhost:3000/verify/{}".format(jwt.encode({"some": "payload"}, "secret", algorithm="HS256").decode()),
    image_url="image-url or save image name in the current working directory"
)
print(response)
