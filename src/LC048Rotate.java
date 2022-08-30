public class LC048Rotate {
        public void rotate(int[][] matrix) {
            int length = matrix.length;
            //先上下调换
            /**
             * 先获取上面部分，然后再获取下面部分。 length/2意思是只交换一半，超过一半后就停止，否则就会交换两次等于没交换。
             */
            for(int i = 0; i < length / 2; i ++){
                int temp[] = matrix[i];
                matrix[i] = matrix[length - 1 - i];
                matrix[length - 1 - i] = temp;

            }
            //再对称旋转
            /**
             * 除去对角线，其他数字与其对角线那边的数字相互交换。
             */
            for (int i = 0; i < length; i++){
                for (int j = i + 1; j < length; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
}
