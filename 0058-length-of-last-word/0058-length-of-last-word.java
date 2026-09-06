class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int count = 0;

        for(int i = n-1; i >= 0; i--){
           
            // Skip spaces at the end
            if(s.charAt(i) == ' ' && count == 0) {
                continue;
            }

            // Stop when the last word ends
            if(s.charAt(i) == ' ') {
                break;
            }

            count++;
        }
        return count;
    }
}