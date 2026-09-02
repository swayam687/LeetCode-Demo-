class Solution {
    public String longestCommonPrefix(String[] strs) {
       

        // Store the first string as our initial possible prefix
        String prefix = strs[0];

        // Start checking from the second string
        for(int i = 1; i < strs.length; i++) {

            // Keep reducing prefix until the current string starts with prefix
            while(!strs[i].startsWith(prefix)) {

                // Remove the last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, there is no common prefix
                if(prefix.length() == 0) {
                    return "";
                }
            }
        }

        // Return the longest common prefix found
        return prefix;
    }
}