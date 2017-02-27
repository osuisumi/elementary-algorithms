package fun;

public class DoubleLoop {
	
	public static void main(String[] args) {
		for(int i = 0;i<10;i++){
			for(int j = 0;j<i;j++){
				System.out.println("i:" +i);
				System.out.println("j" + j);
				if(j == 5){
					break;
				}
			}
		}
	}

}
