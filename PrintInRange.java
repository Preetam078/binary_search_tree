public class PrintInRange {
    
    public static class Node{

        int data;
        Node left, right;
       
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    public static void rangePrint(Node node, int d1, int d2) {
        
        if(node == null){
            return;
        }
        if(d1 < node.data && d2 < node.data){
            rangePrint(node.left, d1, d2);
        }
        else if(d1 > node.data && d2 > node.data){
            rangePrint(node.right, d1, d2);
        }
        else{
            rangePrint(node.left, d1, d2);
            System.out.println(node.data);
            rangePrint(node.right, d1, d2);
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

        rangePrint(root, 25,66);
    }
}
