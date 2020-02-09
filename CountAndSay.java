/*
 * id: 38
 * runtime: 2ms faster than 97%
 */
public class CountAndSay {
	public static String countAndSay(int n) {
        if(n == 1) return "1";
        int counter = 1;
        char last = ' ';
        String lastResult = "1";
        String current = "";
        
        while(n > 1){
        	
        	current = "";
            for(int i = 0; i < lastResult.length(); i++){
                char letter = lastResult.charAt(i);
                
                if(letter == last) {
                	counter++;
                	//System.out.println("hi" + n);
                }
                else if(last == ' ') last = letter;
                else{
                    current += counter + "" + String.valueOf(last);
                    counter = 1;
                    last = letter;
                }
            }
            current += counter + "" + String.valueOf(last);
            
            counter = 1;
            lastResult = current;
            last = ' ';
            n--;
        }
        
        return current;
           
    }
	
	public static void main(String[] args) {
		System.out.println(countAndSay(3));
	}
}
