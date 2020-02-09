/*
 * @since: July 3rd 2018
 * @level: easy
 * @order: 605
 * 
 */
public class FlowerBed {
	public static boolean flower(int[] flowerbed, int n) {
		int number = 0;
		int lastIndex = 0;
		int first = 0;
		int last = 0;

		if(flowerbed[0] == 0) {
			first = -1;
			lastIndex = -1;
		}
		if(flowerbed[flowerbed.length - 1] == 0) {
			last = flowerbed.length;
		}
		if(allZeros(flowerbed)) {
			//last + 1 is to offset the index - 1 in the forward method
			number = forward(flowerbed, last + 1, first);
			return n <= number;
		}
		

		for(int i = 0; i < flowerbed.length; i++) {
			if(flowerbed[i] == 1) {
				if(i == 0) {
					number = number + forward(flowerbed, i, first);
				}
				else number = number + forward(flowerbed, i, lastIndex);
				
				lastIndex = i;
			}
			else {
			    if(i == flowerbed.length - 1) {
					number = number + forward(flowerbed, last, lastIndex);
				}
			}
		}

		if(n > number) return false;
		else return true;
	}

	public static int forward(int[] nums, int index, int lastIndex) {
		int reminder = (index - 1 - lastIndex) %2;
		int blocks = (index - 1 - lastIndex) / 2;
		if(index == 0) {
			return 0;
		}
		
		if(reminder == 0 && (lastIndex != -1 && index != nums.length)) {
			blocks--;
		}
		System.out.println(blocks );
		return blocks;
	}
	
	public static boolean allZeros(int[] nums) {
		for(int num: nums) {
			if(num != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] nums = {0,0,1,0,1};
		System.out.println(flower(nums, 1));
	}


}
