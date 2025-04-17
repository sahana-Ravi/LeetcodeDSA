class Solution {
    public void reverseString(char[] s) {
        int i =0;
        int j = s.length - 1;
        char temp;
        while(j>i){
            temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
            i++;
        }
    }
}