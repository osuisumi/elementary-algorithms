package fun;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * /*
ID: your_id_here
LANG: JAVA
TASK: test

import java.io.*;
import java.util.*;

class test {
  public static void main (String [] args) throws IOException {
    // Use BufferedReader rather than RandomAccessFile; it's much faster
    BufferedReader f = new BufferedReader(new FileReader("test.in"));
                                                  // input file name goes above
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
    // Use StringTokenizer vs. readLine/split -- lots faster
    StringTokenizer st = new StringTokenizer(f.readLine());
						  // Get line, break into tokens
    int i1 = Integer.parseInt(st.nextToken());    // first integer
    int i2 = Integer.parseInt(st.nextToken());    // second integer
    out.println(i1+i2);                           // output result
    out.close();                                  // close the output file
  }
}
 */
public class Test {
	public static void main(String[] args) {
		/*ABSTAR
		USACO*/
		/*int i = Integer.MAX_VALUE;
		System.out.println(Integer.valueOf(i));*/
		
		/*String comte = "";
		String group = "ISUMI";
		int cNum = 1;
		int gNum = 1;
		for(int i=0;i<comte.length();i++){
			cNum = (comte.charAt(i)-64) * cNum;
		}
		for(int i=0;i<group.length();i++){
			gNum = (group.charAt(i)-64) * gNum;
		}
		int cout = cNum%47;
		int gout = gNum%47;
		System.out.println(cout == gout?"GO":"STAY");*/
//		int r = 0;
//		int der = 200;
//		int d = 3;
//		r = der/d;
//		System.out.println(r);
//		BigDecimal my = new BigDecimal(34);
		
//		BigDecimal all = new BigDecimal(50);
//		System.out.println(my.compareTo(all));
		
//		int a = 1;
//		int b = 3;
//		DecimalFormat    df   = new DecimalFormat("######0.00"); 
//		double result = a*1.0/b*100;
//		String r =  df.format(result) + "%";
//		System.out.println(r);
		
		List<String> fa = new ArrayList<String>();
		fa.add("1");
		fa.add("2");
		fa.add("3");
		List<String> sub = new ArrayList<String>();
		sub.add("1");
		fa.removeAll(sub);
		System.out.println(fa.size());
	}
	
	
	public static int changeLetterToNum(char input){
		return input;
	}

}
