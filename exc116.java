public class exc116{
	//better Fibonacci function
	public static long better_Fibonacci(long N){
		long f = 0;
		long g = 1;
		for(int i = 0; i <= N; i++) {
			f = f + g;
			g = f - g;
		}
		return g;
	}
	// print test case
	public static void print_test_case(boolean p){
		StdOut.println("--TEST--");
		if(p){
			StdOut.println("test success");
		}else{
			StdOut.println("test failure");
		}
	}
	public static void main(String[] args) {
		print_test_case(0 == better_Fibonacci(0));
		print_test_case(1 == better_Fibonacci(1));
		print_test_case(1 == better_Fibonacci(2));
		print_test_case(2 == better_Fibonacci(3));
		print_test_case(3 == better_Fibonacci(4));
	}
}