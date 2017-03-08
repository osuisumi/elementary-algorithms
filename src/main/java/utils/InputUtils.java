package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InputUtils {
	static Random r = new Random();
	
	public static int []  array(int length){
		return array(length,999);
	}
	
	public static int[] array(int length,int max){
		int [] result = new int[length];
		for(int i=0;i<length;i++){
			result[i] = nextInt(max);
		}
		return result;
	}
	
	public static int nextInt(int max){
		return r.nextInt(max);
	}
	
	public static void print(int [] input){
		for(int a:input){
			System.out.print(a + ",");
		}
		System.out.println();
	}
	
	public static void print(List input){
		for(Object obj:input){
			System.out.print(obj + ",");
		}
		System.out.println();
	}
	
	public static List<Integer> list(int length,int max){
		List<Integer> result = new ArrayList<Integer>();
		for(int i:array(length,max)){
			result.add(i);
		}
		return result;
	}
	
	public static List<Integer> list(int length){
		return list(length,999);
	}
	
	
	public static void main(String[] args) {
		List<Integer> input = list(10);
		print(input);
	}
	

}
