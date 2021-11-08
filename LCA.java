public class LCA {

    public static class Node{

        int data;
        Node left, right;
       
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    public static int lowestCommon(Node node ,int d1, int d2) {

        if(node == null){
            return -1;
        }
        if(d1 < node.data && d2 < node.data){
            return lowestCommon(node.left, d1, d2);
        }
        else if(d1 > node.data && d2 > node.data){
            return lowestCommon(node.right, d1, d2);
        }
        
        return node.data;
    }

    public static void main(String[] args) {
        
        Node root = new Node(50, null,null);
        root.left = new Node(30, null, null);
        root.left.left = new Node(20, null, null);
        root.left.right = new Node(40, null, null);
        root.right = new Node(70, null, null);
        root.right.left = new Node(60, null, null);
        root.right.right = new Node(80, null, null);

        int lca  = lowestCommon(root, 20,80);
        System.out.println(lca);
    }
    
}
