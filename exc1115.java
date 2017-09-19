public class exc1115{
	public static int[] histogram(int[] a, int M){
		int[] b = new int[M];
		int count;
		for (int i = 0; i < M; i++) {
			count = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[j] == i){
					count++;
				}
			}
			b[i] = count;
		}
		return b;
	}
	public static void print_array(int[] a) {
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i]);
		}
		StdOut.println();
	}
	public static void main(String[] args) {
		int N = 10;
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = (int)(StdRandom.random() * N);
		}
		print_array(a);
		print_array(histogram(a, a.length));

	}
}