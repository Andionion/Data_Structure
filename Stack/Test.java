package Stack;

public class Test {

	public static void main(String[] args) {
		MinStack s = new MinStack();
		s.push(3);
		s.push(2);
		s.push(4);
		s.push(5);
		s.push(2);
		System.out.println("ջ��Ԫ��:" + s.min());
		System.out.println("ջ��Ԫ��:" + s.pop());
		System.out.println("ջ��Ԫ��:" + s.min());

	}

}
