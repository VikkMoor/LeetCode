package easy;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses res = new ValidParentheses();
        String test = "(){}[]()";
        System.out.println(res.isValid(test));
    }

    public char bracket(char r) {
        if (r == '(') return ')';
        if (r == '{') return '}';
        if (r == '[') return ']';
        return '1';
    }

    public boolean isValid(String s) {
        boolean a = true;
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            if (i + 1 < s.length()) {
                char s2 = s.charAt(i + 1);
                if (s2 != bracket(s1)) {
                    a = false;
                    break;
                }
                else{
                    i++;
                }
            } else {
                a = false; // without this 'else' if one more alone bracket in the end, result will be 'true'
            }
        }
        return a;
    }
}
