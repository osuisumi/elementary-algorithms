package chapter1.c1;

import org.junit.Test;

public class Search {
	
	//look up
	@Test
	public void lookup(){
		System.out.println(lookUp(Tree.defaultTree(),3) == null?"找不到喂":"哎呀，找到啦");
	}
	
	public Tree lookUp(Tree root,int key){
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
		System.out.println("max is" + max(tree).getKey());
		System.out.println("min is" + min(tree).getKey());
	}
	
	public Tree max(Tree root){
		if(root.getRight() == null){
			return root;
		}else{
			return max(root.getRight());
		}
	}
	
	public Tree min(Tree root){
		if(root.getLeft() == null){
			return root;
		}else{
			return max(root.getLeft());
		}
	}
	
	//successor and predcessor
	

}
