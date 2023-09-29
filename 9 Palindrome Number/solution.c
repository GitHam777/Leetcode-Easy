#include <stdio.h>
#include <stdbool.h>

bool isPalindrome(int x)
{
    if (x < 0)
    {
        return false;
    }
    long rev = 0;
    int copy = x;
    while (copy != 0)
    {
        rev = rev * 10 + (copy % 10);
        copy = copy / 10;
    }
    if (rev == x)
    {
        return true;
    }
    else
    {
        return false;
    }
}

int main(void)
{
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    if (isPalindrome(num))
    {
        printf("Number is palindrome");
    }
    else
    {
        printf("Number is not palindrome");
    }
}