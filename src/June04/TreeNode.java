package June04;

import com.sun.source.tree.BinaryTree;

import java.util.LinkedList;
import java.util.List;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class solution{
    public List<Integer> getLonelyNodes(TreeNode root){
        List<Integer> list = new LinkedList<>();
        helper(root.left, root, list);
        helper(root.right, root, list);
        return list;


    }
    private void helper(TreeNode root, TreeNode parent, List<Integer> list){
        if(root==null){
            return;
        }
        if(parent.left==null || parent.right==null){
            list.add(root.val);
        }
        helper(root.left, root, list);
        helper(root.right, root, list);
    }

    public static void main(String[] args) {

    }
}
