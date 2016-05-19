package Stack;
import java.util.Arrays;
/**
 * �����鹹��ջ
 * @author LIn
 *
 * @param <E>
 */
public class MyStack<E> {

	private Object[] stack;
	private int size;  //�����е�Ԫ��
	public MyStack(){
		stack = new Object[10];  //��ʼ����
	}
	
	//�ж�ջ�Ƿ�Ϊ��
	public boolean isEmpty(){
		return size == 0;
	}
	
	//ȡջ��Ԫ�ص�ֵ
	public E peek(){
		if(isEmpty()){
			return null;
		}else{
			return (E)stack[size-1];
		}
	}
	
	//��ջ��Ԫ�س�ջ
	public E pop(){
		E e = peek();
		stack[size-1] = null;
		size--;
		return e;
	}
	
	//��ջ
	public E push(E e){
		ensureCapacity(size + 1); //�������
		stack[size++] = e;
		return e;
	}
	
	//�ж������Ƿ�������������������������ռ�
	private void ensureCapacity(int size){
		int len = stack.length;
		if(size > len){  //��������
			int newLen = 10;
			stack = Arrays.copyOf(stack, newLen);
		}
	}

}
