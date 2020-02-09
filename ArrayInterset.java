import java.util.Arrays;
/*
 * id: 349
 * runtime: 3ms faster than 97%
 */
public class ArrayInterset {
	public int[] intersection(int[] nums1, int[] nums2) {
        /*Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        
        for(int num: nums1)
            set1.add(num);
        for(int num: nums2)
            if(set1.contains(num)) set2.add(num);
        
        int i = 0;
        int[] result = new int[set2.size()];
        for(int num: set2){
            result[i++] = num;
        }
        return result;*/
        
        //method 2: use the conquer part in merge sort
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int[] temp = new int[nums1.length];
        int i = 0; 
        int j = 0;
        int index = 0;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                if(index == 0 || temp[index - 1] != nums1[i]){
                    temp[index++] = nums1[i];
                }
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]){
                i++;
            }
            else j++;
        }
        
        
        return Arrays.copyOf(temp, index);
            
    }
}
