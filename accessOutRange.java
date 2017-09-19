//what happens when access over range a[a.length]
public class accessOutRange{
	public static void main(String[] args) {
		int[] a = {1,2,3};
		StdOut.print(0 != a[a.length]);
	}
}