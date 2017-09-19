// Array exercise
public class exc1130{
	public static int GCD(int i, int j){
		if(i == 0 || j == 0){
			return 0;
		}
		int t;
		while(i%j != 0){
			t = i%j;
			i = j;
			j = t;
		}
		return j;
	}
	public static boolean is_rel_prime(int i, int j){
		if(GCD(i, j) == 1){
			return true;
		}else{
			return false;
		}
	}
	public static boolean[][] create_array(int M, int N){
		boolean[][] a = new boolean[M][N];
		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				a[i][j] = is_rel_prime(i, j);
			}
		}
		return a;
	}
	public static void print_array(boolean[][] a){
		int M = a.length;
		int N = a[0].length;

		StdOut.print("\\\\");
		for(int j=0; j < N; j++){
			StdOut.print(j);
		}
		StdOut.println();
		for(int i=0; i < M; i++){
			StdOut.printf("%2d", i);
			for(int j=0; j < N; j++){
				StdOut.print(a[i][j] == true ? "*":" ");
			}
			StdOut.println();
		}
	}

	// print test case
	public static void print_test_case(boolean p){
		if(p){
			StdOut.println("test success");
		}else{
			StdOut.println("test failure");
		}
	}

	public static void main(String[] args) {
		StdOut.println("test for %");
		print_test_case(3 == (3%7));
		StdOut.println("test for GCD");
		print_test_case(2 == GCD(20, 6));
		StdOut.println("test for GCD");
		print_test_case(4 == GCD(4, 8));
		StdOut.println("test for GCD 7, 3");
		print_test_case(1 == GCD(7, 3));
		StdOut.println(GCD(15,20)+"(15,20) " + GCD(3, 7) + "(3,7)");
		StdOut.println("test for GCD(15,20) and (20,15)");
		print_test_case(GCD(15,20) == GCD(20, 15));
		StdOut.println("test for GCD");
		print_test_case(0 == GCD(0, 0));
		StdOut.println("test for is_rel_prime");
		print_test_case(is_rel_prime(1, 2) == true);
		StdOut.println("test for is_rel_prime");
		print_test_case(is_rel_prime(2, 4) == false);
		int M = Integer.parseInt(args[0]);
		print_array(create_array(M, M));
	}
}