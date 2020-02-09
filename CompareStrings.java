import java.util.Arrays;

public class CompareStrings {
	static int[] compareStrings(String A, String B) {
		String[] As = A.split(" ");
		String[] Bs = B.split(" ");
		int[] a = new int[As.length];
		int[] b = new int[Bs.length];
		int[] res = new int[Bs.length];
		
		for(int i = 0; i < As.length; i++) {
			int counter = counter(As[i]);
			a[i] = counter;
		}
		for(int i = 0; i < Bs.length; i++) {
			b[i] = counter(Bs[i]);
		}
		for(int i = 0; i < Bs.length; i++) {
			int counter = 0;
			for(int j = 0; j < As.length; j++) {
				if(b[i] > a[j])
					counter++;
			}
			res[i] = counter;
		}
		return res;
	}
	
	static int counter(String str) {
		char[] arr = str.toCharArray();
		int res = 1;
		Arrays.sort(arr);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[i - 1])
				res++;
			else
				break;
		}
		return res;
	}
	
	public static void main(String[] args) {
		String A = "a a a";
		String B = "a";
		int[] res = compareStrings(A, B);
		for(int n: res)
			System.out.print(n);
	}
}
