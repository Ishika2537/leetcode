class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        Set<Integer> mp=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(mp.contains(nums[i]))
            {
                return true;
            }
            mp.add(nums[i]);
        }
        return false;
    }
}