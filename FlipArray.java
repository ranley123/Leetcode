/*
 * id: 832
 * runtime: 6ms, faster than 97%
 */
public class FlipArray {
	public int[][] flipAndInvertImage(int[][] A) {
        int len = A.length;
        int[][] temp = new int[len][];
        for(int i = 0; i < len; i++){
            int lenc = A[i].length;
            temp[i] = new int[lenc];
            for(int j = 0; j < lenc; j++){
                temp[i][lenc - j - 1] = A[i][j] == 0? 1:0;
            }
        }
        return temp;
    }
}
