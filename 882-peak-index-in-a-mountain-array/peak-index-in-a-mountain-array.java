class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i+1]<arr[i])
            {
                return i;
            }
        }
        return 0;
    }
}