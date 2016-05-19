package LinkedList;
//������
class Node{
	Node next = null;
	int data;
	public Node(int data){
		this.data = data;
	}
}

public class MyLinkedList {
	
	Node head = null;    //�����ͷָ��
	
	/**�������в�������
	 * @param d:�������ݵ�����
	 * */
	public void addNode(int d){
		Node newNode = new Node(d);
		
		if(head == null){  //����������Ϊͷָ��
			head = newNode;
		}else{
			Node p = head;
			while(p.next != null){
				p = p.next;
			}
			p.next = newNode;	
		}
	}
	
	/**
	 * @param index:ɾ����index���ڵ�
	 * @return �ɹ�����true��ʧ�ܷ���false
	 * */
	public boolean delNode(int index){
		if(index < 1 || index > length()){
			return false;
		}
		//ɾ�������һ���ڵ�
		if(index == 1){
			head = head.next;
			return true;
		}else{
			//���ǵ�һ���ڵ�
			int i = 1;
			Node preNode = head;
			Node curNode = preNode.next;
			while(curNode != null){
				if(i == index){
					preNode.next = curNode.next;
					return true;
				}
				preNode = curNode;
				curNode = curNode.next;
				i++;
			}
		}
		return true;
	}
	
	/**
	 * @return ���ؽڵ�ĳ���
	 */
	public int length(){
		int length = 0;
		Node p = head;
		while(p != null){
			length++;
			p = p.next;
		}
		return length;
	}
	
	public int length(Node head){
		int length = 0;
		Node p = head;
		while(p != null){
			length++;
			p = p.next;
		}
		return length;
	}
	
	/**
	 * �������������
	 * ����Ϊѡ������
	 * @return ����������ͷ�ڵ�
	 */
	public Node orderList(){
		Node nextNode = null;
		int temp = 0;
		Node curNode = head;
		while(curNode.next != null){
			nextNode = curNode.next;
			while(nextNode != null){
				if(nextNode.data < curNode.data){
					swap(curNode,nextNode);
				}
				nextNode = nextNode.next;
			}
			curNode = curNode.next;
		}
		return head;
	}
	
	/**
	 * ���������ڵ��ֵ
	 */
	private static void swap(Node i,Node j){
		int temp = i.data;
		i.data = j.data;
		j.data = temp;
	}
	
	/**
	 * �������
	 */
	public void printList(){
		Node p = head;
		while(p != null){
			System.out.println(p.data);
			p = p.next;
		}
	}

}
