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
		BST.printNodes();

	}

}
