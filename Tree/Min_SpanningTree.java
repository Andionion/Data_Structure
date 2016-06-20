package Tree;

import Heap.MinHeap;
import Union.FastUnionFind;

public class Min_SpanningTree {
	/**
	 * prim�㷨
	 * ��������δ��ͨ�ļ����У��ӵ�ǰ������ڽӶ������ҳ���һ��ʹȨ��С�Ķ���
	 * @param n
	 * @param c
	 * c[x][y]��ʾ����x������y�ľ��룬����(i,j)��Ȩ
	 */
	public static void prim(int n,float[][] c){
		float[] lowcost = new float[n+1]; //���㵽���ڽӶ���ľ���
		int[] closest = new int[n+1];     //�ڽӶ���
		boolean[] s = new boolean[n+1];   //�ж϶����Ƿ�����ͨ����Ϊ����ͨ�Ķ��㼯��
		
		s[1] = true;                   //ѡ�е�һ������
		for(int i = 2; i <= n; i++){   //��ʼ�����㼯��
			lowcost[i] = c[1][i];
			closest[i] = 1;
			s[i] = false;
		}
		
		for(int i = 1; i <= n; i++){
			float min = Integer.MAX_VALUE;
			int j = 1;
			for(int k = 2; k <= n; k++){        //ѡȡȨ��С���ڽӶ���
				if(lowcost[k] < min && (!s[k])){
			        min = lowcost[k];
			        j = k;
			    }
			}
			System.out.println(j + ", " + closest[j]);
			s[j] = true;                     //��������뵽����ͨ�ļ�����
			for(int k = 2; k <= n; k++){     //�����¼���Ķ��㣬���¸������Ȩ��С�ڽӶ���
			    if((c[j][k] < lowcost[k]) && (!s[k])){
					lowcost[k] = c[j][k];
			        closest[k] = j;         
			    }
			}
		}
	}
	
	
	
	//��д�ɱȽϽӿڵ��࣬��ʾ�����˽��ı�
	static class EdgeNode implements Comparable{
		float weight;
		int u,v;   //u,vΪһ�������˵Ķ���
		
		public EdgeNode(int u,int v,float w){  //�ߵĹ��캯��
			this.u = u;
			this.v = v;
			this.weight = w;
		}

		@Override
		public int compareTo(Object x) {    //��д�ȽϷ���
			double xw = ((EdgeNode)x).weight;
			if(weight < xw){
				return -1;
			}
			if(weight == xw){
				return 0;
			}
			return 1;
		}	
	}
	
	/**
	 * kruskal�㷨
	 * ��������δ����ͨ��֧�ı���ѡ��Ȩ��С�ı�
	 * @param n  ������
	 * @param e  ����
	 * @param E  �ߵ�Ȩ
	 * @param t  �õ�����С������
	 * @return
	 */
//	public static boolean kruskal(int n,int e,EdgeNode[] E,EdgeNode[] t){
//		MinHeap H = new MinHeap(1);        //������С��/���ȶ���
//		H.initialize(E,e);
//		FastUnionFind U = new FastUnionFind(n);   //��ʼ�����鼯
//		int k = 0;
//		while(e > 0 && k < n-1){
//			EdgeNode x = (EdgeNode)H.removeMin();   //��ǰ��С�߳���
//			e--;
//			int a = U.find(x.u);
//			int b = U.find(x.v);
//			if(a != b){     //�ߵ��������㲻����ͬһ��ͨ��֧
//				t[k++] = x;
//				U.union(a,b);   //������ͨ��֧
//			}
//		}
//		return (k == n-1);
//	}

}
