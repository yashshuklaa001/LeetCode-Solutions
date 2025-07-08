class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String str[] = path.split("/");
        for(String s:str){
            if(s.equals(".") || s.trim().length()==0){
                continue;
            }
            else if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(s);
            }
        }
        for(String ch : stack){
            sb.append("/");
            sb.append(ch);
        }
        return sb.toString().length()>0?sb.toString():"/";
    }
}