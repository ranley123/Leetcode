/*
 * id: 551
 * runtime:7ms faster than 90.3% 
 */
public class CheckRecord {
public boolean checkRecord(String s) {
        
        /*int counterA = 0;
        int counterL = 0;
        boolean L = false;
        
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            switch(temp){
                case 'A':if(counterA == 0) {counterA++;L = false; counterL = 0; }else{ return false;} break; 
                case 'L': if(L == true && counterL == 2) return false; else {L = true; counterL++;}  break;
                case 'P': L = false; counterL = 0; break;
                default: break;
            }
        }
        return true;*/
        
        char a[]=s.toCharArray();
        int u = 0;
        for(int i = 0;i < s.length(); i++) {
            if(a[i]=='A') {
                if(u < 1) u++;
                else return false;
            }
            
            if(i < s.length()-2) {
                if(a[i]=='L' && a[i + 1] == 'L' && a[i+2]=='L') return false;
            }
        }
        return true;
    }
}
