// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

// Example 2:
// Input: nums = [3,2,4], target = 6
// Output: [1,2]

// Example 3:
// Input: nums = [3,3], target = 6
// Output: [0,1] 

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