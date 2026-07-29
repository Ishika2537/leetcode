class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pos=0;
        int neg=1;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
               ans[pos]=nums[i];
               pos+=2;
            }
            else
            {
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;
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
        Solution sol = new Solution();
        int res[] = sol.rearrangeArray(arr);
        for(int num: res)
        {
            System.out.println(num);
        }
    }
}