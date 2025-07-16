class Solution {
    public int bitwiseComplement(int n) {
        int count = Integer.toBinaryString(n).length();
        int mask = (1<<count)-1;
        return mask^n;

    }
}