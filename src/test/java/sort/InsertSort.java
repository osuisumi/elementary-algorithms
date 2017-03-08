package sort;

import java.util.ArrayList;
import java.util.List;

import utils.InputUtils;

public class InsertSort {
	
	public static void main(String[] args) {
		int [] input = InputUtils.array(10, 99);
		InputUtils.print(input);
		List<Integer> sorted = new ArrayList<Integer>();
		for(int i:input){
			insert(i,sorted);
		}
		InputUtils.print(sorted);
	}
	
	private static void insert(int num,List<Integer> sorted){
		if(sorted.isEmpty()){
			sorted.add(num);
		}else{
			boolean added = false;
			for(int i=0;i<sorted.size();i++){
				if(num<=sorted.get(i)){
					sorted.add(i, num);
					added = true;
					break;
				}
			}
			if(!added){
				sorted.add(sorted.size(), num);
			}
		}
	};
	

}
