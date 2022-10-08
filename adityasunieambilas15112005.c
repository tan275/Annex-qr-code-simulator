#include <stdio.h>
int main()
{
    int a, b, c;

    printf("enter number a:");
    scanf("%d", &a);
    printf("enter number b:");
    scanf("%d", &b);
    printf("enter number c:");
    scanf("%d", &c);
    printf("average of a b c is : %d", (a + b + c) / 3);

    return 0;
}