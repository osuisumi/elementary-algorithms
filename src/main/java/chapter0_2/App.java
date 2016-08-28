package chapter0_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class App {
	/*
	 * 最小可用id的暴力解法
	 */

	// 假设当前的使用id情况是[18, 4, 8, 9, 16, 1, 14, 7, 19, 3, 0, 5, 2, 11, 6]
	private static int[] ids = { 18, 4, 8, 9, 16, 1, 14, 7, 19, 3, 0, 5, 2, 11, 6 ,10,12,13};

	/*
	 * 时间复杂度O(n*n)
	 */
	@Test
	public void simpleSulution() {
		int i = 0;
		boolean flg = true;
		while (flg) {
			for (int j = 0; j < ids.length; j++) {
				if (ids[j] == i) {
					i++;
					break;
				} else {
					if (j == ids.length - 1) {
						flg = false;
					}
				}

			}
		}

		System.out.println(i);
	}

	/*
	 * 改进1,时间复杂度为O(n)
	 */
	@Test
	public void changeWithSign() {
		boolean[] flgs = new boolean[ids.length];
		for (int i = 0; i < flgs.length; i++) {
			flgs[i] = false;
		}
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] < ids.length) {
				flgs[ids[i]] = true;
			}
		}
		for (int i = 0; i < flgs.length; i++) {
			if (!flgs[i]) {
				System.out.println(i);
				break;
			}
		}
	}

	/*
	 * 改进2,减少标志flgs的空间消耗 类似二分法
	 */

	@Test
	public void finalSolution() {
		List<Integer> input = new ArrayList<Integer>();
		for(int i=0;i<ids.length;i++){
			input.add(ids[i]);
		}
		System.out.println(findMin(input,0,input.size()));;
	}
	
	@Test
	public void test(){
		System.out.println(ids.length);
	}
	

	public Integer findMin(List<Integer> input, Integer position,Integer size) {
		List<Integer> smallH = new ArrayList<Integer>();
		List<Integer> bigH = new ArrayList<Integer>();
		if (input.size() <= 1) {
			return position;
		}

		for (int i = 0; i < input.size(); i++) {
			if (input.get(i) < (size+position) / 2) {
				smallH.add(input.get(i));
			} else {
				bigH.add(input.get(i));
			}
		}
		//double b = input.size() / 2.0;
		if (smallH.size() < input.size() / 2) {
			return findMin(smallH, position,position + input.size()/2);
		}
		return findMin(bigH, (size+position) / 2,size);
	}

}
