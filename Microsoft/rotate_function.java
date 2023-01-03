class Solution {
    public int maxRotateFunction(int[] nums) {
        int ans=0;
        int total=0;
        int n= nums.length;
        for(int i=0; i< n; i++) {
            ans+= i*nums[i];
            total+= nums[i];
        }
        int maxAns= ans;
        for(int i=1; i< n; i++) {
            ans= ans+total-(n*nums[n-i]);
            maxAns= Math.max(maxAns,ans);
        }
        return maxAns;
    }
}

