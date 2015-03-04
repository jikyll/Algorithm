package sort;

public class QuickSort_1 {
	public void quickSort(int[] a, int left, int right) {
		if (left >= right) {
			return;
		}
		int pre_left = left;
		int pre_right = right;
		int pivot = a[left];
		while (left < right) {
			while (pivot < a[right] && right > left) right--;
			a[left] = a[right];
			while (a[left] < pivot && right > left) left++;
			a[right] = a[left];
		}
		a[left] = pivot;
		quickSort(a, pre_left, left-1);
		quickSort(a, left+1, pre_right);
	}
	public static void main(String[] args) {
		QuickSort_1 qs = new QuickSort_1();
		int[] a = new int[]{9, 8, 1, 2, 4, 5, 0, 3};
		/**
		 * 以下步骤主要分为两步，分别是建立大根堆和对大根堆进行排序
		 */
		qs.quickSort(a, 0, a.length-1);
		/**
		 * 得到递增序列
		 */
		for (int i: a) {
			System.out.println(i);
		}
	}
}

