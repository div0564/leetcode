/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start

import java.util.Scanner;
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        {
            return false;
        }
        return ((n&(n-1)) == 0);
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        Solution s = new Solution();
        boolean value = s.isPowerOfTwo(n);
        System.out.println(value);
    }
}
// @lc code=end

