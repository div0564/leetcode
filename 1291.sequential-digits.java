/*
 * @lc app=leetcode id=1291 lang=java
 *
 * [1291] Sequential Digits
 */

// @lc code=start
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        int x=0;
        for(int i=1;i<9;i++)
        {
            x=i;
            for(int j=i+1;j<10;j++)
            {
                x=(x*10)+j;
                if(x>=low && x<=high)
                {
                    ans.add(x);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int low=0,high=0;
        System.out.println("Enter low value ");
        low=sc.nextInt();
        System.out.println("Enter high value ");
        high=sc.nextInt();
        Solution s  = new Solution();
        List<Integer> list= s.sequentialDigits(low, high);
        // for(int x:list)
        // {
        //     System.out.println(x);
        // }

        //OR

        System.out.println(list);
    }
}
// @lc code=end

