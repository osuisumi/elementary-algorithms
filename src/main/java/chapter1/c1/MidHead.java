package chapter1.c1;

import org.junit.Test;

public class MidHead {
	
	@Test
	public void test1(){
		Tree tree  = Tree.defaultTree();
		mid(tree);
		
	}
	
	/*
	 * 如果为空，返回
	 * 否则先遍历左子树，然后访问key，然后遍历右子树
	 */
	public void mid(Tree tree){
		if(tree == null){
			return;
		}
		if(tree.getLeft()!=null){
			mid(tree.getLeft());
		}
		System.out.print(tree.getKey()+",");
		mid(tree.getRight());
	}

}
