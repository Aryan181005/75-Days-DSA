package day_20;
import java.util.HashMap;

class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        int ans = -1;
        for(int key : freq.keySet()){
            if(key == freq.get(key)){
                ans = Math.max(ans,key);
            }
        }        
        return ans;
    }
}