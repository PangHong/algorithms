public class Euler_Method{
	public static double f(double x) {
		return 3*x - 4;
	}
	public static double g(double x) {
		return x*x + 2*x + 1;
	}
	public static double h(double x) {
		return x*x - 5*x + 7; 
	}
	public static void EulerMethod_g(double x_start, double x_end, double F, double h) {
		/*
		for(double i = x_start; i < x_end+h; i+=h){
			System.out.printf("F(x=%.2f) = %.2f\n", i, F);
			F = g(i)*h + F;
		}
		replaced by below*/
		int N = (int)(Math.round(Math.abs(x_end - x_start)/h));
		for(int i = 0; i <= N; i++){
			double x = x_start+h*i;
			System.out.printf("F(x=%.2f) = %.2f\n", x, F);
			F = g(x)*h + F;
		}
	}
	//because a static method cannot take another
	// static method as an argument in java
	public static void EulerMethod(double x_start, double x_end, double F, double h) {
		int N = (int)(Math.round(Math.abs(x_end - x_start)/h));
		for(int i = 0; i <= N; i++){
			double x = x_start+h*i;
			System.out.printf("F(x=%.2f) = %.2f\n", x, F);
			F = h(x)*h + F;
		}
	}
	//there is a problem where
	// "i <= x_end"
	//or "i < x_end + h"
	//or N = Integer.parseInt(Math.round((x_end - x_start)/h));
	// i < N, i start 0
	public static void main(String[] args) {
		System.out.println("Exercises 10.2 (8)");
		double x_start = 1, F = 5, x_end = 2, h = 0.2;
		for(double i = x_start; i <= x_end; i+=h) {
			StdOut.printf("F(x=%.2f)=%.3f\n", i, F);
			F = f(i)*h + F;
		}
		System.out.println("Exercises 10.2 (9)");
		EulerMethod_g(2, 3, 3, 0.2);

		System.out.println("Exercises 10.2 (10)");
		EulerMethod(1, 2, -4, 0.2);
	}
}