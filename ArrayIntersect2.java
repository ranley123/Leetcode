import java.util.Arrays;
/*
 * id: 350
 * runtime: 3ms faster than 98%
 */
public class ArrayIntersect2 {
	public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int[] temp = new int[nums1.length];
        int i = 0; 
        int j = 0;
        int index = 0;
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                temp[index++] = nums1[i];
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
