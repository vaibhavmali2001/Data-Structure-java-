package staticstk;

public class Stack {
	
	private int data[];
	private int top;
	
	public Stack(int size) {
		this.data = new int[size];
		this.top =-1;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}
	
	public boolean isEmpty()
	{
		if(top==-1)
		{
			System.out.print("\nStack is Empty!!!");
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if(top==(data.length)-1)
		{
			System.out.print("\nStack is Full!!!");
			return true;
		}
		return false;
	}
	
	public void display() //DISPLAY
	{
		if(isEmpty())
		{
			System.out.print("\nStack is Empty!!!");
			return;
		}
		for(int i=top;i>=0;i--)
		{
			System.out.print(data[i]+"-->");
		}
	}
	
	public void push(int v) // PUSH
	{
		if(isFull())
		{
			System.out.print("\nStack is Full!!!");
			return;
		}
		data[++top]=v;
		
	}
	
	public int pop() // POP
	{
		if(isEmpty())
		{
			System.out.print("\nStack Empty!!!");
			return -1;
		}
		int ans= data[top--];
		System.out.print("\nThe popped element from stack is "+ans+"\n");
		return 0;
	}
	
	public 	int peak() //PEAK
	{
		if(isEmpty())
		{
			System.out.print("Stack is Empty!!!");
			return -1;
		}
		else
		{
			int ans = data[top];	
			System.out.println("\nThe Topmost element is "+ans+"\n");	
		}
		return 0;
	}
	
}
