public class MinCoins1  
{  

public int minNoCoins(int coinsArr[], int s, int Y)  
{  

int dp[] = new int[Y + 1];  
 
dp[0] = 0;  

for (int j = 1; j <= Y; j++)  
{  
dp[j] = Integer.MAX_VALUE;  
}  

for (int j = 1; j <= Y; j++)  
{  

for (int i = 0; i < s; i++)  
{  
if (coinsArr[i] <= j)  
{  

int subRes = dp[j - coinsArr[i]];  

if (subRes != Integer.MAX_VALUE && subRes + 1 < dp[j])  
{  
    dp[j] = subRes + 1;  
}         
}  
}  
}  
if(dp[Y]==Integer.MAX_VALUE)  
{  
 
return -1;  
}  
return dp[Y];  
}  

public static void main(String argvs[])  
{  

MinCoins1 obj = new MinCoins1();  
int coinsArr[] = {5, 10, 25};  
  
int s = coinsArr.length;  
int Y = 30;  
  
int ans = obj.minNoCoins(coinsArr, size, Y);  
System.out.println("For the sum "+ Y);  
System.out.println("The minimum number of required coins is: "+ ans);  
System.out.println("Using the following coins: ");  
for(int i = 0; i < s; i++)  
{  
System.out.print(coinsArr[i] + " ");     
}  
System.out.println("\n");  

int coinsArr1[] = {4, 3, 2, 6};  
Y = 15;  
size = coinsArr1.length;  
ans = obj.minNoCoins(coinsArr1, size, Y);  
System.out.println("For the sum "+ Y);  
System.out.println("The minimum number of required coins is: "+ ans);  
System.out.println("Using the following coins: ");  
for(int i = 0; i < size; i++)  
{  
System.out.print(coinsArr1[i] + " ");     
}  
}  
}  
