public class TargetSumPair {
    
    public static class Node{

        int data;
        Node left, right;
       
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    public static boolean find(Node node, int target) {
        
        if(node == null){
            return false;
        }
        if(target > node.data){
            find(node.right, target);
        }
        else if(target < node.data){
            find(node.left, target);
        }
         else{
            
         }
         return true;
    }

    public static void targetSum(Node node, int d1) {
        
        if(node == null){
            return;
        }

        targetSum(node.left, d1);
        
        int comp = d1-node.data;
        if(comp > node.data){
            if(find(node, comp)==true){
                System.out.println(node.data+" "+comp);
            }
        }

        targetSum(node.right, d1);

    }

    public static void main(String[] args) {
        
        Node root = new Node(50, null,null); 
        root.left = new Node(30, null, null);
        root.left.left = new Node(20, null, null);
        root.left.right = new Node(40, null, null);
        root.right = new Node(70, null, null);
        root.right.left = new Node(60, null, null);
        root.right.right = new Node(80, null, null);

        targetSum(root, 90);
    }
}
