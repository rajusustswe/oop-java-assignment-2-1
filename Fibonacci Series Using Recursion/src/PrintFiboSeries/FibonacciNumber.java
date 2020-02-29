package PrintFiboSeries;

public class FibonacciNumber {
    public static int fibo(int n){
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String args[]){
        int n = 30;
        
        System.out.print("Fibonacci Series of "+ n+" numbers: ");
	for(int i = 0; i < n; i++){
            System.out.print(fibo(i) +" ");
	}
        System.out.print("\n");
    }
}
