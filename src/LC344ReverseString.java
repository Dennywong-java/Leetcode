public class LC344ReverseString {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        for (; left < right; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }

    public void reverseString2(char[] s) {
        int length = s.length;
        char temp;
        for (int i = 0; i < length / 2; i++) {
            temp = s[i];
            s[i] = s[length - 1 - i];
            s[length - 1 - i] = temp;
        }
    }
}
