public class LC007ReverseInteger {

    public static void main(String[] args) {
        int number =-1232222;
        System.out.println(reverse(number));
    }

    public static int reverse(int x) {
        int result = 0;
        while(x != 0){
            int ge = x % 10;
            int newResult = result * 10 + ge;
            x = x / 10;

            //判断是否有溢出
            if((newResult - ge) / 10 != result) return 0;

            result = newResult;
        }
        return result;
    }
}
