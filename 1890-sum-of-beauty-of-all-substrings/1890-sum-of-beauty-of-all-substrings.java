class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int total = 0;
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for (int val : map.values()) {
                    max = Math.max(max, val);
                    min = Math.min(min, val);
                }

                total += (max - min);
            }
        }
        return total;
    }
}
