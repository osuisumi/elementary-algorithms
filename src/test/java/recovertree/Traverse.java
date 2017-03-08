package recovertree;



import org.junit.Test;

import chapter1.c1.Node;
import chapter1.c1.Tree;

public class Traverse {
	
	public Tree tree = Tree.defaultTree();
	
	
	
	@Test
	public void preorderTest(){
		preorder(tree.getRoot());
	}
	
	@Test
	public void inorderTest(){
		inorder(tree.getRoot());
	}
	
	public void inorder(Node tree){
		if(tree.getLeft()!=null){
			inorder(tree.getLeft());
		}
		System.out.println(tree.getKey());
		if(tree.getRight()!=null){
			inorder(tree.getRight());
		}
	}
	
	
	
	public void preorder(Node tree){
		System.out.println(tree.getKey());
		if(tree.getLeft()!=null){
			preorder(tree.getLeft());
		}
		if(tree.getRight()!=null){
			preorder(tree.getRight());
		}
	}
	
	

}
