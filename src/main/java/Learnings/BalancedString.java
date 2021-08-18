package Learnings;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedString {

    public static void main(String[] args) {
        String balanced = "([{htrsfefe}])";
        String imbalanced = "([{grgsefre})]";
        String balancedWithWords="gfgdfd[%^%]";
        String imbalancedWithWords="gfgdfd[%{]^%}";
        System.out.println(checkStringIsBalanced(balanced));
        System.out.println(checkStringIsBalanced(imbalanced));
        System.out.println(checkStringIsBalanced(balancedWithWords));
        System.out.println(checkStringIsBalanced(imbalancedWithWords));

    }

    public static boolean checkStringIsBalanced(String example) {
        Deque<Character> stack
                = new ArrayDeque<Character>();
        String formulated=example.replaceAll("[a-zA-Z]","");
        for (int i = 0; i < formulated.length(); i++) {
            char e = formulated.charAt(i);
            if (e == '(' || e == '[' || e == '{') {
                stack.push(e);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (e) {
                case ')':
                    check=stack.pop();
                    if (check=='{' || check=='[')
                        return false;
                    break;
                case ']':
                    check=stack.pop();
                    if (check=='{' || check=='(')
                        return false;
                    break;
                case '}':
                    check=stack.pop();
                    if (check=='(' || check=='[')
                        return false;
                    break;

            }
        }
        return (stack.isEmpty());

    }
}
