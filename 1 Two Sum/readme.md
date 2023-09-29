# Solutions

### Solution in C++

```C++
#include <iostream>
using namespace std;
int main(void)
{

}
```

### Solution in Java

```Java
import java.util.Scanner;

public class solution
{
    static int[] twoSum(int[] nums, int target) 
    {
        int[] answer = new int[2];
        int k = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    answer[k++] = i;
                    answer[k++] = j;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter Array length: ");
        n = sc.nextInt();
        int[] array = new int[n];
        System.out.print("Enter Array elements: ");
        for (int i = 0; i < n; i++) 
        {
            array[i] = sc.nextInt();
        }
        int value;
        System.out.print("Enter Target value: ");
        value = sc.nextInt();
        int[] answer = new int[2];
        answer = twoSum(array, value);
        System.out.print("The Answer Array is: ");
        for(int i = 0; i < answer.length; i++)
        {
            System.out.print(answer[i] + " ");
        }
        sc.close();
    }
}
```
