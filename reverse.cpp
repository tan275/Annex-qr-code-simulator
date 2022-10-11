#include <bits/stdc++.h>
using namespace std;
int main(){
   //create a list
   list<int> myList;
   //inserting elements to the list
   myList.push_back(1);
   myList.push_back(2);
   myList.push_back(3);
   myList.push_back(4);
   //list before appyling reverse() function
   cout<<"List : ";
   for (auto i = myList.begin(); i != myList.end(); i++)
      cout << *i << " ";
   //reversing the list
   myList.reverse();
   cout<<"\nList after appyling reverse() : ";
   for (auto i = myList.begin(); i != myList.end(); i++)
      cout << *i << " ";
   return 0;
}
