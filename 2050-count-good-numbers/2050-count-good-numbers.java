class Solution {
    static final long MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;

        long res = (pow(5, even) * pow(4, odd)) % MOD;
        return (int) res;
    }
    private long pow(long base, long exp) {
        if (exp == 0) return 1;
        long half = pow(base, exp / 2);
        half = (half * half) % MOD;
        if (exp % 2 == 1) {
            half = (half * base) % MOD;
        }
        return half;
    }
}
