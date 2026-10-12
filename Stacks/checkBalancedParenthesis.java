
import java.util.Stack;

public class checkBalancedParenthesis {

    boolean checkBalance(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char chr = st.peek();

                if ((ch == ')' && chr == '(') ||
                    (ch == ']' && chr == '[') ||
                    (ch == '}' && chr == '{')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        checkBalancedParenthesis obj = new checkBalancedParenthesis();

        System.out.println(obj.checkBalance("{[()]}"));
        System.out.println(obj.checkBalance("{[(])}"));
    }
}
