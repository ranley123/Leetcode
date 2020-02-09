/**
 * @id: 605
 * @ runtime: 1ms faster than 100%
 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int counter = 0;
        int empty = 1;
        
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 0){
                if(i == flowerbed.length - 1)
                    empty++;
                empty++;
            }
            else
                empty = 0;
            if(empty >= 3){
                counter++;
                empty = 1;
            }

        }
            
        return counter >= n;
    }
}
