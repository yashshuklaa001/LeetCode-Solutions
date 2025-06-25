class Solution {
    public long countGoodIntegers(int n, int k) {
        Set<String> validPalindromes = new HashSet<>();
        int halfLength = (n + 1) / 2;
        int start = (int) Math.pow(10, halfLength - 1);
        int end = (int) Math.pow(10, halfLength);

        for (int i = start; i < end; i++) {
            String firstHalf = Integer.toString(i);
            String secondHalf = new StringBuilder(firstHalf.substring(0, n / 2)).reverse().toString();
            String fullPalindrome = firstHalf + secondHalf;

            long palNum = Long.parseLong(fullPalindrome);
            if (palNum % k == 0) {
                validPalindromes.add(fullPalindrome);
            }
        }

        Map<String, Boolean> counted = new HashMap<>();
        long count = 0;

        for (String palindrome : validPalindromes) {
            char[] digits = palindrome.toCharArray();
            Arrays.sort(digits);
            String sortedDigits = new String(digits);

            if (!counted.containsKey(sortedDigits)) {
                count += countPermutations(sortedDigits);
                counted.put(sortedDigits, true);
            }
        }

        return count;
    }

    private long countPermutations(String sortedDigits) {
        int[] freq = new int[10];
        for (char c : sortedDigits.toCharArray()) {
            freq[c - '0']++;
        }

        int n = sortedDigits.length();
        long numerator = factorial(n);
        long denominator = 1;
        for (int f : freq) {
            if (f > 1) {
                denominator *= factorial(f);
            }
        }

        long total = numerator / denominator;

        // Remove permutations starting with 0
        if (freq[0] > 0) {
            freq[0]--;
            long numerator0 = factorial(n - 1);
            long denominator0 = 1;
            for (int f : freq) {
                if (f > 1) {
                    denominator0 *= factorial(f);
                }
            }
            total -= numerator0 / denominator0;
        }

        return total;
    }

    private long factorial(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) res *= i;
        return res;
    }
}