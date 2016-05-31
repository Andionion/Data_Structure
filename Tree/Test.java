package Tree;

public class Test {

	public static void main(String[] args){
    	BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
    	int[] data = {2,8,7,4,9,3,1,6,7,5};
    	
    	System.out.print("����������ǰ��");
    	for(int i = 0; i < data.length; i++){
    		t.insert(data[i]);
    		System.out.print(data[i] + " ");
    	}
    	System.out.println();
    	
    	System.out.print("�����������������");
    	t.inOrder();
    	System.out.println();
    	System.out.print("�����������������");
    	t.preOrder();
    	System.out.println();
    	System.out.print("�������ĺ��������");
    	t.postOrder();
    	System.out.println();
    	System.out.print("�������Ĳ�α�����");
    	t.layerTranverse();
    	System.out.println();
    	
    	System.out.print("��������ɾ����");
    	t.remove(8);
    	t.inOrder();
    	System.out.println();
    	
    	System.out.print("�������Ĳ��룺");
    	t.insert(0);
    	t.inOrder();
    	System.out.println();
    	
    	//�����������
//    	PostOrder<Integer> t = new PostOrder<Integer>();
//    	int[] preOrder = {2,1,8,7,4,3,6,5,9};
//    	int[] inOrder = {1,2,3,4,5,6,7,8,9};
//    	t.initTree(preOrder, inOrder);
//    	t.postOrder();
    }

}
