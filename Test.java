package staticstk;

public class Test {

	public static void main(String[] args) {
		
		Stack st = new Stack(200);
		st.push(3);
		st.push(2);
		st.push(1);
		st.push(5);
		st.push(8);
		st.display();
		st.pop();
		st.display();
		st.peak();

	}

}
