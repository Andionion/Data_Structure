package Generic;

import java.util.Collection;
import java.util.LinkedList;

public class BoxingDemo {   //�Զ�װ����Զ�����

	public static void main(String[] args) {
		Generic<String> g = new Generic<>();
		
		g.write("aas");
		String val = g.read();
		System.out.println("ֵΪ��" + val);
		
		Collection<Square> arr = new LinkedList<Square>();
		arr.add(new Square());
		g.totalArea(arr);

	}

}
