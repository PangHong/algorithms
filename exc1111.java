public class exc1111 {
	public static void main(String[] args) {
		int M = 10, N = 10;
		boolean[][] a;
		a = new boolean[M][N];
		for(int i=0; i < M; i++){
			for(int j=0; j < N; j++){
				a[i][j] = StdRandom.random() > .5 ? true : false;				
			}
		}

		StdOut.println("test for a[0].length=" + a[0].length);
		StdOut.println("test for a.length=" + a.length);
		
		for(int i=0; i < M; i++){
			for(int j=0; j < N; j++){
				StdOut.print(a[i][j] == true ? "*":" ");			
			}
			StdOut.println();
		}
		
	}
}