class Node {
    int data;
    Node left;
    Node right;



}

class BST{
    Node root;

    BST() {
        root = new Node();
    }

    Node getNewNode(int data) {
        Node newNode = new Node();
        newNode.right = null;
        newNode.left = null;
        newNode.data = data;
    }


    public Node insert(Node root , int data) {

        if(root == null) {
            this.root = getNewNode(data);
        }

       else if(data > root.data) {
          root.right =   insert(root.right,data);
       }
        else if(data <= root.data) {
           root.left =  insert(root.left,data);
        }
        return root;

    }
}