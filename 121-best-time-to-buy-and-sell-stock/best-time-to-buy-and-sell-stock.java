class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        int cost=0;
        for(int i=0;i<prices.length;i++)
        {
            cost=prices[i]-min;
            profit=Math.max(profit, cost);
            min=Math.min(min, prices[i]);
        }
        return profit; 
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Solution sol=new Solution();
        System.out.println(sol.maxProfit(arr));
    }
}