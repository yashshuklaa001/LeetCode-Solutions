// class Solution {
//     public String makeGood(String s) {
//         Stack<Character> stack = new Stack<>();
//         for(char ch:s.toCharArray()){
//             if(!stack.isEmpty() && Math.abs(ch-stack.peek())==32){
//                 stack.pop();
//             }else{
//                 stack.push(ch);
//             }
//         }
//         StringBuilder sb = new StringBuilder();
//         for(char ch : stack){
//             sb.append(ch);
//         }
//         return sb.toString();
//     }
// }
class Solution {
    public String makeGood(String s) {
        StringBuilder stack=new StringBuilder();
        for(char c:s.toCharArray()){
           
            if(!stack.isEmpty()){
            char sc=stack.charAt(stack.length()-1);
            if(sc!=c && Character.toLowerCase(sc)==Character.toLowerCase(c))
             stack.deleteCharAt(stack.length()-1);
            else stack.append(c);
            }
             else stack.append(c);
        }

        return stack.toString();
    }
}