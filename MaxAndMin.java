public class MaxAndMin {

    public static class Node{

        int data;
        Node left, right;
       
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    public static int Maximum(Node node) {
           if(node.right != null){
            return   Maximum(node.right);
           }
           else{
            return node.data;
           }
          
    }

    public static int Minimum(Node node) {
        if(node.left != null){
           return Minimum(node.left);
        }
        else{
            return node.data;
        }
       
 }
    
    public static void main(String[] args) {

        Node root = new Node(50, null,null);
        root.left = new Node(30, null, null);
        root.left.left = new Node(20, null, null);
        root.left.right = new Node(40, null, null);
        root.right = new Node(70, null, null);
        root.right.left = new Node(60, null, null);
        root.right.right = new Node(80, null, null);

        System.out.println(Maximum(root)); 
        System.out.println(Minimum(root));
        
    }
}
