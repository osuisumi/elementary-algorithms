package fun;

public class HowMany1 {
	//1 0 ----1
	//0-99 10 +8 + 1 
	//0-999 10*10 + 8*10 + 8*10
	//111111111 200000000
	//0 - 9999,9999
	
//	public static void main(String[] args) {
//		int count1 = 0;
//		for(int i=0;i<=9999;i++){
//			count1 = count1 + String.valueOf(i).length() - String.valueOf(i).replaceAll("1", "").length();
//		}
//		System.out.println(count1);
//	}
	
	
	public static void main(String[] args){
		int digit = 4;
		//1-digit
		double result = 0;
		for(int i=1;digit-i>=0;i++){
			result = result + i*c(digit,i)*Math.pow(9,digit-i);
		}
		System.out.println(result);
	}
	
	
	public static int c(int n,int m){
		if(n == m){
			return 1;
		}
		return jc(n)/(jc(m)*jc(n-m));
	}

	public static int jc(int n){
		int result = n;
		for(;n>=2;n--){
			result = result * (n-1);
		}
		return result;
	}
	

}
