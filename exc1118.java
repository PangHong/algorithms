// how a * b was caluculate in computer
public class exc1118 {
	public static int mystery(int a, int b) {
		if(b == 0) return 0;
		if(b%2 == 0) return mystery(a+a, b/2);
		return mystery(a+a, b/2) + a;
	}
	public static void main(String[] args) {
		StdOut.println(mystery(2, 25));
		StdOut.println(mystery(3, 11));
		int test = mystery(1, 1);
		if(test == 1){
			StdOut.printf("+test mystery=%d success\n", test);
		}else{
			StdOut.printf("-test mystery=%d failure\n", test);
		}
		test = mystery(1, 2);
		if(test == 2){
			StdOut.printf("+test mystery=%d success\n", test);
		}else{
			StdOut.printf("-test mystery=%d failure\n", test);
		}
		test = mystery(2, 3);
		if(test == 6){
			StdOut.printf("+test mystery=%d success\n", test);
		}else{
			StdOut.printf("-test mystery=%d failure\n", test);
		}
	}
}