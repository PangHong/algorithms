public class firstDraw {
	public static double[][] generatePoints(int N){
		if(N <= 0) return null;
		double theta = 2*Math.PI / N;
		double[][] points = new double[N][2];
		for(int i = 0; i < N; i++){
			points[i][0] = Math.cos(i*theta);
			points[i][1] = Math.sin(i*theta);
		}
		return points;
	}

	public static int Gauss_acc(int N){
		int result=0;
		for(int i = 0; i < N; i++){
			for(int j = i+1; j < N; j++){
				result++;
			}
		}
		return result;
	}
	public static void generateAndDrawLines(double[][] points, double p){

		int count = 0, N = points.length;
		if(p <= 0) return ;

		StdDraw.setPenRadius(.01);
		StdDraw.setPenColor(StdDraw.BLUE);
		for(int i = 0; i < N; i++){
			for(int j = i+1; j < N; j++){
				if(Math.random() < p){
					StdDraw.line(points[i][0], points[i][1], points[j][0], points[j][1]);
				}
			}
		}
	}
	public static void drawDots(double[][] points) {
		int N = points.length;
		StdDraw.setPenRadius(.05);
		StdDraw.setPenColor(StdDraw.RED);
		for(int i = 0; i < N; i++){
			StdDraw.point(points[i][0], points[i][1]);
		}
	}

	public static void drawLines(double[][] lines) {
		int N = lines.length;

		for(int i = 0; i < N; i++){
			StdDraw.line(lines[i][0], lines[i][1], lines[i][2], lines[i][3]);
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
				
		StdDraw.setXscale(-2,2);
		StdDraw.setYscale(-2,2);
		StdDraw.setPenRadius(.01);
		StdDraw.circle(0,0,1);

		int N = Integer.parseInt(args[0]);
		double p = Double.parseDouble(args[1]);

		double[][] points = generatePoints(N);
		drawDots(points);
		StdOut.println("test for Gauss accumlation");
		StdOut.println(Gauss_acc(4));
		print_test_case(6 == Gauss_acc(4));
		generateAndDrawLines(points, p);
//		drawLines(lines);
	}
}