package day_03;

class Solution {
    public int missingNumber(int[] nums) {
        int arrSum = 0;
        int nSum = (nums.length*(nums.length+1))/2;
        for(int i=0;i<nums.length;i++){
            arrSum += nums[i];
        }

        return nSum - arrSum;
    }
}