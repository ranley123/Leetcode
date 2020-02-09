
/**
 * @id 56
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class MergeIntervals {
	public int[][] merge(int[][] intervals) {
		int len = intervals.length;
		if(len < 2){
			return intervals;
		}
		int counter = 0;

		outer: for(int i = 0; i < len; i++){
			for(int j = i + 1; j < len; j++){
				if(isOverlapped(intervals[i], intervals[j])){
					intervals[j] = mergeTwo(intervals[i], intervals[j]);
					intervals[i] = null;
					continue outer;
				}
			}
			counter++;
		}

		int[][] res = new int[counter][2];
		int j = 0;
		for(int i = 0; i < len; i++){
			if(intervals[i] != null){
				res[j++] = intervals[i];
			}
		} 
		return res;
	}

	private boolean isOverlapped(int[] range1, int[] range2){
		return !(range1[1] < range2[0] || range2[1] < range1[0]);
	}

	private int[] mergeTwo(int[] range1, int[] range2){
		int[] res = {Math.min(range1[0], range2[0]), Math.max(range1[1], range2[1])};
		return res;
	}
}
