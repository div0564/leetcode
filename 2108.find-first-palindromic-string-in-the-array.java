/*
 * @lc app=leetcode id=2108 lang=java
 *
 * [2108] Find First Palindromic String in the Array
 */

// @lc code=start
import java.util.Scanner;
import java.lang.String;
import java.util.List;
class Solution{
    public static String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            String nstr = "";
            for(int j=words[i].length()-1;j>=0;j--)
            {
                nstr=nstr+words[i].charAt(j);
            }
            if(nstr.equals(words[i]))
            {
                return nstr;
            }
        }
        return "";
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter no of strings to be taken as input");
        n=sc.nextInt();
        String [] str = new String[n];
        System.out.println("Enter elements of string array");
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        System.out.println(firstPalindrome(str));

    }
}
// @lc code=end

