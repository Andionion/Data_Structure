package BitOperation;

public class BitOperation {

	/**
	 * �ж�һ�����Ƿ�Ϊ2��n�η�
	 * @param n
	 * @return
	 */
	public static boolean isPower(int n){
		if(n < 1){
			return false;
		}
		int i = 1;
		while(i <= n){
			if(i == n){
				return true;
			}
			i <<= 1;     //ÿ������һλ���൱��i *= 2
		}
		return false;
	}

	
}
