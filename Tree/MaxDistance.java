package Tree;

public class MaxDistance {
	private int maxLen = 0;
	
	public void findMaxDistance(DNode root){
		if(root == null){
			return;
		}
		if(root.left == null){
			root.leftMax = 0;
		}
		if(root.right == null){
			root.rightMax = 0;
		}
		
		if(root.left != null){
			findMaxDistance(root.left);
		}
		if(root.right != null){
			findMaxDistance(root.right);
		}
		
		//�������������о�����ڵ��������
		if(root.left != null){
			root.leftMax = Math.max(root.leftMax, root.rightMax) + 1;
		}
		if(root.right != null){
			root.rightMax = Math.max(root.leftMax, root.rightMax) + 1;
		}
		
		//��ȡ���������нڵ��������
		if(root.leftMax + root.rightMax > maxLen){
			maxLen = root.leftMax + root.rightMax;
		}
	}

}

class DNode{
	public int element;
	public DNode left;
	public DNode right;
	public int leftMax;
	public int rightMax;
	public DNode(int element){
		this.element = element;
		this.left = null;
		this.right = null;
	}
}