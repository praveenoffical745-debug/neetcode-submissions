class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int l=0,r=n-1;
        while(l<r)
        {
            int sum=nums[l]+nums[r];
            if(sum==target)
            {
                return new int[]{l,r};
            }
            else if(sum>target)
                {
                    r--;
                }
               
                else
                {
                    l++;
                }
            
        }
        return new int[]{-1,-1};
    }
}
