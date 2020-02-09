/*
 * id: 167
 * runtime: 0ms faster than 98%
 */
public class Twosum2 {
	public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if(numbers == null || numbers.length < 2) return res;
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum < target)
                left++;
            else if(sum > target)
                right--;
            else{
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }
        }
        return res;
    }
	
}
