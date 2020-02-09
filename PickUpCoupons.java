import java.util.Arrays;

public class PickUpCoupons {
	static int minPickUpCoupons(int[] coupons) {
		int[] range = new int[10];
		int min = coupons.length + 1;
		Arrays.fill(range, -1);
		int start = 0;
		for(int i = 0; i < coupons.length; i++) {
			if(range[coupons[i]] == -1 || i < start)
				range[coupons[i]] = i;
			else {
				start = range[coupons[i]] + 1;
				min = Math.min(min, i - range[coupons[i]] + 1);
				range[coupons[i]] = i;
			}
		}

		return min == (coupons.length  + 1)? -1 : min;
	}
	
	public static void main(String[] args) {
//		int[] coupons = {1,3,4,2,3,4,5,8};
		int[] coupons = {2,5,0,3};


		System.out.println(minPickUpCoupons(coupons));
	}
}
