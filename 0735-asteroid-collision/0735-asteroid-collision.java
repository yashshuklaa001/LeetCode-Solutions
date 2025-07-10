class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];
            while (!stack.isEmpty() && stack.peek() > 0 && curr < 0) {
                int top = stack.peek();
                if (Math.abs(curr) > top) {
                    stack.pop();
                } else if (Math.abs(curr) == top) {
                    stack.pop();
                    curr = 0;
                    break;
                } else {
                    curr = 0;
                    break;
                }
            }
            if (curr != 0) {
                stack.push(curr);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
