import java.util.Arrays;

public class LC977SquaresofaSortedArray {
    //暴力解法
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }

    //双指针
    public int[] sortedSquares2(int[] nums) {
        int[] result = new int[nums.length];
        //pos从数组最后一位开始，得到的有序结果是降序的
        int i = 0, j = nums.length - 1, pos = nums.length - 1;
        // 执行双指针合并有序数组的逻辑
        for(;i<=j;){
            if(nums[i] * nums[i] > nums[j] * nums[j]){
                result[pos] = nums[i] * nums[i];
                i++;
            } else{
                result[pos] = nums[j] * nums[j];
                j--;
            }
            pos--;
        }
        return result;
    }
}
