package sort;

public class HeapSort {
	/**
	 * 建堆函数
	 * @param a
	 */
	public void buildHeapify(int[] a) {
		int len = a.length;
		
		for (int i = len/2-1; i >= 0; i--) {
			heapify(a, i, len);
		}
	}
	/**
	 * 调整堆函数
	 * @param a
	 * @param index
	 * @param size
	 */
	public void heapify(int[] a, int index, int size) {
		int left = 0;
		int right = 0;
		left = getLeft(index, size);
		right = getRight(index, size);
		if (left == -1) {
			return;
		}
		if (right == -1) {
			right = left;
		}
		int largest = a[left] >= a[right]? left: right;
		if (a[index] < a[largest]) {
			int tmp = a[largest];
			a[largest] = a[index];
			a[index] = tmp;
			heapify(a, largest, size);
		}
	}
	public int getLeft(int index, int size) {
		if (index*2+1 < size) {
			return (index<<1)+1;
		}
		return -1;
	}
	public int getRight(int index, int size) {
		if (index*2+2 < size) {
			return (index<<1)+2;
		}
		return -1;
	}
	/**
	 * 排序函数
	 * 每次利用最大堆获得数组中一个最大的元素，使得最大元素与i所在的元素交换位置，改变堆得范围，继续调整堆
	 * @param a
	 */
	public void heapSort(int[] a) {
		int tmp = 0;
		int len = a.length;
		for (int i = len-1; i > 0; i--) {
			tmp = a[0];
			a[0] = a[i];
			a[i] = tmp;
			heapify(a, 0, i);
		}
	}
	public static void main(String[] args) {
		HeapSort hs = new HeapSort();
		int[] a = new int[]{9, 8, 1, 2, 4, 5, 0, 3};
		/**
		 * 以下步骤主要分为两步，分别是建立大根堆和对大根堆进行排序
		 */
		hs.buildHeapify(a);
		/**
		 * 得到递增序列
		 */
		hs.heapSort(a);
		for (int i: a) {
			System.out.println(i);
		}
	}
}
