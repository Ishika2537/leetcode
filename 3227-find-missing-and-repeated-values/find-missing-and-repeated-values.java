class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int n=grid.length;
       int a=0, b=0;
       HashSet<Integer> s=new HashSet<>();
       int [] ans=new int[2]; 
       int expSum=0, actSum=0;
       for(int i=0; i<n;i++)
       {
        for(int j=0;j<n;j++)
        {
            actSum+=grid[i][j]; 
            if(s.contains(grid[i][j]))
            {
                a=grid[i][j];
            }
            s.add(grid[i][j]);
        }
       }
       expSum=(n*n)*(n*n+1)/2;
       b=expSum+a-actSum;
       ans[0]=a;
       ans[1]=b;

       return ans;
    }
}