class Solution {
    public boolean isPalindrome(String s) {
        // Preprocess: convert to lowercase and remove non-alphanumeric characters
    //     StringBuilder cleaned = new StringBuilder();

    //     for (char c : s.toCharArray()) {
    //         if (Character.isLetterOrDigit(c)) {
    //             cleaned.append(Character.toLowerCase(c));
    //         }
    //     }

    //     return isPalindromeRecursive(cleaned.toString(), 0, cleaned.length() - 1);
    // }

    // // Recursive helper function
    // private boolean isPalindromeRecursive(String s, int left, int right) {
    //     if (left >= right) {
    //         return true; // Base case: reached the middle
    //     }

    //     if (s.charAt(left) != s.charAt(right)) {
    //         return false; // Mismatch
    //     }

    //     // Recursive call for the next pair
    //     return isPalindromeRecursive(s, left + 1, right - 1);
    StringBuilder clean = new StringBuilder();
    for(char c:s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
            clean.append(Character.toLowerCase(c));
        }
    }
    return isPalindrome(clean.toString(),0,clean.length()-1);
    }
    private boolean isPalindrome(String s,int left,int right){
        if(left>=right){
            return true;
        }
        else if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
       return isPalindrome(s,left+1,right-1);
    }
}
