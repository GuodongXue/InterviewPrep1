package June04;

/*

import com.sun.source.tree.BinaryTree;

public class BinaryTree1 {
    class Node{
        int data;
        Node left, right;
        public Node(int item){
            data = item;
            left= right= null;

        }
    }
    class binaryTree{
        static Node root;

        public binaryTree() {
            root = null;
        }
        public static void printLevelOrder(){
            int h = height(root);
            for(int i = 1; i<=h; i++){
                printCurrentLevel(root, i);
            }

        }
        public static int height(Node root){
            if(root == null){
                return 0;
            } else{
                int leftheight = height(root.left);
                int rightheight = height(root.right);

                if(leftheight>rightheight){
                    return (leftheight+1);
                }else{
                    return (rightheight+1);
                }
            }
        }
        public static void printCurrentLevel (Node root, int level){
            if(root == null){
                return;
            }
            if(level ==1 ){
                System.out.println(root.data+"");

            }else if(level>1){
                printCurrentLevel(root.left, level-1);
                printCurrentLevel(root.right, level-1);
            }
        }
    }
    public static void main(String args[])
    {
        BinaryTree1 tree = new BinaryTree1();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);

        System.out.println("Level order traversal of
                binary tree is ");
                tree.printLevelOrder();
    }
}
*/
