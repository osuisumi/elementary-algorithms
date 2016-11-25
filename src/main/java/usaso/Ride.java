package usaso;
/*
ID: osuisum1
LANG: JAVA
TASK: Ride
*/
import java.io.*;
import java.util.*;

public class Ride {
	
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("ride.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		String comet = f.readLine();
		String group = f.readLine();
		int cNum = 1;
		int gNum = 1;
		for(int i=0;i<comet.length();i++){
			cNum = (comet.charAt(i)-64) * cNum;
		}
		for(int i=0;i<group.length();i++){
			gNum = (group.charAt(i)-64) * gNum;
		}
		int cout = cNum%47;
		int gout = gNum%47;
		out.println(cout == gout?"GO":"STAY");
		out.close();
		
	}

}
