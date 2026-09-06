class Solution {
    public String reverseWords(String s) {

        // Remove leading/trailing spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");

        // StringBuilder is used to efficiently build the answer
        StringBuilder ans = new StringBuilder();

        // Traverse the words from right to left
        for (int i = words.length - 1; i >= 0; i--) {

            // Add the current word
            ans.append(words[i]);

            // Add a space between words, but not after the last word
            if (i != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}