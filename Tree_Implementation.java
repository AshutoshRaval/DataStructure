package SuperChar;

public class Tree_Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		binaryTree t1 = new binaryTree();
//		t1.root = new treeNode(1);
//		t1.root.left = new treeNode(2);
//		t1.root.right = new treeNode(3);
//		t1.root.left.left = new treeNode(4);
//		t1.root.right.right = new treeNode(5);
		
		BinarySearchTree tree = new BinarySearchTree();
//        tree.insert(4);
//        tree.insert(2);
//        tree.insert(6);
//        tree.insert(1);
//        tree.insert(3);
//        tree.insert(5);
//        tree.insert(7);
//        
        tree.insert(4);
        tree.insert(2);
        tree.insert(3);
        tree.insert(5);
        tree.insert(6);
        tree.insert(1);
        tree.insert(7);
        
        preorderTraversal(tree.root);
        System.out.println("");
        inorderTraversal(tree.root);
        System.out.println("");
        postorderTraversal(tree.root);
        
        
        
	}
	
	
	public static void preorderTraversal(treeNode node) {
		
		if(node != null) {
			System.out.print(node.data + " "); // Visit current node
			preorderTraversal(node.left); // Traverse left subtree         
			preorderTraversal(node.right); // Traverse right subtree
		}
		
	}
	public static void inorderTraversal(treeNode node) {
		
		if(node != null) {
			inorderTraversal(node.left); // Traverse left subtree
            System.out.print(node.data + " "); // Visit current node
            inorderTraversal(node.right); // Traverse right subtree
		}
		
	}
	public static void postorderTraversal(treeNode node) {
		
		if(node != null) {
			postorderTraversal(node.left); // Traverse left subtree         
			postorderTraversal(node.right); // Traverse right subtree
            System.out.print(node.data + " "); // Visit current node
		}
		
	}

}

class treeNode{
	
	int data;
	treeNode left,right;
	
	public treeNode(int a) {
		this.data = a;
		this.left  = this.right = null;
		
	}
	
}

class binaryTree{
	
	treeNode root;
	
	public binaryTree() {	
		root =null;
	}
}

class BinarySearchTree{
	
	treeNode root;
	
	public BinarySearchTree() {	
		root =null;
	}
	
	 public void insert(int key) {
	        root = insertRec(root, key);
	    }
	 
	 public treeNode insertRec(treeNode root, int key) {
		 
		 if(root == null) {
			root = new treeNode(key);
			return root;
		 }
		 if(key < root.data) {
			 root.left = insertRec(root.left,key);
		 }else if(key > root.data) {
			 root.right = insertRec(root.right,key);
		 }
		 
		 return root;
		 
	 }
}

