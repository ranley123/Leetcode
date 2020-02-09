/**
 * @id 875
 * @author ranley
 * @level middle
 * @runtime 4ms faster than 99.34%
 */
public class KokoEatingBananas {
	// method 1: binary search
//	public int minEatingSpeed(int[] piles, int H) {
//        int max = 0;
//        for(int pile: piles){
//            max = Math.max(max, pile);
//        }
//        int left = 1;
//        int right = max;
//        while(left >= 0 && left <= right){
//            int mid = (left + right) / 2;
//            if(mid == 0)
//                break;
//            int hrs = eatingHrs(piles, mid);
//            if(hrs <= H){
//                right = mid - 1;
//            }
//            else
//                left = mid + 1;
//        }
//        return left;
//    }
//    
//    private int eatingHrs(int[] piles, int k){
//        int hrs = 0;
//        for(int pile: piles){
//            hrs += pile / k;
//            if(pile % k != 0)
//                hrs += 1;
//        }
//        return hrs;
//    }
	
	// method 2
    public int minEatingSpeed(int[] piles, int H) {
        long sum = 0;
        int max = 0;
        for(int i:piles){
            sum += i;
            max = Math.max(i,max);
        }
        int min = (int)Math.ceil((double)sum/H);
        int ans = Integer.MAX_VALUE;
        
        // perform search
        for(int i=min;i<=max;i++) {
            int day = 0;
            for(int p:piles){   
                day += (int)Math.ceil((double)p/i);
            }
            if(day<=H) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}
