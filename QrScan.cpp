#include <bits/stdc++.h>
typedef long long int ll;

using namespace std;
#define ULL unsigned long long
#define MOD 1000000007;
#define INF 1e18
#define nline "\n"
#define rep for (int i = 0; i < n; i++)
#define repin(a, b, c) for (int(a) = (b); (a) <= (c); (a)++)
#define repde(a, b, c) for (int(a) = (b); (a) >= (c); (a)--)
#define max(a, b) ((a < b) ? b : a)
#define min(a, b) ((a > b) ? b : a)
#define max3(a, b, c) (a > b ? (a > c ? a : c) : (b > c ? b : c))
#define min3(a, b, c) (a < b ? (a < c ? a : c) : (b < c ? b : c))

//-------------------------------------------------------------------------------------/
ULL gcd(ULL a, ULL b)
{
   if (a == 0)
      return b;
   if (b == 0)
      return a;
   if (a == 1 || b == 1)
      return 1;
   if (a == b)
      return a;
   if (a > b)
      return gcd(b, a % b);
   else
      return gcd(a, b % a);
}
ll expo(ll a, ll b, ll mod)
{
   ll res = 1;
   while (b > 0)
   {
      if (b & 1)
         res = (res * a) % mod;
      a = (a * a) % mod;
      b = b >> 1;
   }
   return res;
}
void swap(int &x, int &y)
{
   int temp = x;
   x = y;
   y = temp;
}
void google(int t) { cout << "Case #" << t << ": "; }
bool isPrime(int n)
{
    
    if (n <= 1)
        return false;
 
    
    for (int i = 2; i <= sqrt(n); i++)
        if (n % i == 0)
            return false;
 
    return true;
}

int highestPowerof2(int n)
{
    int res = 0;
    for (int i = n; i >= 1; i--) {
        
        if ((i & (i - 1)) == 0) {
            res = i;
            break;
        }
    }
    return res;
}
int convert(int n,int base) {
 int bin = 0;
  int rem, i = 1;

  while (n!=0) {
    rem = n % base;
    n /= base;
    bin += rem * i;
    i *= 10;
    }

  return bin;
}
int findGCD(ll a, ll b) {
   if (b == 0)
      return a;
      return findGCD(b, a % b);
   }
void lowestFraction(ll num1, ll num2){
      ll denom;
      denom = findGCD(num1,num2);
      num1/=denom;
      num2/=denom;

      cout<<num1<<"/"<<num2;
}
int log_a_to_base_b(ll a, ll b)
{
    return log2(a) / log2(b);
}

ll binarySearch(int arr[], int l, int r, int x)
{
    if (r >= l) {
        int mid = l + (r - l) / 2;
 
        
        if (arr[mid] >= x)
            return mid;
 
        
        
 
        
        return binarySearch(arr, mid + 1, r, x);}
    
 
   
 return -1;   
}
ll getSum(ll n)
    {
        ll sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
void Encoder()
{
int x;
cin>>x;
int a[x];
int sum=0;
for(int i=0;i<x;i++)
{
  cin>>a[i];
  sum+=a[i];

}
int c,d;
cin>>c>>d;
int sum2=0,sum3=0;
for(int i=0;i<d;i++)
{ if(i!=d-1)
  sum2+=a[i];
}

for(int i=0;i<c;i++)
{  if(i!=c-1)
  sum3+=a[i];
  
}
int d1,d2;
d1=abs(sum3-sum2);
if(c<=d){
d2=sum-sum2+sum3;}
else{
d2=sum-sum3+sum2;}
cout<<(d2<d1?d2:d1);
}

signed main()
{ios::sync_with_stdio(0);
    cin.tie(0);
 
    #ifdef debug
    freopen("input.txt","r",stdin);freopen("output.txt","w",stdout);
    freopen("log.txt", "w", stderr);
    #endif

   int t=1;
 


   
   int z;
 
   while(t--){
   Encoder();}







#ifdef debug
    fprintf(stdout,"\nTIME: %.3lf sec\n", (double)clock()/(CLOCKS_PER_SEC));
    #endif
 
 
 
 }
