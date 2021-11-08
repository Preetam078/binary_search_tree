public class FindNode {

    public static class Node{

        int data;
        Node left, right;
       
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    public static boolean find(Node node, int data) {
        if(node == null){
            return false;
        }

        if(data > node.data){
           return find(node.right, data);
        }
        else if(data < node.data){
           return find(node.left, data);
        }
        else{
            return true;
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

        if(find(root, 80)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }

        
    }
}
