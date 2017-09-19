// lg(N) = 2 ^ |_log_2(N)_|
public class exc1114 {
	public static int power(int x, int a){
		if(a == 0) return 1;
		return x*power(x, a - 1);
	}
	public static int lg(int N){
		int i = 0;
		while(N > 0) {
			N = N/2;
			i++;
		}
		return power(2, i-1);
	}
	public static void main(String[] args) {
		int N = 32;
		StdOut.println(N+" "+lg(N));
	}
}