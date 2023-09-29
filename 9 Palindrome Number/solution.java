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