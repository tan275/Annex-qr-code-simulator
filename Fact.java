import java.util.*;
class Fact{
  public static void main(String arg[]){
     int i;
     Scanner sc = new Scanner(System.in);
     System.out.print("enter number to find factorial:");
     int n=sc.nextInt();
     long s=System.nanoTime();
     int fact=1;
     for(i=1;i<=n;i++)
     {
       fact=fact*i;
     }
     long e = System.nanoTime();
     long total = e-s;
     System.out.println("total time is: "+total);
     System.out.println("factorial of given number is: "+fact);
  }
}