/**
 * id: 566
 * runtime: 3ms faster than 100%
 * @author ranley
 *
 */
public class ReshapeMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int length = nums.length;
        int width = nums[0].length;
        if(length * width != r * c){
            return nums;
        }
        int[][] res = new int[r][c];
        
        for(int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                res[i][j] = nums[(i*c + j) / width][(i*c + j) % width];
            }
        }
        return res;
    }
	
	public static void main(String[] args) {
		ReshapeMatrix one = new ReshapeMatrix();
		int[][] nums = {{1,2,3,4}};
		int[][] res = one.matrixReshape(nums, 2,2);
		for(int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(res[i][j]);
			}
			System.out.println();
		}
	}
}
