import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int start = 0;

        Set<Character> seen = new HashSet<>();

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            // Shrink the window from the left if duplicate is found
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(start));
                start++;
            }

            // Add current character to the set
            seen.add(currentChar);

            // Update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
