package Stack;
/**
 * ��O(1)ʱ�临�Ӷ���ջ����СԪ��
 * @author LIn
 *
 */
public class MinStack {
	MyStack<Integer> elem;
	MyStack<Integer> min;
	
	public MinStack(){
		elem = new MyStack<Integer>();
		min = new MyStack<Integer>();
	}
	
	public void push(int data){
		elem.push(data);
		if(min.isEmpty()){
			min.push(data);
		}else if(data <= min.peek()){
			min.push(data);
		}

	}
	
	public int pop(){
		int top = elem.peek();
		elem.pop();
		if(top == this.min()){
			min.pop();
		}
		return top;
	}
	
	public int min(){
		if(min.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return min.peek();
		}
	}


}
