package stkqueue;

public class Test {

	public static void main(String[] args) {
		
		StaticQueue sq = new StaticQueue(20);
		
		sq.enque(10);
		sq.enque(20);
		sq.enque(30);
		sq.enque(40);
		sq.display();
		sq.deque();
		sq.display();
		sq.peak();

	}

}
