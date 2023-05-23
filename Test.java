package LL;

public class Test {

	public static void main(String[] args) {
		
		Singly sl = new Singly();
		
		sl.insertBeg(10);
		sl.insertBeg(20);
		sl.insertBeg(30);
		sl.insertBeg(40);
		sl.insertBeg(50);
		sl.insertEnd(5);
		sl.display();
		sl.deleteBeg();
		sl.display();
		sl.deleteEnd();
		sl.display();
		sl.insertPos(60, 3);
		sl.display();
		//sl.search(40);
		sl.reverse();
		sl.display();
		
	}

}
