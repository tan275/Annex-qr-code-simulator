#include<bits/stdc++.h>
using namespace std;
//void print_queue(priority_queue<int> q){
    void print_queue(priority_queue<int ,vector<int>, greater<int> > q2){
    while(!q2.empty()){
        cout<<q2.top()<<" ";
        q2.pop();
    }
    cout<<"\n";;
}
int main(){
   /* priority_queue<int> q;
    for(int element:{1,2,3,4,9,5,8,6,7}){
        q.push(element);
    }
    print_queue(q);*/


    priority_queue<int , vector<int>, greater<int> > q2;      //this will print it in ascending order
    for(int element: {1,2,6,5,4,3,7,8,8}){
        q2.push(element);
    }
    print_queue(q2); 

}