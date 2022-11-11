import jdk.jfr.internal.tool.Main;

import java.util.SortedMap;

public class LC20ValidParentheses {

    public static void main(String[] args) {
        String s = "()))((";
        boolean valid = isValid(s);
        System.out.println(valid);
    }


    public static boolean isValid(String s) {
        // 待匹配的左括号数量
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                // 遇到右括号
                left--;
            }

            // 右括号太多
            if (left == -1)
                return false;
        }
        // 是否所有的左括号都被匹配了
        return left == 0;
    }

}
