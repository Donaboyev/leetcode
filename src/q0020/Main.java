package q0020;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        final Solution sn = new Solution();
        System.out.println(sn.isValid("}"));
    }
}

class Solution {
    public boolean isValid(String s) {
        int pa = 0, cu = 0, sq = 0;
        final Stack<Character> st = new Stack<>();
        final char[] cl = s.toCharArray();
        for (char c : cl) {
            switch (c) {
                case '(':
                    st.push('(');
                    pa++;
                    break;
                case ')':
                    pa--;
                    if (st.isEmpty() || st.pop() != '(') {
                        return false;
                    }
                    break;
                case '{':
                    cu++;
                    st.push('{');
                    break;
                case '}':
                    cu--;
                    if (st.isEmpty() || st.pop() != '{') {
                        return false;
                    }
                    break;
                case '[':
                    sq++;
                    st.push('[');
                    break;
                case ']':
                    sq--;
                    if (st.isEmpty() || st.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        return pa == 0 && cu == 0 && sq == 0;
    }
}
