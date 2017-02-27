package chapter0.c3;

import org.junit.Test;

public class App {
	/*
	 * 丑数,只含有2,3,5三个因子的自然数
	 */

	// 暴力解法 从1开始递增便利
	@Test
	public void simpleMethod() {
		int count = 1;
		int index = 1;
		while (count <= 1500) {
			int result = index;
			while (result % 2 == 0) {
				result = result / 2;
			}
			while (result % 3 == 0) {
				result = result / 3;
			}
			while (result % 5 == 0) {
				result = result / 5;
			}
			if(result == 1){
				System.out.println(index);
				count ++ ;
			}
			index++;
		}
	}

}
