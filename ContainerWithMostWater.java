/**
 * @id 11
 * @author ranley
 * @level middle
 * @runtime 4ms faster than 95.4%
 */
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        
//         while(left < right){
//             int area = Math.abs(right - left) * Math.min(height[left], height[right]);
//             if(area > max){
//                 max = area;
//             }
            
//             if(height[left] < height[right]){
//                 left++;
//             }
//             else{
//                 right--;
//             }
//         }
        
        while(left < right){
            int high = Math.min(height[left], height[right]);
            int area = Math.abs(right - left) * high;
            if(area > max){
                max = area;
            }
            while(left < right && height[left] <= high) left++;
            while(left < right && height[right] <= high) right--;
        }
        return max;
        
    }
}	
