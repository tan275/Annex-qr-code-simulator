#include <stdio.h>
 
int reverseDigits(int num)
{
    int rev_num = 0;
    while (num > 0) {
        rev_num = rev_num * 10 + num % 10;
        num = num / 10;
    }
    return rev_num;
}
 
int isPalindrome(int n)
{
     int rev_n = reverseDigits(n);
 
    if (rev_n == n)
        return 1;
    else
        return 0;
}
 
int main()
{
    int n = 4562;
    printf("Is %d a Palindrome number? -> %s\n", n,
           isPalindrome(n) == 1 ? "true" : "false");
    return 0;
}
