// recursive method for compute ln(N!)
// ln(a*b)=? e^? = a*b
// ln(a) = ! e^! = a
// ln(b) = # e^# = b
// ln(a*b) = !+# e^!*e^# = a*b
// ln((N - 1)!*N) = ln((N-1)!) + ln(N)
// ln(0!) = ln(1) = 0;
public class exc1120 {
	public static int factorial(int N){
		if(N == 0) return 1;
		return factorial(N-1)*N; 
	}
	public static double ln(int N){
		return Math.log(factorial(N));
	}
	public static void main(String[] args) {
		StdOut.println(ln(2));
	}
}