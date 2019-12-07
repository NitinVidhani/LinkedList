import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		boolean flag = true;
		int data, pos;
		
		while(flag) {
			System.out.println("1. Insert element at start");
			System.out.println("2. Insert element at end");
			System.out.println("3. Insert element at custom position");
			System.out.println("4. Delete element from start");
			System.out.println("5. Delete element from end");
			System.out.println("6. Delete element from custom position");
			System.out.println("7. View List");
			System.out.println("8. Get the size of the list");
			System.out.println("9. Exit");
			
			System.out.println("Enter Your Choice");
			int ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.println("Enter Data");
					data = sc.nextInt();
					list.insertAtFirst(data);
					break;
				case 2:
					System.out.println("Enter Data");
					data = sc.nextInt();
					list.insertAtLast(data);
					break;
				case 3:
					System.out.println("Enter Data");
					data = sc.nextInt();
					System.out.println("Enter Position");
					pos = sc.nextInt();
					list.insertAtPos(data,pos);
					break;
				case 4:
					list.deleteFirst();
					break;
				case 5:
					list.deleteLast();
					break;
				case 6:
					System.out.println("Enter position");
					pos = sc.nextInt();
					list.deleteAtPos(pos);
					break;
				case 7:
					list.viewList();
					break;
				case 8:
					list.getListSize();
					break;
				case 9:
					flag = false;
					break;
				default:
					System.out.println("Invalid Choice");
			}
		}

	}

}
