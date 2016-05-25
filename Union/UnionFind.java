package Union;

/**
 * 
 * @author LIn
 * ���鼯��ʵ��
 * unionʱ�临�Ӷȣ�O(1)
 * ������find��ʱΪO(n^2),��Ϊ�ϲ�����ʹn���������˻���һ����
 */
public class UnionFind {
	Node[] node;   //��������
	//���鼯�еĽ��
	private static class Node{
		int parent;
		boolean root;
		
		private Node(){
			parent = 1;
			root = true;
		}
	}
	//��ÿ��Ԫ�س�ʼ��Ϊһ�ŵ������
	public UnionFind(int n){
		node = new Node[n + 1];
		for(int e= 0; e <= n; e++){
			node[e] = new Node();
		}
	}
	/*
	 * find������Ǵ�Ԫ��e��Ӧ�Ľ���ߵ����������ҳ����ڼ��ϵ�����
	 */
	public int find(int e){
		while(!node[e].root){
			e = node[e].parent;
		}
		return e;
	}
	/*
	 * union���㣬�ϲ���������
	 * ֻҪ����ʾ����һ�����ϵ�����������Ϊ��ʾ��һ�����ϵ����������Ķ��ӽ��
	 */
	public void union(int a, int b){
		node[a].parent += node[b].parent;
		node[b].root = false;
		node[b].parent = a;
	}

}
