public class LLPractice{
	
	Node head;//head node
	static class Node{//creating node structure
		int data;
		Node next;

	public Node(int d){//constructor
		this.data = d;
		this.next = null;
		}
	}
	void display(){//display method 
		Node n = head;//creating new node n and assigning head to n 
		while(n!=null){
			System.out.print(n.data+" -->");
			n=n.next;
		}
		System.out.println("null");
	}
	
	void insertFirst(int newData){
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}
	
	void insertAfter(Node prevNode, int newData){
		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	
	void append(int newData){
		Node n = head;
		Node newNode = new Node(newData);
		while(n.next!=null){
			n=n.next;
		}
		n.next = newNode;
	}
	
	
	public static void main(String args[]){
		
		LLPractice ll = new LLPractice();
		ll.head = new Node(10);
		Node sec = new Node(20);
		Node thrd = new Node(30);
		
		ll.head.next = sec;
		sec.next = thrd;
		
		ll.display();
		
		ll.insertFirst(11);
		ll.display();
		
		ll.insertAfter(ll.head,100);
		ll.display();
		
		ll.insertAfter(ll.head.next.next,200);
		ll.display();
		
		ll.append(88);
		ll.display();
		
	}
	
}