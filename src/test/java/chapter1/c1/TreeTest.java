package chapter1.c1;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TreeTest {
	
	Tree tree = Tree.defaultTree();
	
	@Test
	public void testFind(){
		tree.insert(987, 987);
		Assert.assertEquals(tree.getNode(987).getData(), 987);
	}
	
	@Test
	public void testContain(){
		tree.insert(12, "xjias");
		Assert.assertTrue(tree.contain(12));
	}
	
	@Test
	public void findMin(){
		List<Node> sort = tree.inOrder();
		Assert.assertTrue(tree.findMin().equals(sort.get(0)));
	}
	
	@Test
	public void findMax(){
		List<Node> sort = tree.inOrder();
		Assert.assertTrue(tree.findMax().equals(sort.get(sort.size()-1)));
	}

}
