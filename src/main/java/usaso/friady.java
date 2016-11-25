package usaso;

import java.io.BufferedReader;
import java.io.FileReader;

public class friady {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(friady.class.getResource("friday.in").getPath()));
		int [] leap = {31,29,31,30,31,30,31,31,30,31,30,31};
		int [] nleap = {31,28,31,30,31,30,31,31,30,31,30,31};
		int input = Integer.valueOf(br.readLine());
		int [] result = {0,0,0,0,0,0,0};
		int offset = 0;
		for(int i=0;i<input;i++){
			int year = 1900 + i;
			result[(offset + 13)%7] ++;
			for(int j = 0;j<11;j++){
				offset = isLeap(year)?(offset + leap[j]):(offset + nleap[j]);
				result[(offset+13)%7]++;
			}
			offset = offset + leap[11];
		}
		System.out.print(result[6]+"       ");
		for(int i=0;i<=5;i++){
			System.out.print(result[i] + "       ");
		}
	}
	
	private static boolean isLeap(int year){
		if(year%100 == 0){
			return year%400==0?true:false;
		}else{
			return year%4==0?true:false;
		}
	}

}
