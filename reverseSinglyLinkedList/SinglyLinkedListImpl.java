package reverseSinglyLinkedList;

public class SinglyLinkedListImpl<T> {
	
	private Node<T> head;
	
	public void add(T Element)
	{
		Node<T> nd = new Node<T>();
		nd.setValue(Element);
		System.out.println("Adding===>"+Element);
		Node<T> tmp= head;
		while(true)
		{
			if (tmp==null)
			{
				head=nd;
				break;
				
			}
			else if (tmp.getNextRef()==null){
				tmp.setNextRef(nd);
				break;
			}
			else{
				tmp = tmp.getNextRef();
			}
			
		}
		
	}
	public void traverse(){
		Node<T> tmp = head;
		while(true)
		{
			if(tmp==null)
			{
				break;
			}
			System.out.println(tmp.getValue()+"\t");
			tmp=tmp.getNextRef();
		}
	}
	
	public void reverse(){
	
		System.out.println("\n reversing the linked list\n");
		Node<T> prev=null;
		Node<T> current= head;
		Node<T> next=null;
		while (current != null) {
			next=current.getNextRef();
			current.setNextRef(prev);
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	public static void main (String args[])
	{
		SinglyLinkedListImpl<Integer> sl= new SinglyLinkedListImpl<Integer>();
		sl.add(3);
		sl.add(32);
		sl.add(54);
		sl.add(89);
		System.out.println();
		sl.traverse();
		System.out.println();
		sl.reverse();
		sl.traverse();
	}
	
}

class Node<T> implements Comparable<T>{
	
	private T value;
	private Node<T> nextRef;
	public T getValue() {
		return value;
	}
	public Node<T> getNextRef() {
		return nextRef;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public void setNextRef(Node<T> nextRef) {
		this.nextRef = nextRef;
	}
	@Override
	public int compareTo(T arg)
	{
		if(arg==this.value)
		{
			return 0;
		}else{
			return 1;
		}
		
	}
	
}


