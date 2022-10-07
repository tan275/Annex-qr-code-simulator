#include<iostream>
using namespace std;
void spring(int a[4][4],int n)
{cin>>n;
int t=n*n;
int sr,sc=0;
int er,ec=n-1;
while(t--)
{for(int i=sc;i<ec;i++)
{cout<<a[sr][i]<<" ";}
sr++;
for(int i=sr;i<er;i++)
{cout<<a[ec][i]<<" ";}
ec--;
for(int i=ec;i>sc;i--)
{cout<<a[er][i]<<" ";}
er--;
for(int i=er;i>sr;i--)
{cout<<a[sc][i]<<" ";}
sc++;
}
}

int main(){
    int a[4][4]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    spring(a,4);
}