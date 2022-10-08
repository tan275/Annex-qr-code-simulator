#include <stdio.h>
int main()
{
     int i, first, last, middle, n, sv, array[20];
     
     printf("Enter number of elements:");
     scanf("%d", &n);
     
     printf("Enter %d integers:\n", n);
     for (i=0;i<n;i++)
        scanf("%4d", &array[i]);
    
    printf("Enter value to find\n");
    scanf("%d", &sv);
    first = 0;
    last = n - 1;
    middle = (first+last)/2;
    
    while (first <= last) 
    {
       if (array[middle] < sv)
          first = middle + 1;
       else if (array[middle] == sv) 
       {
           printf("%d Found at location %d.\n", sv, middle+1);
              break;
       }
       else
           last = middle - 1;
        middle = (first + last)/2;
    }
    
    if (first > last)
        printf("Not found\n", sv);
    return 0;
}