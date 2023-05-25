package stkll;

public class Teststk {

	public static void main(String[] args) {
		StackNode st = new StackNode();
		st.push(20);
		st.push(30);
		st.push(70);
		st.display();
		
		//st.pop();
		//st.display();
		st.peak();
	}

}
