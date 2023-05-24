package SC;

public class SinglyCircular {
	
	private Node head,tail;
	
	public SinglyCircular()
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
	
	public void display() // DISPLAY THE ELEMENTS
	{
		Node temp = head;
		System.out.print("\n The elements are: ");
		while(temp.getNext()!=head)
		{
			System.out.print("\t"+temp.getData());
			temp=temp.getNext();
		}
		System.out.print("\t"+temp.getData());
		
	}
	
	public boolean insertBeg(int data) // INSERT ON BEGINING
	{
		Node new_node = new Node(data);
		
		if(new_node==null)
		{
			return false;
		}
		if(head==null)
		{
			head=tail=new_node;
			tail.setNext(head);
		}
		else
		{
			new_node.setNext(head);
			head=new_node;
			tail.setNext(head);
		}
		return true;
	}
	
	public boolean insertEnd(int data) // INSERT ON END
	{
		Node new_node = new Node(data);
		if(new_node==null)
		{
			return false;
		}
		if(head==null)
		{
			head=tail=new_node;
			head.setNext(head);
		}
		else
		{
			tail.setNext(new_node);
			new_node.setNext(head);
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
			tail.setNext(head);
		}
		return true;
	}
	
	public boolean deleteEnd() // DELETE AT END
	{
		if(head==null)
		{
			return false;
		}
		else
		{
			Node temp=head;
			while(temp.getNext().getNext()!=head)
			{
				temp=temp.getNext();
			}
			temp.setNext(head);
			tail=temp.getNext();
		}
		return true;
	}
	
	public boolean insertPos(int data,int pos) // INSERT DATA ON GIVEN POSITION
	{
		Node new_node = new Node(data);
		if(new_node==null)
		{
			return false;
		}
		if(pos==1)
		{
			insertBeg(data);
		}
		if(pos<0)
		{
			System.out.println("INVALID POSITION!!!");
		}
		else
		{
			Node temp = head;
			int cntr=1;
			while(cntr<pos-1 && temp.getNext()!=head)
			{
				cntr++;
				temp=temp.getNext();
			}
			new_node.setNext(temp.getNext());
			temp.setNext(new_node);
		}
		return true;
	}
	
	public boolean deletePos(int pos)
	{
		if(pos==1)
		{
			deleteBeg();
		}
		if(pos<0)
		{
			System.out.println("INVALID POSITION!!! ");
		}
		Node temp = head;
		int counter =1;
		while(counter<pos-1 && temp.getNext()!=head)
		{
			counter++;
			temp=temp.getNext();
			
		}
	
		temp.setNext(temp.getNext().getNext());
		return true;
		
		
	}
	
	public boolean search(int data) // SERCHING AN ELEMENT
	{
		if(head==null)
		{
			return false;
		}
		else
		{
			Node temp = head;
			int counter=1;
			while(temp.getNext()!=head)
			{
				counter++;
				temp=temp.getNext();
				if(data==temp.getData())
				{
					System.out.print("\nThe Position of "+data+" is "+counter);
				}
			}
		}
		return true;
	}
	
	
}
