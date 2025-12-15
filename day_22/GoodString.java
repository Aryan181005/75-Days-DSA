package day_22;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        int first = 0;
        for(int f : freq){
            if(f > 0){
                first = f;
                break;
            }
        }

        for(int f : freq){
            if(f > 0 && f != first){return false;}
        }

        return true;
    }
}