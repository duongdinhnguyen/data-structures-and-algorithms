package hw5_18001119;

public class ArrayBinaryTree<E> implements BinaryTreeInterface<E> {
	private E[] list;
	private int n = 0;
	private int defaultSize = 10000;

	public ArrayBinaryTree() {
		list = (E[]) new Object[defaultSize];
	}

	public void output() {
		for(int i=1;i<=n;i++) {
			System.out.print(list[i]+" ");
		}

	}

	public E setRoot(E element) {
		if (size() == 0) {
			list[1] = element;
			n++;
		}
		return list[1];
	}

	public E setLeft(int p, E element) {
		if (p < 0 || p > n ) {
			return null;
		}
		p = p * 2;
		if (list[p] == null) {
			list[p] = element;
			n++;
		} else {
			list[p] = element;
		}
		return list[p];
	}

	public E setRight(int p, E element) {
		if (p < 0 || p > n ) {
			return null;
		}
		p = p * 2 + 1;
		
		if (list[p] == null) {
			list[p] = element;
			n++;
		} else {
			list[p] = element;
		}
		return list[p];
	}

	@Override
	public E root() {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			return null;
		} else
			return list[1];
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (n > 0) {
			return true;
		} else
			return false;
	}

	public void ReturnIsempty() {
		System.out.println("List co rong hay khong ?");
		if (isEmpty()) {
			System.out.println("No");
		} else
			System.out.println("Yes");

	}

	@Override
	public int numChildren(E p) {
		// TODO Auto-generated method stub
		int index = (int) p;
		int count = 0;
		if (!isEmpty() || index >n || index < 0 || list[index] == null) {
			return -1;
		}
		index = index * 2;
		if (index <= n && list[index] != null) {
			count++;
		}
		index++;
		if (index <= n && list[index] != null) {
			count++;
		}
		return count;
	}

	@Override
	public E parent(E p) {
		// TODO Auto-generated method stub
		int index = (int) p;
		if (!isEmpty() || index > n || index < 0) {
			return null;
		}
		index = (int) index / 2;
		if (list[index] == null) {
			return null;
		}
		return (E) Integer.valueOf(index);
	}

	@Override
	public E left(E p) {
		// TODO Auto-generated method stub
		int index = (int) p;
		if (!isEmpty() || index > n / 2 || index < 0) {
			return null;
		}
		index = index * 2;
		if (index < 0 || index >= n || list[index] == null) {
			return null;
		}
		return (E) Integer.valueOf(index);
	}

	@Override
	public E right(E p) {
		// TODO Auto-generated method stub
		int index = (int) p;
		if (!isEmpty() || index > n / 2 || index < 0) {
			return null;
		}
		index = index * 2 + 1;
		if (list[index] == null || index > n) {
			return null;
		}
		return (E) Integer.valueOf(index);
	}

	@Override
	public E sibling(E p) {
		// TODO Auto-generated method stub
		int index = (int) p;
		if (!isEmpty() || index > n / 2 || index < 0) {
			return null;
		}
		if (index % 2 == 0) {
			index = index + 1;
		} else {
			index -= 1;
		}
		if (index >= n || index < 0 || list[index] == null) {
			return null;
		}
		return (E) Integer.valueOf(index);
	}

}
