class Solution {
    public List<String> validStrings(int n) {
         List<String> result = new ArrayList<>();
        backtrack(n, "", 1, result);
        return result;
    }
    private static void backtrack(int n, String current, int prev, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        backtrack(n, current + "1", 1, result);
        if (prev !=0) {
            backtrack(n, current + "0", 0, result);
        }
    }
}