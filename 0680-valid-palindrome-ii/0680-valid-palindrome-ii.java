class Solution {

    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        // Compare characters from both ends
        while (left < right) {

            // If characters match, continue moving inward
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            }

            // First mismatch
            else {

                // Try deleting the left character
                // OR deleting the right character
                return isPalindrome(s, left + 1, right)
                    || isPalindrome(s, left, right - 1);
            }
        }

        // No mismatch found
        // So the original string is already a palindrome
        return true;
    }


    // Checks whether s[left...right] is a palindrome
    private boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            // If characters don't match, it's not a palindrome
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            // Move toward the center
            left++;
            right--;
        }

        return true;
    }
}