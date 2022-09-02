public class LC360SortTransformedArray {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int i = a >= 0 ? nums.length - 1 : 0;
        while (start <= end) {
            int startNum = getNum(nums[start], a, b, c);
            int endNum = getNum(nums[end], a, b, c);
            if (a >= 0) {
                if (startNum >= endNum) {
                    result[i--] = startNum;
                    start++;
                } else {
                    result[i--] = endNum;
                    end--;
                }
            } else {
                if (startNum <= endNum) {
                    result[i++] = startNum;
                    start++;
                } else {
                    result[i++] = endNum;
                    end--;
                }
            }
        }
        return result;
    }

    int getNum(int x, int a, int b, int c) {
        return a * x * x + b * x + c;
    }
}

