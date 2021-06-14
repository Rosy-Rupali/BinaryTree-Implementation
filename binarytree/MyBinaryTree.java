/**************************************************
 * Purpose : Binary search tree implementation
 * @author Rosy Rupali
 * @since 14-06-2021
 * @version 1.0
 *
 *************************************************/
package binarytree;

public class MyBinaryTree<K extends Comparable<K>> {

	MyBinaryNode<K> root;

	/**
	 * This method is use add the node to the tree
	 * 
	 * @param key
	 */
	public void add(K key) {
		this.root = addRecursively(root, key);
	}

	/**
	 * This method is to find out size of BST(In reference of height of tree)
	 * @return
	 */
	public int getSize() {
		return this.getSizeRecursive(root);
	}

	/**
	 * Recursive function
	 * @param current
	 * @return
	 */
	private int getSizeRecursive(MyBinaryNode<K> current) {
		if (current == null) {
			return 0;
		} else {
			return 1 + getSizeRecursive(current.left) + getSizeRecursive(current.right);
		}
	}

	/**
	 * Recursive function to add node to BST
	 * 
	 * @param current
	 * @param key
	 * @return
	 */
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null) {
			return new MyBinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0) {
			return current;
		} else if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}
	
	/**
	 * This method is use to search node in BST
	 * @param key
	 * @return
	 */
	public MyBinaryNode<K> search(K key) {
		return searchRecursive(root, key);
	}

	/**
	 * Recursive method for searching purpose in BST
	 * @param current
	 * @param key
	 * @return
	 */
	private MyBinaryNode<K> searchRecursive(MyBinaryNode<K> current, K key) {
		if (current == null)    // root is not present
		return null;
		else if(current.key.compareTo(key) == 0)      // root is the key present
			return current;
		else if(current.key.compareTo(key) < 0)      // key is greater than the root node
			return searchRecursive(current.right, key);
		else
			return searchRecursive(current.left, key);    // key is smaller than the root node 
	}

	/**
	 * It displays the node
	 */
	public void printNodes() {
		printNodes(root);

	}

	/**
	 * Inorder traversal is performed if left node is visited first , then the root
	 * and at last right node is visited
	 * 
	 * @param root
	 */
	private void printNodes(MyBinaryNode<K> root) {
		if (root != null) {
			if (root.left != null)
				printNodes(root.left);
			System.out.println(root.key);
			if (root.right != null)
				printNodes(root.right);

		}
	}

}
