class Solution {
    public boolean isPalindrome(int x){
        int reverseHlf = 0;
        if(x<0 || (x%10 == 0 && x != 0)) return false;
        while(x > reverseHlf){
            reverseHlf = reverseHlf*10 + x%10;
            x/=10;
        }
        return x == reverseHlf || x == reverseHlf/10;
    }
}