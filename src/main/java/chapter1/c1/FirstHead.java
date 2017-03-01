package chapter1.c1;

import org.junit.Test;

public class FirstHead {
	
	@Test
	public void test1(){
		Tree tree  = Tree.defaultTree();
		firstHead(tree);
		
	}
	
	/*
	 * 如果树为空，返回
	 * 否则先访问key，然后遍历左子树，最后遍历右子树
	 */
	
	public void firstHead(Tree tree){
		if(tree == null){
			return;
		}
		System.out.println(tree.getKey());
		firstHead(tree.getLeft());
		firstHead(tree.getRight());
	}

}
