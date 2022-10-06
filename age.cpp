// Q1 . Write a program to print following: 
//  Age greater than or equal to 18 print you can vote, 
//  Age less than 18 print you are in high school,(do not include 13 here)
//  Age less than or equal to 13 print you are teenager, 
//  Age less than or equal to 10 print you are in middle school, 
//  Age less than or equal to 6 print you are in primary school. 
// (hint: if age is 23 then print you can vote and if age is 9 you are in middle school)  

#include <iostream>
using namespace std;
int main ()
 {int age;
 cout<<"enter your age=";
 cin>>age;
 cout<<endl;
 if(age>=18)
 {cout<<"you can vote"<<endl;}
 else if ((age>13)&&(age<18))
 {cout<<"you are in high school"<<endl;}
 else if (age>10 &&age<=13)
 {cout<<"you are teenager"<<endl;}
 else if (age>6 && age<=10)
 {cout<<"you are in middle school"<<endl;}
  else
{ cout<<"you are in primary school"<<endl;}
 
 return 0;}
