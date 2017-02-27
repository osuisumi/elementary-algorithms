package chapter1.c1;

import org.junit.Test;

public class LastHead {
	
	@Test
	public void test1(){
		Tree tree  = Tree.defaultTree();
		lastHead(tree);
		
	}
	
	/*
	 * 如果树为空 返回
	 * 否则先遍历左子树，再遍历右子树，然后访问key
	 */
	public void lastHead(Tree tree){
		if(tree == null){
			return;
		}
		lastHead(tree.getLeft());
		lastHead(tree.getRight());
		System.out.println(tree.getKey());
	}

}
