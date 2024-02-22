/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
import java.util.Scanner;
class Solution {
    public int missingNumber(int[] nums) {
        int sum1=0,sum2=0;
        for(int i=0;i<=nums.length;i++)
        {
            sum1+=i;
        }
        for(int i=0;i<nums.length;i++)
        {
            sum2+=nums[i];
        }
        int missing = sum1-sum2;
        return missing;
    }
    public static void main(String [] args)
    {
        int n=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for n");
        n=sc.nextInt();
        int [] nums = new int[n];
        for(int i=0;i<n-1;i++)
        {
            nums[i]=sc.nextInt();
        }
        Solution s = new Solution();
        int missing = s.missingNumber(nums);
        System.out.println(missing);
    }
}
// @lc code=end

