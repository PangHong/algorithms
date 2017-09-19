/******************************************************************************
 *  Compilation:  javac myRandomSeq.java
 *  Execution:    java myRandomSeq n lo hi
 *  Dependencies: StdOut.java
 *
 *  Prints N numbers between lo and hi.
 *
 *  % java RandomSeq 5 100 200
 *  123
 *  153
 *  144
 *  155
 *  104
 *
 ******************************************************************************/
/**
 *  The {@code myRandomSeq} class is a client that prints out a pseudorandom
 *  sequence of integer numbers in a given range.
 *
 *  @author PangHong
 */
public class myRandomSeq {
    /**
     * Reads in two command-line arguments lo and hi and prints n uniformly
     * random integer numbers in [lo, hi) to standard output.
     *
     * @param args the command-line arguments
     */

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

        // for backward compatibility with Intro to Programming in Java version of RandomSeq
        if (args.length == 1) {
            // generate and print n numbers between 0.0 and 1.0
            for (int i = 0; i < n; i++) {
                double x = StdRandom.uniform();
                StdOut.println(x);
            }
        }

        else if (args.length == 3) {
            int lo = Integer.parseInt(args[1]);
            int hi = Integer.parseInt(args[2]);

            // generate and print n numbers between lo and hi
            for (int i = 0; i < n; i++) {
                int x = (int) StdRandom.uniform(lo, hi);
                StdOut.printf("%d\n", x);
            }
        }

        else {
            throw new IllegalArgumentException("Invalid number of arguments");
        }

	}
}