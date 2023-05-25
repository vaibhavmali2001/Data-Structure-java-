package stkll;

public class StackNode {
		 
	 private Node head;
	 private Node top;
	 public StackNode()
	 {
		 this.head=head;
		 this.top=null;
	 }

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			 System.out.print("\nStack Empty!!!");
	          return;
		}
		
		System.out.println("The elemens are: ");
		
		for(Node t=top;t!=null;t=t.getPrev())
		{
			System.out.println(t.getData());
		}
	}
	 public boolean isEmpty()
	 {
		 if(top==null)
		 {
          //System.out.print("\nStack Empty!!!");
          return true;
		 }
		return false; 
	 }
	 public void push(int data)
	 {
		 Node new_node = new Node(data);
		 if(isEmpty())
		 {
			 top=new_node;
			 return;
		 }
		 new_node.setPrev(top);
		 top=new_node;
		 
	 }
	 public void pop()
	 {
		 if(isEmpty()) {
			 System.out.println("stack is empty");
			 return;
		 }
		 Node temp=top;
		 top=top.getPrev();
		 temp.setPrev(null);
		 
	 }
	 public void peak()
	 {
		 if(isEmpty()) {
			 System.out.println("stack is empty");
			 return;
		 }
		 Node temp=top;
		 System.out.print("The Topmost Element is "+temp.getData());
	 }
}
