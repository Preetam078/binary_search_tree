public class RemoveNode {

    public static class Node{

        int data;
        Node left, right;
       
        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }

    }

    public static int Max(Node node){
      if(node.right != null){
          return Max(node.right);
      }
      return node.data;
    }
    
    public static Node removeNode(Node node, int data){

        if(node == null){
            return null;
        }
        if(data > node.data){
            node.right = removeNode(node.right, data);
        }else if(data < node.data){
            node.left = removeNode(node.left, data);
        }
        else{
            if(node.left!= null && node.right != null){
                int lmax = Max(node.left);
                node.data = lmax;
                node.left = removeNode(node.left, lmax);
                return node;

            } else if(node.left!= null){
               return node.left;

            }else if(node.right != null){
               return node.right;

            }else{
                return null;
            }
        }
        return node;
    }

    public static void inorder(Node node) {
         
        if(node == null){
            return;
        }
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }

    public static void main(String[] args) {
        
        Node root = new Node(50, null,null);
        root.left = new Node(30, null, null);
        root.left.left = new Node(20, null, null);
        root.left.right = new Node(40, null, null);
        root.right = new Node(70, null, null);
        root.right.left = new Node(60, null, null);
        root.right.right = new Node(80, null, null);


        inorder(root);
        removeNode(root, 40);
        System.out.println();
        inorder(root);
    }
}
