/*
 * id: 509
 * runtime: 1ms faster than 100%
 */
public class FibonacciNumber {
	public int fib(int N) {
        // method 1: recursion way
        /*if(N <= 1) return N;
        return fib(N - 1) + fib(N - 2);*/
        
        //method 2:
        /*
        if(N <= 1) return N;
        int a=0, b=1, c;
        for(int i = 2; i<=N; i++){
            c = a+b;
            a = b;
            b = c;
            
        }
        return b;
        */
        
        //method 3
        if(N <= 1) return N;
        
        int[] F = new int[N+1];
        F[0] = 0;
        F[1] = 1;
        
        for(int i=2; i<=N; i++)
        {
            F[i] = F[i-1] + F[i-2];
        }
        return F[N];
    }
}
