package chapter1.c1;

import org.junit.Test;

public class LastHead {
	
	@Test
	public void test1(){
		Tree tree  = Tree.defaultTree();
		lastHead(tree.getRoot());
		
	}
	
	/*
	 *左右跟
	 */
	public void lastHead(Node node){
		if(node.getLeft()!=null){
			lastHead(node.getLeft());
		}
		if(node.getRight()!=null){
			lastHead(node.getRight());
		}
		System.out.println(node.getKey());
	}

}
