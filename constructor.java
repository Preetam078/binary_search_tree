public class constructor{

    public static class Node{

        int data;
        Node left, right;
       
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    public static void inorder(Node node){

        if(node == null){
            return;
        }
        System.out.println(node.data+" ");
        inorder(node.left);
        inorder(node.right);
    }
    
    public static Node constructBST(int arr[], int lo, int hi){

        if(lo > hi){
            return null;
        }
        
        int mid = (lo+hi)/2;
        int data = arr[mid];

        Node left = constructBST(arr, lo, mid-1);
        Node right = constructBST(arr, mid+1, hi);

        Node node = new Node(data, left, right);

        return node;
    }
    public static void main(String[] args) {
        
        int[]arr = {12,23,45,50,65,76,89,90,100};
        Node root = constructBST(arr,0,arr.length-1);

        inorder(root);
    }
}