/*
 * @since: July 1st 2018
 * @level: easy
 * run time: 1 ms. faster than 100%
 * @order: 415
 * Add strings which are representing decimal numbers. They could be really big and you cannot use Bigintegers nor can you convert them into integers
 */
public class AddStrings {
	//     public String addStrings(String num1, String num2) {
// 		StringBuilder sb = new StringBuilder();
//         int carry = 0;
        
//         for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--){
//             int x = i < 0? 0 : num1.charAt(i) - '0';
//             int y = j < 0? 0 : num2.charAt(j) - '0';
            
//             sb.append((x + y + carry)%10);
//             carry = ((x + y + carry)/10);
//         }
//         return sb.reverse().toString();
// 	}
    
    public String addStrings(String num1, String num2) {
        char[] longn=null;
        char[]  shortn=null;
        int n1=0,n2=0,sum=0,carry=0;
        
        //put the longer number in long 
        if(num1.length() > num2.length()){
            longn = num1.toCharArray();
            shortn = num2.toCharArray();
        }
        else{
            shortn = num1.toCharArray();
            longn = num2.toCharArray();
       }
        char[] res=new char[longn.length+1];
        
        for(int i = longn.length - 1, j = shortn.length - 1, k = res.length - 1; i >= 0; i--, j--, k--){
            n1 = (int)(longn[i] - '0');
            if(j >= 0)
                n2 = (int)(shortn[j] - '0');
            else
                n2 = 0;
            sum = n1 + n2 + carry;
            carry = sum / 10;
            if(carry != 0)
                sum = sum % 10;
            res[k] = (char)(sum + '0');
        }
        if(carry != 0)
            res[0] = (char)(carry + '0');
        else 
            res[0] = ' ';
        String ret = new String(res);
        return (ret.trim());
    }
}
