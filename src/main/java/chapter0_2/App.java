package chapter0_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.junit.Test;


public class App {
	/*
	 * 最小可用id的暴力解法
	 */

	// 假设当前的使用id情况是
	private static Integer[] ids = {18, 4, 8, 9, 16, 1, 14, 7, 19, 3, 0, 5, 2, 11, 6};
	
	/*static{
		Random r = new Random();
		Set<Integer> set = new HashSet<>();
		int max = 1000000;
		for(int i=0;i<max;i++){
			set.add(r.nextInt(max));
		}
		Iterator<Integer> it = set.iterator();
		int i = 0;
		List<Integer> idsList = new ArrayList<>();
		while(it.hasNext()){
			idsList.add(it.next());
			i++;
		}
		ids = new Integer [idsList.size()];
		int index = 0;
		for(Integer id:idsList){
			//System.out.println(id);
			ids[index] = id;
			index ++ ;
		}
		ids[0] = 0;
		
	}*/

	/*
	 * 时间复杂度O(n*n)
	 */
	@Test
	public void simpleSulution() {
		int i = 0;
		boolean flg = true;
		long begin = System.currentTimeMillis();
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
		long end = System.currentTimeMillis();
		System.out.println((end-begin)/1000);
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
	
	/*
	 * 1234
	 * 12 34
	 * 3 4
	 * 4
	 * 
	 */
	
	/*
	 * 1235
	 * 12 35
	 * 35
	 * 3 5
	 * null 5
	 * 
	 */
	
	/*
	 * 1356
	 * 1 356
	 */
	/*
	 * 135
	 * 1 35
	 * 
	 */
	
	/*
	 * 125
	 * 12 5
	 */
	
	/*
	 * 697481
	 */
	
	public int findmin(List<Integer> input){
		//int size = 
		return 0;
	}
	

	public Integer findMin(List<Integer> input, Integer position,Integer size) {
		List<Integer> smallH = new ArrayList<Integer>();
		List<Integer> bigH = new ArrayList<Integer>();
		if (input.size() <= 1) {
			return position;
		}

		for (int i = 0; i < input.size(); i++) {
			if (input.get(i) <= (size+position) / 2) {
				smallH.add(input.get(i));
			} else {
				bigH.add(input.get(i));
			}
		}
		//double b = input.size() / 2.0;
		if (smallH.size() <= input.size() / 2) {
			return findMin(smallH, position,position + input.size()/2);
		}
		return findMin(bigH, (size+position) / 2,size);
	}

}
