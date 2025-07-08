class Solution {
    public boolean backspaceCompare(String s, String t) {
        String first = remaining(s);
        String second = remaining(t);
        return first.equals(second);
    }

    String remaining(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
