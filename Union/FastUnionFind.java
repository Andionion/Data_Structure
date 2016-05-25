package Union;

public class FastUnionFind {
	Node[] node;
	//���鼯�еĽ��
	private static class Node{
		int parent;
		boolean root;
		
		private Node(){
			parent = 1;
			root = true;
		}
	}
	//��ʼ������
	public FastUnionFind(int n){
		node = new Node[n + 1];
		for(int e= 0; e <= n; e++){
			node[e] = new Node();
		}
	}
	/*
	 * find����(����)
	 * ��Ԫ��e��Ӧ�Ľ���ߵ����������ҳ����ڼ��ϵ�����
	 */
	public int find(int e){
		int current = e, p ,gp;
		/*�ų���ǰ�����丸���Ϊ��������󣬼���find*/
		if(node[current].root){
			return current;
		}
		p = node[current].parent;
		if(node[current].root){
			return p;
		}
		gp = node[current].parent;
		
		while(true){
			node[current].parent = gp;
			if(node[gp].root){
				return gp;
			}
			current = p;
			p = gp;
			gp = node[p].parent;
		}
	}
	/*
	 * �ϲ���������(����)
	 * ����ʾС����������Ϊ��ʾ�����������Ķ��ӽ��
	 */
	public void union(int a, int b){
		if(node[a].parent < node[b].parent){
			node[b].parent += node[a].parent;
			node[a].root = false;
			node[a].parent = a;
		}else{
			node[a].parent += node[b].parent;
			node[b].root = false;
			node[b].parent = a;
		}
	}

}
