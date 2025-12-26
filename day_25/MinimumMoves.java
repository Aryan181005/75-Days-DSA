package day_25;

class Solution {
    public int minimumMoves(String s) {
        int moves = 0;
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i) == 'X'){
                moves += 1;
                i+=3;
            }else{
                i++;
            }
        }
        return moves;
    }
}