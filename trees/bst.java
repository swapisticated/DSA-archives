package trees;

public class bst {
    public static class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public bst(){
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }
    public  void insert (int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node){

        if(node == null){
            node = new Node(value);
            return node;

        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void display(){
//        if(node == null){
//            return;
//        }
        display(root, "Root node");
    }

    private void display(Node node, String details) {
         if(node == null){
             return;
         }
        System.out.println(details + node.getValue());
         display(node.left, "left child of current" + node.getValue() + ":");
        display(node.right, "right child of current" + node.getValue() + ":");
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.populate(scanner);
        // tree.prettyDisplay();

        bst tree = new bst();
        int[] nums = { 10, 7,12 };
        tree.populate(nums);
        tree.display();
    }

}
