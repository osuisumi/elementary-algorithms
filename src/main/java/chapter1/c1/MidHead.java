package chapter1.c1;

import org.junit.Test;

public class MidHead {
	
	@Test
	public void test1(){
		Tree tree  = Tree.defaultTree();
		mid(tree.getRoot());
		
	}
	
	/*
	 * 左跟右
	 */
	public void mid(Node node){
		if(node.getLeft()!=null){
			mid(node.getLeft());
		}
		System.out.println(node.getKey());
		if(node.getRight()!=null){
			mid(node.getRight());
		}
	}

}
