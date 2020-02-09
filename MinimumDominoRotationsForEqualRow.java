/**
 * @id 1007
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class MinimumDominoRotationsForEqualRow {
	//  public int minDominoRotations(int[] A, int[] B) {
	//  int[] a = new int[7];
	//  int[] b = new int[7];
	//  int[] same = new int[7];

	//  for(int i = 0; i < A.length; i++){
	//      if(A[i] == B[i])
	//          same[A[i]]++;
	//      a[A[i]]++;
	//      b[B[i]]++;
	//  }
	//  for(int i = 1; i < 7; i++){
	//      if(a[i] + b[i] - same[i] == A.length)
	//          return Math.min(A.length - a[i], A.length - b[i]);
	//  }

	//  return -1;
	//}
	public int minDominoRotations(int[] A, int[] B) {
		for(int i = 1; i < 7; i++){
			int res = helper(A, B, i);
			if(res != -1)
				return res;
		}
		return -1;
	}

	private int helper(int[] A, int[] B, int num){
		int a = 0;
		int b = 0;
		for(int i = 0; i < A.length; i++){
			if(A[i] != num && B[i] != num)
				return -1;
			if(A[i] != num || B[i] != num){
				if(A[i] != num)
					a++;
				if(B[i] != num)
					b++;
			}
		}
		return Math.min(a, b);
	}
}


