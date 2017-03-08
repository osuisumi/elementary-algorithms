package other;

import chapter1.c1.Node;

public class App {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Node node = new Node(1,1);
		Node clo = node.clone();
		node.setKey(999);
		System.out.println(clo.getKey());
	}

}
