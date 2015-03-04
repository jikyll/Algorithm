package sort;

public class MergeSort {
	public void mergSort(int[] a, int left1, int right1, int left2, int right2) {
		int length = (right1-left1)+(right2-left2);
		int[] tmp = new int[length];
		int count = 0;
		int index1 = a[right1];
		int index2 = a[right2];
		int len = a.length;
		int index = length-1;
		while (index1 >= left1 && index2 >= left2) {
			if (a[right1] > a[right2]) {
				tmp[index--] = a[right1--];
			} else {
				tmp[index--] = a[right2--];
			}
			while (index1 < left1 && index2 >= left2) {
				tmp[index--] = a[index2--];
			}
			while (index1 >= left1 && index2 < left2) {
				tmp[index--] = a[index1--];
			}
		}
		count = 0;
		while (count < length) {
			a[left1++] = tmp[count++];
		}
	}
	public void partition(int[] a, int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = (left+right)/2;
		partition(a, left, mid);
		partition(a, mid+1, right);
		mergSort(a, left, mid, mid+1, right);
	}
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
		int[] a = new int[]{9, 8, 1, 2, 4, 5, 0, 3};
		ms.partition(a, 0, a.length-1);
		for (int i: a) {
			System.out.println(i);
		}
	}
}
