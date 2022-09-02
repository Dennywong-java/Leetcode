public class LC088MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //将两个指针分别指向两个数组的最后一位
        int i = m - 1, j = n - 1;

        //生成排序的结果
        int p = nums1.length - 1;

        //从后向前生成结果数组
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[p] = nums1[i];
                i--;
            } else {
                nums1[p] = nums2[j];
                j--;
            }
            p--;
        }
        // 可能其中一个数组的指针走到尽头了，而另一个还没走完
        // 因为我们本身就是在往 nums1 中放元素，所以只需考虑 nums2 是否剩元素即可
        while (j >= 0) {
            nums1[p] = nums2[j];
            j--;
            p--;
        }
    }
}
