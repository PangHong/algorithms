public class binomial {
	public static double binomial_distribution(int N, int k, double p){
		if(N == 0 && k == 0) return 1.0;
		else if(N < 0 || k < 0) return 0;
		return (1-p) *
		binomial_distribution(N-1, k, p) 
		+ 
		p*binomial_distribution(N-1, k-1, p);
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
		StdOut.println(binomial_distribution(10,1,.5));
		double error = 1e-15;
		print_test_case((.18 - binomial_distribution(2,1,.1)) < error);
	}
}