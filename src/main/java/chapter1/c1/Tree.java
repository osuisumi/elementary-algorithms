package chapter1.c1;

public class Tree {

	private int key;

	private Object data;

	private Tree left;

	private Tree right;

	public Tree(int key, Object data) {
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

	public Tree getLeft() {
		return left;
	}

	public void setLeft(Tree left) {
		this.left = left;
	}

	public Tree getRight() {
		return right;
	}

	public void setRight(Tree right) {
		this.right = right;
	}

	public void insert(int key, Object data) {
		if (key == this.key) {
			this.data = data;
		}else if(key<this.key){
			if(this.left == null){
				Tree l = new Tree(key,data);
				this.left = l;
			}else{
				this.left.insert(key, data);
			}
		}else{
			if(key>this.key){
				if(this.right == null){
					Tree r = new Tree(key,data);
					this.right = r;
				}else{
					this.right.insert(key, data);
				}
			}
		}
	}
	
	public static Tree defaultTree(){
		int keys [] = {3,8,10,11,99,0,14,7,55};
		Tree t = new Tree(3,null);
		for(int i=1;i<keys.length;i++){
			t.insert(keys[i], null);
		}
		return t;
	}

}
