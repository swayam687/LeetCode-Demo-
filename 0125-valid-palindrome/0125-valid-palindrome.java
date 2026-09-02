class Solution {
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while(i < j) {

            // Skip characters that are not letters or numbers
            if(!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }

            // Compare characters ignoring uppercase/lowercase
            if(Character.toLowerCase(s.charAt(i)) != 
               Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}