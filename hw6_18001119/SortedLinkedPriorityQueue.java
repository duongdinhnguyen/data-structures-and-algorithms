package hw6_18001119;


public class SortedLinkedPriorityQueue<K extends Comparable, E> implements PriorityQueueInterface {

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
	
	public void Move(NodeEntry a, NodeEntry b, NodeEntry c) {
		a.next=c;
		c.next=b;
		
		
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
			
			if(((Comparable) newNodeEntry.element).compareTo(head.element)<0) {
				newNodeEntry.next=head;
				head=newNodeEntry;
				return;
			}
			NodeEntry temp= head;
			
			while(temp.next!=null) {
				
				if(((Comparable) newNodeEntry.element).compareTo(temp.next.element)<0) {
					Move(temp,temp.next,newNodeEntry);
					return;
				}
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
			
			if(((Comparable) newNodeEntry.element).compareTo(head.element)<0) {
				newNodeEntry.next=head;
				head=newNodeEntry;
				return;
			}
			NodeEntry temp= head;
			
			while(temp.next!=null) {
				
				if(((Comparable) newNodeEntry.element).compareTo(temp.next.element)<0) {
					Move(temp,temp.next,newNodeEntry);
					return;
				}
				temp=temp.next;
			}
			temp.next= newNodeEntry;
			}
		else return;
	}
	
	
	
	
	@Override
	public Entry removeMin() {
		// TODO Auto-generated method stub
		if(n==1) {
			NodeEntry newNodeEntry= head;
			head=null;
			return newNodeEntry;
		}
		else if(n>1) {
			NodeEntry newNodeEntry= head;
			head=head.next;
			return newNodeEntry;
		}
		
		else return null;
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