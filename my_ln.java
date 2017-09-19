// there is a problem in ln(x)
// the percision is not accurate
public class my_ln{
	public static double power(double x, int N){
		if(N == 0){
			return 1;
		}else{
			return x*power(x, N - 1);
		}
	}
	public static double recursive(double x, int N){
		if(N == 1){
			return (x-1);
		}else{
			if(N % 2 == 1){
				return power(x-1, N)/N + recursive(x, N-1);
			}else{
				return -power(x-1, N)/N + recursive(x, N-1);
			}
		}
	}
	public static double ln(double x, int N){
		//N is iterator times
		double result = 0;
		if(x <= 0){
			return Double.NEGATIVE_INFINITY;	
		} else if(x <= 2){
			return recursive(x, N);
		} else{
			while(x > 2){
				x = x/2;
				result += recursive(2, N);
			}
			return recursive(x, N) + result;
		}

	}
	public static void main(String[] args) {
		double x = 2;
		int N = 3;
		StdOut.println("test for power");
		if(power(x, N) == 8){
			StdOut.println("test success");
			StdOut.printf("%.2f power %d = %.2f", x, N, power(x, N));
		}else{
			StdOut.println("test failure");
		}
		StdOut.println("test for recursive");
		N = 1;
		if(recursive(x, N) == 1){
			StdOut.println("test success");
			StdOut.printf("(x-1) = (%.2f-1) = %.2f\n", x, recursive(x, N));
		}else{
			StdOut.println("test failure");
		}
		StdOut.println("test for recursive two");
		N = 2;
		if(recursive(x, N) == -0.5 + 1){
			StdOut.println("test success");
			StdOut.printf("-(%.2f-1)^%d/%d = %.2f\n", x, N, N,recursive(x, N));
		}else{
			StdOut.println("test failure");
		}
		StdOut.println("test for ln");
		N = 1000;
		x = Double.parseDouble(args[0]);
		for(int i = 1; i < N; i++){
			StdOut.printf("N = %d\n", i);
			StdOut.printf("ln(%.2f) = %f\n",x , ln(x, i));
		}
	}
}