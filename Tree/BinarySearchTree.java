package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree<AnyType extends Comparable<? super AnyType>> {
	//���Ľڵ�
	private static class Node<AnyType>{
		AnyType element;     //�ڵ�����
		Node<AnyType> left;  //����
		Node<AnyType> right; //����
		
		Node(AnyType element){
			this(element, null, null);
		}
		
		Node(AnyType element, Node<AnyType> lt, Node<AnyType> rt){
			this.element = element;
			left = lt;
			right = rt;
		}
	}
	
	private Node<AnyType> root;  //���ڵ�
	
	public BinarySearchTree(){
		root = null;
	}
	
	public void makeEmpty(){
		root = null;
	}
	public boolean isEmpty(){
		return root == null;
	}
	/**
	 * ����Ԫ��x�Ƿ��ڸ�����
	 * @param x
	 * @return
	 */
	public boolean contains(AnyType x){
		return contains(x, root);
	}
	/**
	 * ������СԪ��
	 * @throws Exception 
	 */
    public AnyType findMin() throws Exception{
        if( isEmpty() )
            throw new Exception();
        return findMin(root).element;
    }

    /**
     * �������Ԫ��
     * @throws Exception 
     */
    public AnyType findMax() throws Exception{
        if(isEmpty())
            throw new Exception();
        return findMax(root).element;
    }
    
    public void insert(AnyType x){
        root = insert(x, root);
    }

	public void remove(AnyType x){
        root = remove(x, root);
    }

	/**
     * ����Ԫ�ص��ڲ��������ݹ�
     * @param x  Ҫ���ҵ�Ԫ��
     * @param t  �����ĸ��ڵ�
     * @return   �Ƿ���ҳɹ�
     */
    private boolean contains(AnyType x, Node<AnyType> t){
        if(t == null)
            return false;
            
        int compareResult = x.compareTo(t.element);
            
        if(compareResult < 0)
            return contains(x, t.left);
        else if(compareResult > 0)
            return contains(x, t.right);
        else
            return true;    //ƥ��
    }
    /**
     * ����������СԪ�أ��ݹ�
     * @param t
     * @return
     */
    private Node<AnyType> findMin(Node<AnyType> t){
    	if(t == null)
    		return null;
    	else if(t.left == null){
    		return t;
    	}
    	return findMin(t.left);
    }
    /**
     * �����������Ԫ�أ��ǵݹ�ʵ��
     * @param t
     * @return
     */
    private Node<AnyType> findMax(Node<AnyType> t){
    	if(t != null){
    		while(t.right != null){
    			t = t.right;
    		}
    	}
    	return t;
    }
    /**
     * ��Ԫ�ز��뵽���������
     * @param x  Ҫ���ҵ�Ԫ��
     * @param t  �����ĸ��ڵ�
     * @return   ���������ĸ��ڵ�
     */
    private Node<AnyType> insert(AnyType x, Node<AnyType> t) {
    	if(t == null)
    		return new Node<>(x, null, null);
    	
    	int compareResult = x.compareTo(t.element);
    	if(compareResult < 0)
    		t.left = insert(x, t.left);
    	else if(compareResult > 0)
    		t.right = insert(x, t.right);
    	else
    		;
    	
		return t;
	}
    /**
     * ɾ��ָ��Ԫ�صĽڵ�
     * 1.��ɾ���Ľڵ�ֻ��һ�����ӣ���ý��������丸�ڵ�����Լ�������ɾ��
     * (���ýڵ�����Ҷ�������ͬ����ʱ��ֵ��ֵΪnull)
     * 2.��ɾ���Ľڵ�ֻ���������ӣ���������������С�����ݴ���ýڵ�����ݣ�
     * ���ݹ��ɾ���Ǹ��ڵ�
     * @param x
     * @param t
     * @return
     */
    private Node<AnyType> remove(AnyType x, Node<AnyType> t) {
    	if(t == null)
    		return t;     //δ�ҵ���Ԫ��
    	
    	int compareResult = x.compareTo(t.element);
    	
    	if(compareResult < 0)
    		t.left = remove(x, t.left);
    	else if(compareResult > 0)
    		t.right = remove(x, t.right);
    	else if(t.left != null && t.right != null){   //Ҫɾ���Ľڵ�����������
    		t.element = findMin(t.right).element;
    		t.right = remove(t.element, t.right);
    	}
    	else
    		t = (t.left != null)?t.left:t.right;
    	
    	return t;
	}
    
    
    
    /*�������ı���*/
    //�������
    public void inOrder(){
    	this.inOrder(this.root);
    }
    private void inOrder(Node<AnyType> root){
    	if(root != null){
    		inOrder(root.left);
    		System.out.print(root.element + " ");
    		inOrder(root.right);
    	}
    }
  
    //�������
    public void preOrder(){
    	this.preOrder(this.root);
    }
    private void preOrder(Node<AnyType> root){
    	if(root != null){
    		System.out.print(root.element + " ");
    		preOrder(root.left);
    		preOrder(root.right);
    	}
    }

    //�������
    public void postOrder(){
    	this.postOrder(this.root);
    }
    private void postOrder(Node<AnyType> root){
    	if(root != null){
    		postOrder(root.left);
    		postOrder(root.right);
    		System.out.print(root.element + " ");
    	}
    }
    
    /**
     * ��α���������(ʹ�ö���)
     * �������Ƚ����ڵ��������У�Ȼ��ÿ�ζ��Ӷ�����ȡ��һ���ڵ��ӡ��
     *     ������ڵ����ӽڵ㣬�������ӽڵ�������β��ֱ������Ϊ��
     */
    public void layerTranverse(){
    	if(this.root == null){
    		return;
    	}
    	
    	Queue<Node<AnyType>> q = new LinkedList<Node<AnyType>>();
    	q.add(this.root);
    	while(!q.isEmpty()){
    		Node<AnyType> n = q.poll();
    		System.out.print(n.element + " ");
    		if(n.left != null){
    			q.add(n.left);
    		}
    		if(n.right != null){
    			q.add(n.right);
    		}
    		
    	}
    }

}
