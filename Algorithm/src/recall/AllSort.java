package recall;

public class AllSort {
	private static int index = 1;
	public static void main(String[] args) {
		char[] a = new char[]{'a', 'b', 'c', 'd'};
		allSort(a, 0, a.length-1);
	}
	public static void allSort(char[] a, int start, int end) {
		if (start == end) {
			printA(a);
			return;
		}
		for (int i = start; i <= end; i++) {
			char tmp = a[start];
			a[start] = a[i];
			a[i] = tmp;
			allSort(a, start+1, end);
			tmp = a[start];
			a[start] = a[i];
			a[i] = tmp;
		}
	}
	public static void printA(char[] a) {
		System.out.print("the " + index++ + " result is: ");
		for (char value: a) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
