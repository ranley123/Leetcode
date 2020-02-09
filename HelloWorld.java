/*
 * Google
 */
public class HelloWorld {
	static public int minDecPartitions(int[] arr){
		int[] occupied = new int[arr.length];
		int counter = 0;
		
		for(int i = 0; i < arr.length; i++){
			if(occupied[i] == 1) 
				continue;
			int cur = arr[i];
			occupied[i] = 1;
			counter++;
			for(int j = i + 1; j < arr.length; j++) {
				if(occupied[j] == 1)
					continue;
				if(arr[j] < cur) {
					occupied[j] = 1;
					cur = arr[j];
				}
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		int[] trial = {5,4,3,2,1};
//		System.out.println(minDecPartitions(trial));
		for(int i = 0; i < 10 && i < trial[]; i) {
			
		}
	}
}
