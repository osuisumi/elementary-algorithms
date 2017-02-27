package fun;

import java.util.ArrayList;
import java.util.List;

public class SqueNum {
	
	private static int sqe = 0;
	
	public synchronized static int getSqeNum(){
		return sqe++;
	}
	
	public static void main(String[] args) {
		List<App> apps = new ArrayList();
		for(int i=0;i<10;i++){
			App app = new App();
			app.start();
		}
	}

}

class App extends Thread{

	@Override
	public void run() {
		System.out.println(SqueNum.getSqeNum() + "");
	}
	
}
