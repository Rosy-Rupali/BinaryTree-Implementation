/**************************************************
 * Purpose : Binary search tree implementation
 * @author Rosy Rupali
 * @since 15-06-2021
 * @version 1.0
 *
 *************************************************/
package binarytree;

public class MyBinaryTree<K extends Comparable<K>> {
	
	MyBinaryNode<K> root;
	
	/**
	 * This method is use add the node to the tree
	 * @param key 
	 */
	public void add(K key) {
		this.root = addRecursively(root, key);
	}

	/**
	 * Recursive function to add node to BST
	 * @param current 
	 * @param key 
	 * @return
	 */
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
			if(current == null) {
				return new MyBinaryNode<>(key);
			}
			int compareResult = key.compareTo(current.key);
			if(compareResult == 0) {
				return current;
			}else if(compareResult < 0) {
				current.left = addRecursively(current.left, key);
			}else {
				current.right = addRecursively(current.right, key);
			}
		return current;
	}
	
	
	
	/**
	 *It displays the node
	 */
	public void printNodes(){
			printNodes(root);
		
	}
	/**
	 * Inorder traversal is performed if left node is visited first , then the root and at last right node is visited
	 * @param root
	 */
	private void printNodes(MyBinaryNode<K> root) {
		if (root != null) {
			if(root.left != null) 
			printNodes(root.left);
			System.out.println(root.key);
			if(root.right != null) 
			printNodes(root.right);
			
		}
	}
		
}