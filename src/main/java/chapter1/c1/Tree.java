package chapter1.c1;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

import utils.InputUtils;

public class Tree {
	
	private Node root;
	
	private int nodeNum = 0;
	

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public int getNodeNum() {
		return nodeNum;
	}

	public void setNodeNum(int nodeNum) {
		this.nodeNum = nodeNum;
	}

	public void insert(int key, Object data) {
		if(root == null){
			this.root = new Node(key,data);
		}else{
			insert(root,new Node(key,data));
		}
		this.nodeNum ++ ;
	
	}
	
	private void insert(Node parent,Node preIn){
		if(parent.getKey() == preIn.getKey()){
			parent.setNum(parent.getNum() +1);
		}else if(preIn.getKey()>parent.getKey()){
			if(parent.getRight() == null){
				parent.setRight(preIn);
			}else{
				insert(parent.getRight(),preIn);
			}
		}else{
			if(parent.getLeft() == null){
				parent.setLeft(preIn);
			}else{
				insert(parent.getLeft(),preIn);
			}
		}
	}
	
	public static Tree defaultTree(){
		Tree tree = new Tree();
		int  [] defaultN = InputUtils.array(10);
		for(int i:defaultN){
			tree.insert(i, i);
		}
		return tree;
	}
	
	public Node getNode(int key){
		return get(root,key);
	}
	
	public boolean contain(int key){
		return contain(root,key);
	}
	
	public Node findMin(){
		return findMin(root);
	}
	
	public Node findMax(){
		return findMax(root);
	}
	
	public List<Node> preOrder(){
		ArrayList<Node> result = new ArrayList<Node>();
		preOrder(root,result);
		return result;
	}
	
	public List<Node> inOrder(){
		ArrayList<Node> result = new ArrayList<Node>();
		inorder(root, result);
		return result;
	}
	
	public List<Node> lastOrder(){
		ArrayList<Node> result = new ArrayList<Node>();
		lastOrder(root, result);
		return result;
	}
	
	private void preOrder(Node node,ArrayList<Node> result){
		result.add(node);
		if(node.getLeft()!=null){
			preOrder(node.getLeft(),result);
		}
		if(node.getRight()!=null){
			preOrder(node.getRight(),result);
		}
	}
	
	private void inorder(Node node,ArrayList<Node> result){
		if(node.getLeft()!=null){
			inorder(node.getLeft(),result);
		}
		result.add(node);
		if(node.getRight()!=null){
			inorder(node.getRight(),result);
		}
	}
	
	private void lastOrder(Node node,ArrayList<Node> result){
		if(node.getLeft()!=null){
			lastOrder(node.getLeft(),result);
		}
		if(node.getRight()!=null){
			lastOrder(node.getRight(),result);
		}
		result.add(node);
	}
	
	private Node findMin(Node node){
		if(node.getLeft()!=null){
			return findMin(node.getLeft());
		}else{
			return node;
		}
	}
	
	private Node findMax(Node node){
		if(node.getRight()!=null){
			return findMax(node.getRight());
		}else{
			return node;
		}
	}
	
	private Node get(Node node,int key){
		if(key == node.getKey()){
			return node;
		}else if(key<node.getKey()){
			if(node.getLeft() == null){
				return null;
			}else{
				return get(node.getLeft(),key);
			}
		}else{
			if(node.getRight() == null){
				return null;
			}else{
				return get(node.getRight(),key);
			}
		}
	}
	
	private boolean contain(Node node,int key){
		if(node.getKey() == key){
			return true;
		}else if(key<node.getKey()){
			if(node.getLeft()!=null){
				return contain(node.getLeft(),key);
			}else{
				return false;
			}
		}else{
			if(node.getRight()!=null){
				return contain(node.getRight(),key);
			}else{
				return false;
			}
		}
	}
	
	
	
	
}
