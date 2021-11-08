public class AddNodes {

    
    public static class Node{

        int data;
        Node left, right;
       
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    public static Node AddNode(Node node, int data) {

        if(node == null){
            return new Node(data, null, null);
        }

        if(data > node.data){
            node.right = AddNode(node.right, data);
        }
        else if(data <node.data)
            node.left = AddNode(node.right, data);

       return node;
    }
    
    public static void postorder(Node node){
        
        if(node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data);
    }
     
    public static void main(String[] args) {
        
        Node root = new Node(50, null,null);
        root.left = new Node(30, null, null);
        root.left.left = new Node(20, null, null);
        root.left.right = new Node(40, null, null);
        root.right = new Node(70, null, null);
        root.right.left = new Node(60, null, null);
        root.right.right = new Node(80, null, null);

        postorder(root);
        root = AddNode(root, 10);
        postorder(root);

    }
}
