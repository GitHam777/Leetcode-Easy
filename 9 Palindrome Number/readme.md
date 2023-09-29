# Solutions

### Solution in C

```C
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
```

### Solution in C++

```C++
#include <iostream>
using namespace std;

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
    cout << "Enter a number: ";
    cin >> num;
    if (isPalindrome(num))
    {
        cout << "Number is palindrome";
    }
    else
    {
        cout << "Number is not palindrome";
    }
}
```

### Solution in Java

```Java
import java.util.Scanner;

class solution
{
    static boolean isPalindrome(int x) 
    {
        if(x < 0)
        {
            return false;
        }
        int rev = 0;
        int copy = x;
        while(copy != 0)
        {
            rev = rev * 10 + (copy % 10);
            copy = copy / 10;
        }
        if(rev == x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(isPalindrome(num))
        {
            System.out.print("Number is palindrome");
        }
        else
        {
            System.out.print("Number is not palindrome");
        }
        sc.close();
    }
}
```