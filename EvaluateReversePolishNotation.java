/**
 * @id 150
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class EvaluateReversePolishNotation {
	//  public int evalRPN(String[] tokens) {
	//  Stack<Integer> stack = new Stack<>();
	//  for(String token: tokens){
	//      if(!isOperator(token)){
	//          stack.push(Integer.parseInt(token));
	//      }
	//      else{
	//          int operand2 = stack.pop();
	//          int operand1 = stack.pop();
	//          stack.push(operate(token, operand1, operand2));
	//      }
	//  }
	//  return stack.pop();
	//}

	//private boolean isOperator(String s){
	//  return (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"));
	//}

	//private int operate(String operator, int operand1, int operand2){
	//  if(operator.equals("+")){
	//      return operand1 + operand2;
	//  }
	//  else if(operator.equals("-"))
	//      return operand1 - operand2;
	//  else if(operator.equals("*"))
	//      return operand1 * operand2;
	//  else
	//      return (int)(operand1 / operand2);
	//}
	int index;
	public int evalRPN(String[] tokens) {
		index = tokens.length - 1;
		return helper(tokens);
	}

	private int helper(String[] tokens){
		int i = index;
		index--;

		if(tokens[i].equals("+"))
			return helper(tokens) + helper(tokens);
		else if(tokens[i].equals("-")){
			int operand1 = helper(tokens);
			return helper(tokens) - operand1;
		}
		else if(tokens[i].equals("*"))
			return helper(tokens) * helper(tokens);
		else if(tokens[i].equals("/")){
			int operand1 = helper(tokens);
			return helper(tokens) / operand1;
		}
		else
			return Integer.parseInt(tokens[i]);
	}
}
