package DL;

public class Doubly {
	
	private Node head,tail;
	
	public Doubly()
	{
		this.head=head;
		this.tail=null;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void display() // DISPLAY
	{
		Node temp=head;
		System.out.print("\nThe elements are: ");
		while(temp.getNext()!=null)
		{
			System.out.print("\t"+temp.getData());
			temp = temp.getNext();
		}
		System.out.print("\t"+temp.getData());
	}
	
	public boolean insertBeg(int data) // INSERT AT BEGINING
	{
		Node new_node = new Node(data);
		if(new_node==null)
		{
			return false;
		}
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			new_node.setNext(head);
			head.setPrev(new_node);
			head=new_node;
		}
		return true;
	}
	
	public boolean insertEnd(int data) // INSERT AT END
	{
		Node new_node = new Node(data);
		if(new_node==null)
		{
			return false;
		}
		if(head==null)
		{
			head=tail=new_node;
			tail.setNext(null);		
		}
		else
		{
			Node temp=head;
			while(temp.getNext().getNext()!=null) {
				
				temp=temp.getNext();
			}
			temp.getNext().setNext(new_node);
			new_node.setPrev(temp.getNext());
			tail=new_node;
	
			
		}
		return true;
	}	
	
		public boolean deleteBeg() // DELETE AT BEGINING
		{
			if(head==null)
			{
				return false;
			}
			else
			{
				head=head.getNext();
				head.setPrev(null);
				
			}
			return true;
		}
	
		public boolean deleteEnd() // DELETE AT END
		{
			if(head==null)
			{
				return false;
			}
			Node temp = head;
			while(temp.getNext().getNext()!=null)
			{
				temp = temp.getNext();
			}
			temp.setNext(null);
			tail=temp.getNext();
			return true;
		}
		
		public boolean insertPos(int pos,int data)
		{
			Node new_node = new Node(data);
			if(new_node==null)
			{
				return false;
			}
			if(pos<=0)
			{
				System.out.println("POSITION NOT EXISTS !!!");
			}
			if(pos==1)
			{
				insertBeg(data);
			}
			if(head==null)
			{
				head=tail=new_node;
				tail.setNext(null);
			}
			else
			{
				Node temp = head;
				int counter=1;
				while(counter<pos-1 && temp.getNext()!=null)
				{
					counter++;
					temp = temp.getNext();
				}
				new_node.setNext(temp.getNext());
				temp.setNext(new_node);
				new_node.getNext().setNext(new_node);
			}
			return true;
		}
		
}
