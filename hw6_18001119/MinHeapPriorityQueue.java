package hw6_18001119;

public class MinHeapPriorityQueue<K extends Comparable, E> extends SortedArrayPriorityQueue {

	ArrEntry<K, E> heapPQ[];
	int length = 0;

	public MinHeapPriorityQueue() {
		heapPQ = new ArrEntry[defaultsize];
		
	}
	
	public void Out(int j, int lv) {
		if (heapPQ[j] == null)
			return;
		Out(j * 2 + 1, lv + 1);

		for (int i = 1; i <= lv; i++) {
			System.out.print("\t");
		}

		System.out.println(heapPQ[j]);
		Out(j * 2, lv + 1);

	}

	public void insertHeap(Object k, Object e) {
		ArrEntry newHeap = new ArrEntry(k, e);
		if (length == 0) {
			length++;
			heapPQ[length] = newHeap;
		} else if (length > 0) {
			length++;
			upHeap(newHeap);
		}
	}

	public void swap(int i, int j) {
		ArrEntry temp = heapPQ[i];
		heapPQ[i] = heapPQ[j];
		heapPQ[j] = temp;
	}

	public ArrEntry removeHeap() {
		ArrEntry newHeap = heapPQ[1];
		heapPQ[1] = heapPQ[length];
		heapPQ[length] = null;
		length--;

		downHeap();
		return newHeap;
	}

//Các phương thức bổ sung

	protected void upHeap(ArrEntry newHeap) {
		heapPQ[length] = newHeap;
		int j = length;
		while (j > 1 && heapPQ[j].key.compareTo(heapPQ[j / 2].key) < 0) {

			swap(j, j / 2);
			j = j / 2;
		}
	}// vun lên

	protected void downHeap() {
		int j = 1;
		// System.out.println(length);
		while (j <= length) {
			if (2 * j + 1 <= length) {
				if (heapPQ[j].key.compareTo(heapPQ[2 * j].key) < 0
						&& heapPQ[j].key.compareTo(heapPQ[2 * j + 1].key) < 0) {
					return;
				} else {
					if (heapPQ[2 * j].key.compareTo(heapPQ[2 * j + 1].key) < 0) {
						swap(j, 2 * j);
						j = j * 2;
					} else {
						swap(j, 2 * j + 1);
						j = 2 * j + 1;
					}
				}
			} else if (2 * j <= length) {
				if (heapPQ[j].key.compareTo(heapPQ[2 * j].key) > 0) {
					swap(j, j * 2);

				}
				// vi du neu có 10 nut  ma nut thu 5 < nut 10
				// thì dừng nếu không sẽ bị lặp dài dài
				else return;
				
			} else   // nếu không có con của j thì cũng phải dừng ko cũng lặp dài dài
				return;
		}
	} // vun xuống
}