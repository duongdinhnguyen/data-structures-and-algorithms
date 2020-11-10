package hw6_18001119;

public class UnsortedLinkedPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {

	protected static class NodeEntry<K, E> implements Entry<K, E> {
		private K key;
		private E element;
		private NodeEntry<K, E> next;

		public NodeEntry (K k, E e, NodeEntry<K,E> next){
			this.element=e;
			this.key=k;
			this.next= next;
			}

		@Override
		public K getKey() {
			// TODO Auto-generated method stub
			return this.key;
		}

		@Override
		public E getValue() {
			// TODO Auto-generated method stub
			return this.element;
		}

		
		public String toString() {
			return "(" + key + " ; " + element + ")";

		}
		
	}

	private NodeEntry<K, E> head;
	private NodeEntry<K, E> tail;
	int n = 0;
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return n;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(n>0) {
			return true;
		}
		else return false;
	}
	@Override
	public void insert(Entry entry) {
		// TODO Auto-generated method stub
		NodeEntry  newNodeEntry= (NodeEntry) entry;
		if(n==0) {
			n++;
			head= newNodeEntry;
		}
		else if(n>0) {
			n++;
			NodeEntry temp= head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next= newNodeEntry;
		}
		else return;
	}
	@Override
	public void insert(Object k, Object e) {
		// TODO Auto-generated method stub
		NodeEntry  newNodeEntry= new NodeEntry(k,e,null);
		if(n==0) {
			n++;
			head= newNodeEntry;
		}
		else if(n>0) {
			n++;
			NodeEntry temp= head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next= newNodeEntry;
		}
		else return;
	}
	
	public NodeEntry MoveMin() {
		NodeEntry temp= head;
		NodeEntry tmp= head;


		while(temp.next!=null) {
			temp=temp.next;
			if(( ((Comparable) tmp.element).compareTo(temp.element)>0)) {
				tmp= temp;
			}
		}
		return tmp;
	}
	
	
	@Override
	public Entry removeMin() {
		// TODO Auto-generated method stub
		
		if(n==1) {
			NodeEntry temp= head;
			head= null;
			n--;
			return (Entry)temp;
		}
		else if(n>1) {
			n--;
			
			NodeEntry t0p= head;
			NodeEntry tmp=MoveMin();
			if(head== tmp) {
				
				head=head.next;
				

			}
			while(t0p.next!=null) {
				if( t0p.next==tmp) {

					t0p.next=t0p.next.next;
					
				}
				t0p=t0p.next;

			}
			
			return tmp;
			
		}
		else  return null;	
	}
	
	
	public void output() {
		NodeEntry newNodeEntry= head;
		while(newNodeEntry!= null) {
			System.out.print(newNodeEntry.toString()+" ");
			newNodeEntry= newNodeEntry.next;
		}
		System.out.println();
	}
	
	
	
	@Override
	public Entry min() {
		// TODO Auto-generated method stub
		if(n==1) {
			return (Entry)head;
		}
		else if(n>1) {
			NodeEntry temp= head;
			NodeEntry tmp= head;
			while(temp.next!=null) {
				temp=temp.next;
				if(((Comparable) tmp.key).compareTo(temp.key)>0) {
					tmp= temp;
				}
			}
			return tmp;
			
		}
		else  return null;		
	}
}