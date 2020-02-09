import java.util.ArrayList;
import java.util.List;

/*
 * @since: July 6th 2018
 * @order: 728
 * @level: easy
 */
public class SelfDividing {
	public static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		for(int i = left; i <= right ; i++) {
			if(isSelfDividing(i)) {
				list.add(i);
			}
		}
		return list;
	}

	public static boolean isSelfDividing(int num) {
		int reminder = 0;
		int result = num;
		while(result != 0) {
			reminder = result % 10;
			if(reminder == 0) {
				return false;
			}
			if(num % reminder != 0) {
				return false;
			}
			else result = result / 10;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.print(isSelfDividing(21));
	}
}
