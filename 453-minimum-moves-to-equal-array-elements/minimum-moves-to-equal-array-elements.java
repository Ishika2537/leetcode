class Solution {
    public static int minMoves(int[] nums) {
    int min = Integer.MAX_VALUE;
    int sum = 0;

    for (int num : nums) {
        min = Math.min(min, num);
        sum += num;
    }

    return sum - (nums.length * min);
    }
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(minMoves(arr));
    }
}