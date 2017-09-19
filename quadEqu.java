public class quadEqu{
	public static double[] quadratic_equation(double a, double b, double c){
		double delta = b*b - 4*a*c;
		double[] result = new double[0];
		if(delta < 0) {
			return result;
		}else if(delta == 0){
			result = new double[1];
			result[0] = (-b) / (2*a);
		}else{
			result = new double[2];
			result[0] = (Math.sqrt(delta) - b)/(2*a);
			result[1] = (-Math.sqrt(delta) - b)/(2*a); 
		}
		return result;
	}
	public static void print_quad_equa(double a, double b, double c){
		StdOut.printf("Quadratic Equation: %.2fx^2 + %.2fx + %.2f = 0\n", a, b, c);
	}
	public static void print_result(double[] result){
		if(result.length == 1){
			StdOut.printf("x only equal = %.2f\n", result[0]);
		}else if(result.length == 2){
			StdOut.printf("x1 = %.2f x2 = %.2f\n", result[0], result[1]);
		}else{
			StdOut.println("No real roots, but complex roots");
		}
	}
	public static void main(String[] args) {
		double[] test;
		double a = -9.8*0.5, b = 12, c = 1.5;
		print_quad_equa(a, b, c);
		test = quadratic_equation(a, b, c);
		print_result(test);
		a = 1; b = -4; c = 3;
		StdOut.println("test suit one");
		print_quad_equa(a, b, c);
		test = quadratic_equation(a, b, c);
		print_result(test);
		StdOut.println("test suit two");
		a = 1; b = 2; c = 1;
		print_quad_equa(a, b, c);
		test = quadratic_equation(a, b, c);
		print_result(test);
		StdOut.println("test suit three");
		a = 1; b = 1; c = 1;
		print_quad_equa(a, b, c);
		test = quadratic_equation(a, b, c);
		print_result(test);		
	}
}