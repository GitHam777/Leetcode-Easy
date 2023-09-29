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