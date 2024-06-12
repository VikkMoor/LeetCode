package easy;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        ValidParentheses res = new ValidParentheses();
        String test = "(){[()]}";
        System.out.println(res.isValid(test));
    }


    public boolean isValid(String s) {
        // for the case as ((:
        boolean a = s.charAt(s.length() - 1) != '(' && s.charAt(s.length() - 1) != '{' && s.charAt(s.length() - 1) != '[';

        if (s.length() % 2 != 0) {
            a = false;
        } else {
            // create the map(key, value) to set brackets compliance:
            Map<Character, Character> both = new HashMap<>();
            both.put(')', '(');
            both.put('}', '{');
            both.put(']', '[');
            // create deque to use it like a stack:
            Deque<Character> stack = new LinkedList<>();
            for (char i : s.toCharArray()) { // for each i(char) in string s;
                if (both.containsValue(i)) { // if some value in map "both" includes "i";
                    stack.push(i); // if opening bracket, so push it to the end of deque;
                } else if (both.containsKey(i)) { // if some key in map "both" includes "i";
                    if (stack.isEmpty() || stack.pop() != both.get(i)) {
                        a = false; /* both.get(i) - returns value for key "i" from "both" map;
                                  stack.pop() - returns and removes the last char in queue "stack";*/
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) a = false; // for the case as [[[];
        }
        return a;
    }
}
