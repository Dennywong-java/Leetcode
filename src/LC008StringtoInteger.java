public class LC008StringtoInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("   -42"));
    }

    public static int myAtoi(String s) {
        // 去除0
        s = s.trim();
        // 验证数组有效性
        if (s.length() == 0) return 0;

        // 判断是正数还是还是负数
        boolean flag = true;
        int index = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            index = 1;
            if (s.charAt(0) == '-') {
                flag = false;
            }
        }

        // 读入digits
        int result = 0;
        for (int i = index; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) break;
            int temp = result * 10 + (s.charAt(i) - '0'); // '0' = 30;
            if (temp / 10 != result) return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = temp;
        }
        return flag ? result : -result;
    }
}
