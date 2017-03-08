package chapter1.c1;

import org.junit.Test;

public class Search {
	
	//look up
	@Test
	public void lookup(){
		
	}
	
	public Node lookUp(Node root,int key){
		if(root ==null){
			return null;
		}else if(root.getKey() == key){
			return root;
		}else if(root.getKey()<key){
			return lookUp(root.getRight(),key);
		}else{
			return lookUp(root.getLeft(),key);
		}
	}
	
	@Test
	public void maxAndmin(){
		Tree tree = Tree.defaultTree();
		System.out.println("max is" + max(tree.getRoot()).getKey());
		System.out.println("min is" + min(tree.getRoot()).getKey());
	}
	
	public Node max(Node root){
		if(root.getRight() == null){
			return root;
		}else{
			return max(root.getRight());
		}
	}
	
	public Node min(Node root){
		if(root.getLeft() == null){
			return root;
		}else{
			return max(root.getLeft());
		}
	}
	
	//successor and predcessor
	

}
