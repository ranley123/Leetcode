/*
 * @since: July 1st 2018
 * @level: easy
 * @order: 258
 * @runtime: 1ms faster than 100%
 */
public class AddEveryDigit {
	// method 1: use loop
    // public int addDigits(int num) {
    //     while(num > 9){
    //         int n = num;
    //         num = 0;
    //         while(n != 0){
    //             num += (n % 10);
    //             n /= 10;
    //         }
    //     }
    //     return num;
    // }
    
    // method 2: without loop
    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
