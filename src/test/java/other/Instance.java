package other;

public class Instance {
	
	private String f1;
	private void m1(){
		System.out.println("call m1");
	}
	
	protected  void m2(){
		System.out.println("call m2");
	}
	
	protected native void m3();
	
	public void m4(){
		System.out.println("m4");
		m1();
	}
	

}
