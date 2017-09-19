public class exc117b{
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			StdOut.print(i);
			for(int j = 0; j < i; j++) {
				sum++;
				StdOut.print(" "+j+" ");
			}
			StdOut.println();
		}
		StdOut.println(sum);
	}
}