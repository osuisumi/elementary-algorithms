package chapter1.c3;

public class RBTree {
	
	private RBNode root;
	
	private int nodeNum;
	
	public int getNodeNum() {
		return nodeNum;
	}

	public RBNode getRoot() {
		return root;
	}

	public void setRoot(RBNode root) {
		this.root = root;
	}
	
	public void insert(int key,Object data){
		if(root == null){
			RBNode root = RBNode.bNodeInstance(key, data);
			this.root = root;
		}else{
			insert(root,RBNode.rNodeInstance(key, data));
		}
		this.nodeNum ++ ;
	}
	
	private void insert(RBNode parent,RBNode preIn){
		if(preIn.getKey() == parent.getKey()){
			parent.setNum(parent.getNum() + 1);
		}else if(preIn.getKey() > parent.getKey()){
			if(parent.getRight()!=null){
				insert(parent.getRight(),preIn);
			}else{
				//检查结构是否被破坏
				parent.setRight(preIn);
			}
		}else{
			if(parent.getLeft()!=null){
				insert(parent.getLeft(),preIn);
			}else{
				//检查结构是否被破坏
				parent.setLeft(preIn);
			}
		}
	}
	
	

}
