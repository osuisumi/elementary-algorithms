package fun;

import java.util.Random;

public class MaxSeq {
	
	public static void main(String[] args) {
		int [] input = new int[10];
		Random r = new Random();
		for(int i=0;i<10;i++){
			input[i] =  r.nextInt(100) - r.nextInt(100);
		}
		printArray(input);
	}
	
	public static void  printArray(int[] in){
		for(int i:in){
			System.out.print(i + "   ");
		}
	}

}
