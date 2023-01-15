class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
       for (int i =0;i<s.length();i++){
           char index = s.charAt(i);
           if (index == '(' || index == '[' ||index == '{'){
               stack.push(index);
               continue;
           }else {
               if(stack.empty()){
                   return false;
               }else {
                   char pivot = stack.pop();
                   if(index == ')' && (pivot == '[' || pivot == '{')){
                        return false;
                   }else if(index == '}' && (pivot == '[' || pivot == '(')){
                       return false;
                   } else if (index == ']' && (pivot == '(' || pivot == '{')) {
                       return false;
                   }
               }
           }
       }
        return stack.empty();
    }
}
