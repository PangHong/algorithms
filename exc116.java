public class exc116{
	//better Fibonacci function
	public static void main(String[] args) {
		long f = 0;
		long g = 1;
		for(int i = 0; i <= 50; i++) {
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
	}
}