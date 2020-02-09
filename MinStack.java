/*
 * id = 155
 */

public class MinStack {
	private final static int DEFAULT_SIZE = 1000;
    private int[] stack;
    private int[] minIndex; // 用于保存前n个数据的栈中最小元素的下标
    private int min = Integer.MAX_VALUE; // record the minimum element
    private int index = -1; // record the index of minimum element
    private int current = -1;

    public MinStack() {
        stack = new int[DEFAULT_SIZE];
        minIndex = new int[DEFAULT_SIZE];
    }

    public MinStack(int size) {
        stack = new int[size];
        minIndex = new int[size];
    }

    public void push(int x) {
        current++; 

        if (current >= stack.length) { 
            int[] tmp = new int[current * 2];
            System.arraycopy(stack, 0, tmp, 0, stack.length);
            stack = tmp;

            tmp = new int[current * 2];
            System.arraycopy(minIndex, 0, tmp, 0, minIndex.length);
            minIndex = tmp;
        }

        stack[current] = x; 

        if (x < min) { 
            min = x;
            index = current; 
        }

        minIndex[current] = index;
    }

    public void pop() {
        current--;
        if (current >= 0) {
            min = stack[minIndex[current]]; 
            index = minIndex[current]; // reset the index of minimum
        }
    }

    public int top() {

        if (current < 0) {
            throw new RuntimeException("No more data");
        }

        return stack[current];
    }

    public int getMin() {
        if (current < 0) {
            throw new RuntimeException("No more data");
        }

        return stack[minIndex[current]];
    }
}
