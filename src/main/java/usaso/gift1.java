package usaso;

/*
ID: osuisum1
LANG: JAVA
TASK: Ride
*/
import java.io.*;
import java.util.*;

public class gift1 {
	public static void main(String[] args) throws Exception {
		BufferedReader f = new BufferedReader(new FileReader(gift1.class.getResource("gift1.in").getPath()));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(gift1.class.getResource("gift1.out").getPath())));
		Iterator<String> iterator = f.lines().iterator();
		int cursor = 0;
		int userCount = 0;
		String gifter = "";
		int gifterLine = 0;
		int giftMoney = 0;
		int giftNum = 0;
		Map<String,Integer> nameMoney = new LinkedHashMap<String,Integer>();
		//linetype userCount username  gifter gifterdiside revever
		while(iterator.hasNext()){
			String line = iterator.next().trim();
			if(cursor == 0){
				userCount = Integer.valueOf(line);
			}else if(cursor<=userCount){
				nameMoney.put(line, 0);
			}else{
				if(gifter.equals("")){
					gifter = line;
					gifterLine = cursor;
					System.out.println("-----------"+gifterLine);
				}else if(cursor - gifterLine == 1){
					StringTokenizer st = new StringTokenizer(line);
					int giftAllMoney = Integer.valueOf(st.nextToken());
					giftNum = Integer.valueOf(st.nextToken());
					if(giftNum == 0){
						gifter = "";
						gifterLine = 0;
						giftMoney = 0;
						giftNum = 0;
						continue;
					}
					nameMoney.put(gifter,nameMoney.get(gifter)-giftAllMoney);
					System.out.println(gifter + " - " + giftAllMoney + " ======" + (nameMoney.get(gifter)));
					if(giftAllMoney == 0){
						giftMoney = 0;
					}else{
						int leftMoney = giftAllMoney%giftNum;
						if( leftMoney!= 0){
							nameMoney.put(gifter, nameMoney.get(gifter)+leftMoney);
							System.out.println(gifter + " + " + leftMoney + " ======" + (nameMoney.get(gifter)));
						}
						giftMoney = giftAllMoney/giftNum;
					}
				}else{
					nameMoney.put(line,nameMoney.get(line)+giftMoney);
					System.out.println(line + "+" + giftMoney + "=======" + (nameMoney.get(line)));
					//handel money
					if(cursor-gifterLine-1 == giftNum){
						System.out.println("reset" + cursor + "------" + gifterLine + "--------" + giftNum);
						gifter = "";
						gifterLine = 0;
						giftMoney = 0;
						giftNum = 0;
					}
				}
			}
			cursor++;
		}
		for(Map.Entry s:nameMoney.entrySet()){
			System.out.println(s.getKey() + " " + s.getValue());
		}
		
		out.close();
	}
	
	
	

}
