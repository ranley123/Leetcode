/*
 * id: 657
 * runtime: 5ms faster than 99.85%
 */
public class RobotOrigin {
	public boolean judgeCircle(String moves) {
        //the first one indicates vertical, the second one indicates horizontal
        /*int[] move = new int[2];
        char[] arr = moves.toCharArray();
        
        for(int i = 0; i < arr.length; i++){
            switch(arr[i]){
                case 'U': move[0]++; break;
                case 'D': move[0]--; break;
                case 'L': move[1]++; break;
                case 'R': move[1]--; break;
            }
        }
        
        return (move[0] == move[1]) && (move[0] == 0); */
        
        int []move = new int[26];
        for(char c:moves.toCharArray()){
            move[c -'A']++;
        }
        return move['L'-'A'] == move['R'-'A'] && move['U'-'A'] == move['D'-'A'];
    }
}
