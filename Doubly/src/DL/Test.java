package DL;

public class Test {

	public static void main(String[] args) {
		
		Doubly DL = new Doubly();
		
		DL.insertBeg(70);
		DL.insertBeg(60);
		DL.insertBeg(50);
		DL.insertBeg(40);
		//DL.insertEnd(10);
		DL.display();
		
		DL.insertEnd(80);
		DL.insertEnd(90);
		DL.display();
		DL.deleteBeg();
		DL.display();
		DL.deleteEnd();
		DL.display();
		DL.insertPos(3,5);
		DL.display();

	}

}
