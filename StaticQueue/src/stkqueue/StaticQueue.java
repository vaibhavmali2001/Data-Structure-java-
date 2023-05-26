package stkqueue;

public class StaticQueue {
		
	private int data[];
	private int front,rear;
	
	public StaticQueue(int size)
	{
		this.data=new int[size];
		this.front=-1;
		this.rear=-1;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}
	
	
	public boolean isEmpty()
	{
		if(rear==-1 || front==rear+1 && front==0)
		{
			return true;
		}
		return false;
	}
	
	public boolean isFull()
	{
		if(rear==data.length-1)
			return true;
		return false;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.print("\nQueue is Empty!!!");
			return;
		}
		System.out.print("\nThe elements are :");
		for(int i=front;i<=rear;i++)
		{
			System.out.print("\t"+data[i]);
		}
	}
	
	public int enque(int val)
	{
		if(isFull())
		{
			System.out.println("Queue is Full!!!");
			return -1;
		}
		if(rear==-1)
			front=0;
		data[++rear]=val;
		return 0;
	}
	
	public int deque()
	{
		if(isEmpty())
		{
			System.out.print("\nQueue is Empty!!!");
			return -1;
		}
		int ans=data[front++];
		System.out.print("\nThe Deleted element is: "+ans);
		return 0;
	}
	public int peak()
	{
		if(isEmpty())
		{
			System.out.print("\nQueue is Empty!!!");
			return -1;
		}
		int ans=data[front];
		System.out.print("\nThe Topmost Element is: "+ans);
		return 0;
	}
}
