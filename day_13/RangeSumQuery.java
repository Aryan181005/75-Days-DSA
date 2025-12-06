package day_13;

class NumArray {
    int[] sum;
    public NumArray(int[] nums) {
        sum = new int[nums.length+1];
        for(int i=1; i<nums.length+1; i++){
            sum[i] = sum[i-1] + nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return sum[right+1] - sum[left];
    }
}