// write a program to find the area of circle ,rectangle and triangle using function overloading 
#include <iostream>
using namespace std;

int area (int);
int area(int,int);
float area(float);
float area(float,float);
int main()
{
    int s,l,b;
    float r,bs,ht;
    cout<<"Enter side of a square:\n";
    cin>>s;
    cout<<"Enter lenght and breath of rectangle:\n";
    cin>>l>>b;
    cout<<"Enter radius of circle:\n";
    cin>>r;
    cout<<"Enter base and height of triangle:\n";
    cin>>bs>>ht;
    cout<<"\n the area of square is :"<<area(s);
    cout<<"\n the area of rectangle is :"<<area(l,b);
    cout<<"\n the area of circle is :"<<area(r);
    cout<<"\n the area of triangle is :"<<area(bs,ht);

}
   int area(int s)
   {
    return(s*s);
   }
   int area(int l,int b)
   {
    return(l*b);
   }
   float area(float r)
   {
    return(3.14*r*r);
   }
   float area(float bs, float ht)
   {
    return((bs*ht)/2);
   }



