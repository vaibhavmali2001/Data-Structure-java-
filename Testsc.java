package SC;

public class Test {

	public static void main(String[] args) {
		
		SinglyCircular SC = new SinglyCircular();
		
		SC.insertBeg(10);
		SC.insertBeg(20);
		SC.insertBeg(30);
		SC.insertBeg(40);
		SC.insertBeg(50);
		//SC.insertEnd(50);
		//SC.display();
		//SC.deleteBeg();
		//SC.display();
		//SC.deleteEnd();
		//SC.display();
		//SC.insertPos(70,2);
		//SC.display();
		//SC.search(10);
		SC.display();
		SC.deletePos(2);
		SC.display();

	}

}
