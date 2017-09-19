public class exc119 {
	public static int power(int x, int a){
		if(a==0) return 1;
		return x*power(x, a-1);
	}

	public static void binary(int N) {
		StdOut.println(N);
		String s ="";
		int bit = 32;
		//N = N > 0 ? N : -N;
		while(N > 0 || bit > 0){
			s = N%2 + s;
			N = N/2;
			bit--;
		}
		// N < 0 binary 
		//
		StdOut.printf("binary code:\n%32s\n", s);
	}

	public static void main(String[] args) {
		int N;
		if(args.length > 0){
			N = Integer.parseInt(args[0]);
		}else{
			N = power(2, 31) - 1;
		}
		binary(N);
		int N_1;
		N_1 = -power(2, 31);
		binary(N_1);
		int N_2;
		N_2 = power(2, 31);
		binary(N_2);
		int N_3;
		N_3 = -power(2, 31)+1;
		binary(N_3);
	}
}