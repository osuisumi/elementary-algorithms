package chapter1.c3;

public class RBNode {
	
	private int key;
	private Object data;
	private RBNode left;
	private RBNode right;
	private int color;//0为红节点，1为黑节点
	private int num = 1;
	
	
	/*
	 * 如果一个节点是红色，那么子节点全是黑色
	 * 所有到叶子节点的路径上具有相同的黑节点数量
	 * 根节点是黑色的
	 * 所有的叶子节点是黑色
	 */
	
	public RBNode(){}
	
	public RBNode(int key,Object data){
		this.key = key;
		this.data = data;
	}
	
	public RBNode(int key,Object data,int color){
		this.key = key;
		this.data = data;
		this.color = color;
	}
	
	public static RBNode rNodeInstance(int key,Object data){
		return new RBNode(key,data,0);
	}
	
	public static RBNode bNodeInstance(int key,Object data){
		return new RBNode(key,data,1);
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
	public RBNode getLeft() {
		return left;
	}
	public void setLeft(RBNode left) {
		this.left = left;
	}
	public RBNode getRight() {
		return right;
	}
	public void setRight(RBNode right) {
		this.right = right;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	

}
