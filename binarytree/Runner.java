package binarytree;

public class Runner {

	public static void main(String[] args) {
		MyBinaryTree<Integer> BST = new MyBinaryTree<>();
		BST.add(30);
		BST.add(56);
		BST.add(70);
		BST.add(4);
		BST.add(78);
		BST.add(63);
		BST.add(14);
		BST.add(98);
		BST.add(10);
		BST.printNodes();
		System.out.println("Size of the tree is: "+BST.getSize());
		MyBinaryNode<Integer> searchResult = BST.search(6);
		if(searchResult == null) {
			System.out.println("Node is not present binary tree");
		}else {
			System.out.println("Node is present in binary tree: "+searchResult.getKey());
		}
	}

}
