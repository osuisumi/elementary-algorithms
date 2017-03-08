package chapter1.c1;

public class Node implements Cloneable{
	
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + key;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (key != other.key)
			return false;
		return true;
	}
	
	public String toString(){
		return String.valueOf(key);
	}
	@Override
	public Node clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Node) super.clone();
	}
	

}
