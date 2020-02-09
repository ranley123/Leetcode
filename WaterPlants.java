
public class WaterPlants {
	static int minStepsWaterPlants(int[] plants, int capacity) {
		int res = 0;
		int cur = capacity;
		for(int i = 0; i < plants.length; i++) {
			if(cur >= plants[i]) {
				res++;
				cur -= plants[i];
			}
			else {
				res += 2 * i;
				cur = capacity;
				i--;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] plants = {1,1,1,1,1};
		int capacity = 1;
		System.out.println(minStepsWaterPlants(plants, capacity));
	}
}
