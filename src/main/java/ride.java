/*
ID: osuisum1
LANG: JAVA
TASK: ride
*/
import java.io.*;
import java.util.*;

class ride{
	public static void main(String[] args) throws IOException{
		BufferedReader f = new BufferedReader(new FileReader("ride.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		StringTokenizer st = new StringTokenizer("\n");
		String comet = st.nextToken();
		String group = st.nextToken();
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
