package other;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ExtendTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("other.Instance");
		Field [] fields = clazz.getDeclaredFields();
		Method [] methods = clazz.getDeclaredMethods();
		for(Field f:fields){
			System.out.println(f.getName());
		}
		for(Method m:methods){
			System.out.println(m.getName());
		}
		
	}

}
