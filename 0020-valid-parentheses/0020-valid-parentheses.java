class Solution {
    private boolean isValid(char opening,char closing){
        return ((opening=='{' && closing=='}')||(opening=='[' && closing==']')||(opening=='(' && closing==')'));
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char charr : s.toCharArray()){
            if(charr=='(' || charr=='{' || charr=='['){
                stack.push(charr);
            }else if(!stack.isEmpty() && isValid(stack.peek() , charr)){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}