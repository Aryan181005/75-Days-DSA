class Solution {
    public int[] plusOne(int[] digits) {
        int e = digits.length;
        
        for(int i=e-1;i>=0;i--){
            if(digits[i] < 9){
                digits[i]+=1;
                return digits;
            }else{
                digits[i]=0;
            }
        }

        int[] result = new int[e+1];
        result[0]=1;
        return result;
    }
}