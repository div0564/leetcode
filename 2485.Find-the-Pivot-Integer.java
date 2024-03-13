class Solution {
    public int pivotInteger(int n) {
        int j,i,k;  
        for(i=1;i<=n;i++)
        {
            int leftsum=0;
            int rightsum=0;
            for(j=1;j<=i;j++)
            {
                leftsum+=j;
            }
            for(k=i;k<=n;k++)
            {
                rightsum+=k;
            }
            if(leftsum==rightsum)
            {
                return i;
            }
        }
        return -1;
    }
}