package Generic;

import java.util.Collection;

public class Generic<AnyType> {  //ָ��Generic��һ�����Ͳ���
	private AnyType storedValue; 
	
	public AnyType read(){
		return storedValue;
	}
	
	public void write(AnyType x){
		storedValue = x;
	}
	//ͨ���������ķ���
	public static double totalArea(Collection<? extends Shape> arr){
		double total = 0;
		
		for(Shape s:arr){
			if(s != null){
				total += s.area();
			}
		}
		return total;
	}
	
	//��ʽ���ͷ���
	public static <AnyType> boolean contains(AnyType[] arr, AnyType x){
		for(AnyType val:arr){
			if(x.equals(val)){
				return true;
			}
		}
		return false;
	}
	
	//�����޽�
    public static <AnyType extends Comparable<? super AnyType>> 
           AnyType findMax(AnyType[] arr){
        int maxIndex = 0;
        
        for(int i = 1; i < arr.length; i++){
        	if(arr[i].compareTo(arr[maxIndex]) > 0){
        		maxIndex = i;
        	}
        }
        
        return arr[maxIndex];
    }

}

class Shape{
	public double area(){
		return 1;
	}
}

class Square extends Shape{
	public double area(){
		return 1;
	}
}