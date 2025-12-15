package day_21;

class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        int idx = 0;
        for(int i=0;i<n;i++){
            if(arr[i] != ' '){
                if(idx > 0){
                    arr[idx++] = ' ';
                }
                while(i < n && arr[i] != ' '){
                    arr[idx++] = arr[i++];
                }
            }
        }

        reverse(arr,0,idx-1);

        int start = 0;
        for(int end = 0; end <= idx; end++){
            if(end == idx || arr[end] == ' '){
                reverse(arr,start,end-1);
                start = end + 1;
            }
        }
        return new String(arr,0,idx);
    }

    private void reverse(char arr[], int l, int r){
        while(l < r){
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}
