package Tree;

public class Test {

	public static void main(String[] args){
    	BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
    	int[] data = {2,8,7,4,9,3,1,6,7,5};
    	for(int i = 0; i < data.length; i++){
    		t.insert(data[i]);
    	}
    	
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
    }

}
