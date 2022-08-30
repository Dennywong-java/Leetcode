public class LC038CountandSay {
    public String countAndSay(int n) {
        if (n == 0) return null;
        if (n == 1) return "1";

        String[] dp = new String[n];
        dp[0] = "1";
        dp[1] = "11";

        for (int i = 2; i < n; i++) {
            String prev = dp[i - 1];
            StringBuilder sb = new StringBuilder();
            int count = 1;
            char curr = prev.charAt(0);

            for (int j = 1; i < prev.length(); j++) {
                if (prev.charAt(j) != curr) {
                    sb.append(count);
                    sb.append(curr);
                    curr = prev.charAt(j);
                    count = 1;
                } else {
                    count++;
                }
            }
            sb.append(count);
            sb.append(curr);
            dp[i] = sb.toString();
        }



        return dp[n - 1];
    }
}
