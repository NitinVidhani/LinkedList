
public class Node {
	
	private int data;
	private Node next;
	
	public Node(int d) {
		data = d;
	}
	
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setData(int d) {
		data = d;
	}
	
	public void setNext(Node n) {
		next = n;
	}
}
