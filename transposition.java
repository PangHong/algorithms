//excercise 1.1.13
public class transposition {
	public static void print_Matrix(int[][] m){
		int R = m.length;
		int C = m[0].length;
		StdOut.print("[");
		for(int k = 0; k < C; k++){
			StdOut.print(" ");
		}
		StdOut.println("]");
		for (int i = 0; i < R; i++) {
			StdOut.print("|");
			for (int j = 0; j < C; j++) {
				StdOut.print(m[i][j]);
			}
			StdOut.println("|");
		}
		StdOut.print("[");
		for(int k = 0; k < C; k++){
			StdOut.print(" ");
		}
		StdOut.println("]");
	}
	public static void trans(int[][] a){
		int M_old = a.length;
		int N_old = a[0].length;
		int[][] b = new int[N_old][M_old];
		for(int i = 0; i < N_old; i++){
			for(int j = 0; j < M_old; j++){
				b[i][j] = a[j][i];
			}
		}
		print_Matrix(b);
	}
	public static void main(String[] args) {
		int M = 3, N = 4;
		int[][] a;
		a = new int[M][N];
		for(int i = 0; i < M; i++){
			for(int j = 0; j < N; j++){
				a[i][j] = i >= j ? 1 : 0;
			}
		}
		print_Matrix(a);
		trans(a);
	}
}