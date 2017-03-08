package chapter1.c1;

public class Node {
	
	private int key;

	private Object data;

	private Node left;

	private Node right;
	
	private int num = 1;
	
	public Node(){}
	public Node(int key,Object data){
		this.key = key;
		this.data = data;
	}
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	

}
