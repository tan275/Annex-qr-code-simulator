#include<stdio.h>
int main()
{
    int num,remain,store=0,compare;
    printf("enter the number ==  ");
    scanf("%d",&num);
    compare = num;

      while (num>0) 
      {
        remain = num%10;
        store = (remain*remain*remain) + store;
        num = num/10;
      }
      if(compare == store)
        printf("yes it is armstrong ");
      else 
      printf("not");
     return 0;
}


