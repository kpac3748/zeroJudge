package fun;

public class FullNodes {

	public static void main(String[] args) {
		Node root = new Node(1);  
        root.left = new Node(2);  
        root.right = new Node(3);  
        root.left.left = new Node(4);  
        root.right.left = new Node(5);  
        root.right.right = new Node(6);  
        root.right.left.right = new Node(7);  
        root.right.right.right = new Node(8);  
        root.right.left.right.left = new Node(9);  
        findFullNode(root);  

	}
	
	public static void findFullNode(Node root) {
		if (root == null) {
			return;
		}
		
		boolean xxx = root.left == null ? root.right == null : false;
		
		if (root.left != null || root.right != null ||xxx)
			System.out.print(root.data + " ");
		
		findFullNode(root.left);
		findFullNode(root.right);
	}
}
