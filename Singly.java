package LL;

public class Singly {

		private Node head;
	
	public Singly()
	{
		this.head=null;
	}

	public Node getHead()
	{
		return head;
	}

	public void setHead(Node head) 
	{
		this.head = head;
	}
	
		public void display()  // FOR DISPLAY LIST
		{
			Node temp = head;
			System.out.print("\nThe elements are: \n");
			while(temp!=null)
			{
				System.out.print("\t"+temp.getData());
				temp = temp.getNext();
			}
		}
	
		
		public boolean insertBeg(int data) // INSERT AT FIRST POSITION
		{
			Node new_node = new Node(data);
			
			if(new_node==null)
			{
				return false;
			}
			
			if(head==null)
			{
				head = new_node;
			}
			
			else
			{
				new_node.setNext(head);
				head = new_node;
			}
		
				return true;
		}
		
		public boolean insertEnd(int data) // FOR INSERT AT END
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
				Node temp=head;
				while(temp.getNext()!=null)
				{
					temp=temp.getNext();
				}
					
					temp.setNext(new_node);
					new_node.setNext(null);
			}
			return true;
		}
		
		
		public boolean deleteBeg()  // DELETE AT BEGINING
		{
			if(head==null)
			{
				return false;
			}
			else
			{
				head=head.getNext();
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
				Node temp = head;
				while(temp.getNext().getNext()!=null)
				{
					temp=temp.getNext();
				}
				temp.setNext(null);
			}
			return true;
		}
		
		public boolean insertPos(int data,int pos) // INSERT AT POSITION
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
			if(pos<0)
			{
				System.out.println("\nENTER VALID POSITION!!!");
			}
			
			else
			{
				Node temp=head;
				int counter=1;
				while(counter<pos-1 && temp.getNext()!=null)
				{
					counter++;
					temp=temp.getNext();
				}
				new_node.setNext(temp.getNext());
				temp.setNext(new_node);
			}
			return true;
		}
		
		public boolean search(int val) // SEARCHING AN ELEMENT
		{
			Node temp = head;
			int cntr=0;
			while(temp!=null)
			{
				cntr++;
				if(val==temp.getData())
					System.out.print("\nThe "+val+" is found at position "+""+cntr);
				temp=temp.getNext();
			}
			return true;
		}
		
		public void reverse() // REVERSE THE LIST
		{
			Node p, q, r;
			p = head;
			q = p.getNext();
			while (q != null) {
				r = q.getNext();
				q.setNext(p);
				p = q;
				q = r;
			}
			head.setNext(null);
			head = p;
		}
}
