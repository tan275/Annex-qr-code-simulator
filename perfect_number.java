//Java program to check if a number is perfect number or not
//perfect number is a positive integer that is equal to the sum of its factors
import java.util.Scanner;  //Importing Scanner package
public class Main
{    
static long isPerfect(long num) //function to check perfect number
{       
long sum=0;  
for(int i=1;i<=num/2;i++)  
{  
if(num%i==0)  
{  
sum=sum+i;  //to calculate the sum of factors
} 
}      
return sum; //returns the sum of factors
}  
public static void main(String args[])    
{  
long number,n;  
Scanner sc=new Scanner(System.in);  //creating object of scanner         
System.out.print("Enter the number: ");  
number=sc.nextLong();    //taking input from user
n = isPerfect(number);    
if(n==number)  //to check perfect number
System.out.println(number+" is a perfect number");  
else  
System.out.println(number+" is not a perfect number");   
}   
}  