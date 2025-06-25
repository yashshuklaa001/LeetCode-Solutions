class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        // Loop through each character of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);

            // Compare it with characters at the same position in other strings
            for (int j = 1; j < strs.length; j++) {
                // If i is out of bounds or mismatch found
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return strs[0].substring(0, i);
                }
            }
        }

        // All characters of the first string matched
        return strs[0];
    }
}
