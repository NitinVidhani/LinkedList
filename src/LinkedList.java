
public class LinkedList {
	private Node head;
	private int size;
	
	public LinkedList() {
		
	}
	
	public void insertAtFirst(int data) {
		Node n = new Node(data);
		n.setNext(head);
		head = n;
		System.out.println("Data inserted successfully");
		size++;
	}
	
	public void insertAtLast(int data) {
		Node n = new Node(data);
		Node temp = head;
		while(temp.getNext()!=null) {
			temp = temp.getNext();
		}
		temp.setNext(n);
		System.out.println("Data inserted successfully");
		size++;
	}
	
	public void insertAtPos(int data, int pos) {
		if(pos==1)
			insertAtFirst(data);
		else if(pos==size)
			insertAtLast(data);
		else if(pos>1 && pos<size) {
			Node n = new Node(data);
			Node temp = head;
			for(int i=1;i<pos-1;i++) {
				temp = temp.getNext();
			}
			n.setNext(temp.getNext());
			temp.setNext(n);
			System.out.println("Data inserted successfully");
			size++;
		}
		else
			System.out.println("Insertion not possible at position "+pos);
	}
	
	public void deleteFirst() {
		if(isEmpty())
			System.out.println("List is already empty");
		else {
			head = head.getNext();
			System.out.println("Data deleted successfully");
			size--;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			System.out.println("List is already empty");
		else {
			Node temp = head;
			for(int i=1;i<size-1;i++) {
				temp = temp.getNext();
			}
			temp.setNext(null);
			System.out.println("Data deleted successfully");
			size--;
		}
	}
	
	public void deleteAtPos(int pos) {
		if(pos==1)
			deleteFirst();
		else if(pos == size)
			deleteLast();
		else if(pos>1 && pos<size) {
			Node temp = head;
			for(int i=1;i<pos-1;i++) {
				temp = temp.getNext();
			}
			Node t = temp.getNext();
			temp.setNext(t.getNext());
			System.out.println("Data deleted successfully");
			size--;
		}
		else
			System.out.println("Invalid Position");
	}
	
	public boolean isEmpty() {
		if(size == 0)
			return true;
		else
			return false;
	}
	
	public void getListSize() {
		System.out.println("Total elements in the list: "+size);
	}
	
	public void viewList() {
		if(isEmpty())
			System.out.println("List is empty");
		else {
			Node n = head;
			for(int i=0;i<size;i++)
			{
				System.out.print(n.getData()+" ");
				n=n.getNext();
			}
		}
	}
}
