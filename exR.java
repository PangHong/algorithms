/* algs4 excercise 1.1.16 */
public class exR{
	public static String exR1(int n) {
		if(n <= 0) return "";
		return exR1(n-3) + n + exR1(n-2) + n;
	}
	public static void main(String[] args) {
		StdOut.print(exR1(Integer.parseInt(args[0])));
	}	
}
