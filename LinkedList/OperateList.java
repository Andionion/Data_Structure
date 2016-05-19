package LinkedList;

import java.util.Hashtable;

public class OperateList {

	/**
	 * ��������ɾ���ظ�����
	 * @param head
	 */
	public static void deletDuplecate(Node head){
		Hashtable<Integer,Integer> hm = new Hashtable<Integer,Integer>();
		Node p = head;
		Node pre = null;
		while(p != null){
			if(hm.containsKey(p.data)){
				pre.next = p.next;
			}else{
				hm.put(p.data,1);
				pre = p;
			}
			p = p.next;
		}
	}
	
	/**
	 * ��������ɾ���ظ�����
	 * ʡ�ռ䣬��ʱ��
	 * @param head
	 */
	public static void deletDuplecate1(Node head){
		Node p = head;
		Node q;
		while(p != null){
			q = p;
			while(q.next != null){
				if(q.next.data == p.data){
					q.next = q.next.next;
				}else{
					q = q.next;
				}
			}
			p = p.next;
		}
	}
	
	/**
	 * �ҳ������еĵ�����k��Ԫ��
	 * @param head
	 */
	public static Node findElem(Node head,int k){
		MyLinkedList m = new MyLinkedList();
		if(k < 1 || k > m.length()){
			return null;
		}
		Node p1 = head;
		Node p2 = head;
		for(int i = 0; i < k; i++){
			p1 = p1.next;
		}
		while(p1 != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
		
	}
	
	/**
	 * ��β��ͷ���������
	 * �ݹ����
	 */
	public void printListReversely(Node head){
		if(head != null){
			printListReversely(head.next);
			System.out.println(head.data);
		}
	}
	
	/**
	 * ʵ������ķ�ת
	 */
	public void Reverse(Node head){
		Node Rhead = head;  //��ת�������
		Node p = head;
		Node pPrev = null;
		while(p != null){
			Node pNext = p.next;  //������һ���ڵ�
			if(pNext == null){
				Rhead = p;
			}
			p.next = pPrev;
			pPrev = p;
			p = pNext;
		}
		head = Rhead;
	}
	
	/**
	 * Ѱ��������м�ڵ�
	 */
	public Node SearchMid(Node head){
		Node p = head;
		Node q = head;
		while(p != null && p.next != null && p.next.next != null){
			p = p.next.next;
			q = q.next;
		}
		return q;
	}
	
	/**
	 * �ڲ�֪��ͷָ��������ɾ��ָ���ڵ�
	 */
	public boolean deleteNode(Node n){
		if(n == null || n.next == null){
			return false;
		}else{
			int temp = n.data;
			n.data = n.next.data;
			n.next.data = temp;
			n.next = n.next.next;
			return true;
		}
	}

	

}
