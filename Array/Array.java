package Array;

public class Array {
	/**
	 * Ѱ�������е���Сֵ�����ֵ
	 * ÿ�αȽ��������������ϴ�����Max�Ƚϣ���С����Min�Ƚ�,�Ƚϴ���Ϊ1.5N
	 * @param a
	 */
	public static MaxMin FindMaxAndMin(int[] a){
		int Max = a[0];
		int Min = a[0];
		int len = a.length;
		for(int i = 0; i < len-1; i += 2){
			if(i+1 > len){   //���鳤��Ϊż��ʱ�����һλ
				if(a[i] > Max){
					Max = a[i];
				}
				if(a[i] < Min){
					Min = a[i];
				}
			}
			//�Ƚ����ڵ��������ϴ�����Max�Ƚϣ���С����Min�Ƚ�
			if(a[i] > a[i+1]){
				if(a[i] > Max){
					Max = a[i];
				}
				if(a[i+1] < Min){
					Min = a[i+1];
				}
			}else{
				if(a[i+1] > Max){
					Max = a[i+1];
				}
				if(a[i] < Min){
					Min = a[i];
				}
			}
		}
		return new MaxMin(Max,Min);
	}

}

//�����ֵ����Сֵʱ����
class MaxMin{
	int Max;
	int Min;
	public MaxMin(int Max,int Min){
		this.Max = Max;
		this.Min = Min;
	}
}