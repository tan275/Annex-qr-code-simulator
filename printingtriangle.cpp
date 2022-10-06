#include <iostream>
using namespace std;
int main(){
    int num;
    cout<<"enter the number of row";
    cin>>num;
    for(int k=1;k<=num;k++){
    for(int i=num;i>k;i--){
        cout<<" ";}
    for(int j=2*k-1;j>0;j--){
        cout<<"*";}
        cout<<endl;

    }
}
    



