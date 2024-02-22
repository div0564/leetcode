/*
 * @lc app=leetcode id=2149 lang=java
 *
 * [2149] Rearrange Array Elements by Sign
 */

// @lc code=start
import java.util.Scanner;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int j=0,k=0;
        int [] pos = new int[(nums.length/2)];
        int [] neg = new int[(nums.length/2)];
        int [] rarr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                    pos[j]=nums[i];
                    j++;
            }   
            else
            {
                    neg[k]=nums[i];
                    k++;
            }
        }
        int l=0,z=0;
        for(int i=0;i<rarr.length;i++)
        {
            if(i%2==0)
            {
                rarr[i]=pos[l];
                l++;
            }
            else
            {
                rarr[i]=neg[z];
                z++;
            }
        }
        return rarr;
    }
    public static void main(String [] args){
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the even length of the array");
        n=s.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter equal no of positive and negative numbers ");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        Solution sc = new Solution();
        int rr [] = sc.rearrangeArray(arr);
        for(int i=0;i<rr.length;i++)
        {
            System.out.println(rr[i]);
        }
        
    }
}
// @lc code=end

