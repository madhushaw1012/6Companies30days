import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st= new Stack<>();
        for(int i=0; i< tokens.length; i++) {
            if(tokens[i].equals("+")||tokens[i].equals("-")
            || tokens[i].equals("*")||tokens[i].equals("/")) {
                if(st.size()<2) return -1;
                int op2= st.pop();
                int op1= st.pop();
                int ans=0;
                switch(tokens[i].charAt(0)) {
                    case '+': ans= op1+op2;
                              break;
                    case '-': ans= op1-op2;
                              break;
                    case '*': ans= op1*op2;
                              break;
                    case '/': ans= op1/op2;
                              break;        
                }
                st.push(ans);
            } else {
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return st.pop();
    }
}