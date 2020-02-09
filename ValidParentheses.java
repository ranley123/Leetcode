import java.util.Stack;

/*
 * id: 20
 * runtime: 0ms faster than 100%
 */
public class ValidParentheses {
	// public boolean isValid(String s) {
    //     Stack<Character> stack = new Stack<>();
    //     char[] arr = s.toCharArray();
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{')
    //             stack.push(arr[i]);
    //         else{
    //             if(stack.isEmpty())
    //                 return false;
    //             char temp = stack.pop();
    //             if(arr[i] == ')' && temp == '(')
    //                 continue;
    //             else if(arr[i] == ']' && temp == '[')
    //                 continue;
    //             else if(arr[i] == '}' && temp == '{')
    //                 continue;
    //             else
    //                 return false;
    //         }
    //     }
    //     return stack.isEmpty();
    // }
    
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        int index = 0;
        char[] stack = new char[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{')
                stack[index++] = arr[i];
            else{
                if(index == 0)
                    return false;
                char temp = stack[--index];
                if(arr[i] == ')' && temp == '(')
                    continue;
                else if(arr[i] == ']' && temp == '[')
                    continue;
                else if(arr[i] == '}' && temp == '{')
                    continue;
                else
                    return false;
            }
        }
        return index == 0;
    }
}
