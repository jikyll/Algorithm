package recall;
/**
 * 实现全排列（交换元素法）
 * @author haodong
 *
 */
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
			/**
			 * 这里是全排列的关键，交换元素，注意i是从start开始遍历，因为数组保持原状时也是一种情况
			 */
			char tmp = a[start];
			a[start] = a[i];
			a[i] = tmp;
			/**
			 * start参数控制数组遍历到的位数
			 */
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
