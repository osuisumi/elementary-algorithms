package chapter1.c1;

import org.junit.Test;

public class FirstHead {
	
	@Test
	public void test1(){
		Tree tree  = Tree.defaultTree();
		firstHead(tree.getRoot());
		
	}
	
	/*
	 * 根左右
	 * 
	 */
	
	public void firstHead(Node node){
		System.out.println(node.getKey());
		if(node.getLeft()!=null){
			firstHead(node.getLeft());
		}
		if(node.getRight()!=null){
			firstHead(node.getRight());
		}
	}

}
