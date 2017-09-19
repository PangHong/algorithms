import java.util.Arrays;
public class BinarySearch {
	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length-1, 0);
	}
	public static int rank(int key, int[] a, int lo, int hi) {
		if(lo > hi) return -1;
		int mid = (lo + hi)/2;
		//StdOut.println("lo = " + lo + " hi = " + hi);
		if(key < a[mid]) return rank(key, a, lo, mid-1);
		else if(key > a[mid]) return rank(key, a, mid+1, hi);
		else return mid;
	}
	public static int rank(int key, int[] a, int lo, int hi, int count) {
		//StdOut.println("depth"+count);
		if(lo > hi) return -1;
		int mid = (lo + hi)/2;
		//StdOut.println("lo = " + lo + " hi = " + hi);
		if(key < a[mid]) return rank(key, a, lo, mid-1, count+1);
		else if(key > a[mid]) return rank(key, a, mid+1, hi, count+1);
		else return mid;
	}
	// excercise 1.1.29 Equal keys
	// smaller_than_key
	// arguments: a key, a sorted array of -
	// - int (some of which may be equal)
	// return: the number of elements -
	// -that are smaller than the key
	public static int smaller_than_key(int key, int[] a){
		int mid = rank(key, a), start = -1;
		while(mid >= 0){
			// it means that we search key\
			// in mid position
			// keep searching forward
			start = mid;
			// last keep the position \
			// when next forward search \
			// failed. It keeps the first \
			// position of key in the array.
			mid = rank(key, a, 0, mid - 1);
		}
		return start;
	}
	// count
	// arguments: the same like above
	// return: the number of elements equal to the key
	public static int count(int key, int[] a){
		int mid = rank(key, a);
		if(mid < 0){
			return 0;
		}
		int start = 0, end = 0;
		while(mid >= 0){
			start = mid;
			mid = rank(key, a, 0, mid - 1);
		}
		mid = rank(key, a);
		while(mid >= 0){
			end = mid;
			mid = rank(key, a, mid + 1, a.length-1);
		}
		return end - start + 1;
	}
	public static int[] remove(int[] a){
		int new_length = a.length;
		int start, mid, last = 0;
		for(int i = 0; i < a.length; i++){
			start = i;
			mid = i;
			while( mid >= 0){
				if(a[mid] == a[i]){
					last = mid;
				}
				mid = rank(a[mid], a, mid+1, a.length-1);
//				StdOut.println("mid="+mid);
			}
			new_length = new_length - (last - start);
			i = last; 
//			StdOut.println("length="+new_length);
//			StdOut.println("start="+start);
//			StdOut.println("last="+last);
		}
		int[] b = new int[new_length];
//		StdOut.println("length="+new_length);

		//copy array a to array b which remove duplicate
		int k = 0;
		for(int j = 0; j < new_length;j++){
			b[j] = a[k];
			while(b[j] == a[k]){
				k++;
				if(k == a.length){
					break;
				}
			}
		}
		return b;
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
		int[] a = {1,2,3,4,5,6,7,8};
		StdOut.println(rank(5, a));

/*		int[] whitelist = In.readInts(args[0]);
		Arrays.sort(whitelist);

		while(!StdIn.isEmpty()) {
			//Read key, print if not in whitelist.
			int key = StdIn.readInt();
			if(rank(key, remove(whitelist)) < 0){
				StdOut.println("- "+key);
			}else{
				StdOut.println("+ "+key);
			}
		}
*/
		// remove duplicates in the whitelist
		// test for remove method
		StdOut.println("test for remove method");
		int[] test = {0, 0, 0, 0, 0, 0, 2, 3};
		int[] b = remove(test);
		if(b[0] == 0 && b[1] == 2 && b[2] == 3 && b.length == 3){
			StdOut.println("test success");
		}else{
			StdOut.println("test failure");
		}
		//test two

		StdOut.println("test suit No.2 for remove method");
		int[] test2 = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] b2 = remove(test2);
		if(b2[0] == 0 && b2.length == 1){
			StdOut.println("test success");
		}else{
			StdOut.println("test failure");
		}

		StdOut.println("test suit No.3 for remove method");
		int[] test3 = {0, 2, 3};
		int[] b3 = remove(test3);
		if(b3[0] == 0 && b3[1] == 2 && b3[2] == 3 && b3.length == 3){
			StdOut.println("test success");
		}else{
			StdOut.println("test failure");
		}
		// test for smaller_than_key method
		StdOut.println("test suit for smaller_than_key");
		int[] test4 = {1,1,2,2,2,2,2,2};
		print_test_case(2 == smaller_than_key(2, test4));
	
		StdOut.println("test suit for smaller_than_key");
		int[] test5 = {0,1,1,2};
		print_test_case(3 == smaller_than_key(2, test5));
		StdOut.println("test suit for count");
		print_test_case(2 == count(1, test5));

		StdOut.println("test suit for count");
		print_test_case(1 == count(2, test5));
		StdOut.println("test suit for count");
		print_test_case(6 == count(2, test4));
	}
}