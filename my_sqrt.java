/* write a little program which could autogenerate source code with
 * comments about what the program is, how it works, any dependencies
 * needed, who the author is, when it is generated
 */
import java.util.Arrays;

public class my_sqrt{
	public static double sqrt(double a){
		double b = a, e = 1e-15;
		while(Math.abs(b - a/b) > e*b) {
			b = (b + a/b)/2;
			// in fact, this is newton's method
			// 2b = b + a/b
			// 2b*b = b*b + a(/b*b)
			// 2b*b = b*b + a;
		}
		return b;
	}

	public static double sqrt_newton(double a) {
		//use newton's method to compute sqrt
		// x ^ 2 = a
		// x = sqrt(a)
		// x ^ 2 - a = f(x)
		// f(x)=0 x=? x=sqrt(a)
		//f'(x) = 2x
		// linear approximation
		// l(x_new) = f'(x_old)(x_new-x_old) + f(x_old)
		// l(x_new) = 0, x_new=x_old-f(x_old)/f'(x_old)
		// if f(x_new) = x_new ^ 2 - a close to 0
		// then x_new is sqrt(a)
		double x = a, e = 1e-15;
		while(Math.abs(x*x - a) > e) {
			x = x - (x*x - a)/(2*x);
			// x = x - (x*x)/(2*x)+a/(2*x)
			// x = x - x/2 + a/2*x
			// x = x/2 + a/2*x
			// x = (x+a/x)/2
		}
	}
	public static double tri(double a){
		double b = a, e = 1e-15;
		while(Math.abs(1 - a/(b*b*b)) > e) {
			b = (b + a/(b*b))/2;
			// Actually, this above is not correct
			// x ^ 3 = a
			// x = cubic root (a)
			// x ^ 3 - a = 0
			// f(x) = 0, x = cubic root(a)
			// f'(x) = 3*x^2
			// slope of Line
			// f'(x_old) = [l(x_new) - f(x_old)]/(x_new - x_old)
			// l(x_new) = f'(x_old)(x_new - x_old)+f(x_old)
			// l(x_new) = 0, x_new = -f(x_old)/f'(x_old)+x_old
			// x_new = -(x_old^3-a)/(3*x_old^2) + x_old
			// x_new = -x_old^3/3*x_old^2 + a/3*x_old^2 + x_old
			// x_new = -x_old/3 + x_old + a/3*x_old^2
			// x_new = 2*x_old/3*x_old +a/3*x_old^2
			// x_new = (2*x_old + a/x_old)/3*x_old
			// b = (2*b + a/b)/(3*b)
			// (b*b*b - a) > e
		}
		return b;
	}

	public static double my_power(double a, int n) {
		if(n == 0)
			return 1;
		else
			return a*my_power(a, n-1);
	}
	public static double root(double a, int n){
		double b = a, e = 1e-15;
		double t;
		do {
			t = my_power(b, n-1);
			b = (b + a/t)/2;
		} while((Math.abs(b - a/t) > e*b));
		return b;
	}

	public static void main(String[] args) {
//		double x = Double.parseDouble(args[0]);
		//StdOut.printf("%3.2f ^ (1/3) = %3.5f\n", x, root(x, 4));
		
		double x1 = 8;
		//test for tri function
		//test not success, because in b*b + a/(b*b) exp,b*b is not correct 
		//test success
		StdOut.printf("tri:(%3.2f)^(1/3) = %3.2f\n", x1, tri(x1));
		

		double x2 = 50;
		StdOut.printf("root(x,3):(%3.2f)^(1/3) = %3.2f\n", x2, root(x2, 3));
		
		double x3 = 32;
		//test for root(x,n) n>= 4 failed
//		StdOut.printf("(%3.2f)^(1/5) = %3.2f\n", x3, root(x3, 5));
		
		double[] num = {2, 3, 5, 7};
		int length = num.length;
		StdOut.println("Table of sqrt");

		for(int i = length; i > 0; i--) {
			StdOut.print(" ______ ");
		}
		StdOut.println();
		
		for(int i = 0; i < length; i++) {
			StdOut.printf("| %3.2f |", num[i]);
		}
		
		StdOut.println();
		for(int i = length; i > 0; i--) {
			StdOut.print(" ------ ");
		}
		
		StdOut.println();

		for(int i = 0; i < length; i++) {
			StdOut.printf("| %3.2f |", sqrt(num[i]));
		}
		
		StdOut.println();
		for(int i = length; i > 0; i--) {
			StdOut.print(" ______ ");
		}
		
		StdOut.println();
		
	}
}


