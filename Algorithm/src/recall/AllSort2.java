package recall;
/**
 * 回溯法
 * 实现“全组合”，即实现M^N种可能的算法
 * @author haodong
 *
 */
public class AllSort2 {
	private static int index = 1;
	private static final int A = 3;
	private static final int RANGE = 2;
	public static void main(String[] args) {
		int[] a = new int[A];
		allSort2(a, 0, A);
	}
	/**
	 * 使用location记录当前遍历位置，len为回溯列长度
	 * @param a
	 * @param location
	 * @param len
	 */
	public static void allSort2(int[] a, int location, int len) {
		if (location == len) {
			printA(a);
			return;
		}
		for (int i = 0; i <= RANGE; i++) {
			a[location] = i;
			allSort2(a, location+1, len);
		}
	}
	public static void printA(int[] a) {
		System.out.print("the " + index++ + " result is: ");
		for (int value: a) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
