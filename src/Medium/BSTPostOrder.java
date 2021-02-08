package Medium;

import java.util.LinkedList;
import java.util.List;

public class BSTPostOrder {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val=val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> pre = new LinkedList<Integer>();
        if(root==null) return pre;
        pre.addAll(postorderTraversal(root.left));
        pre.addAll(postorderTraversal(root.right));
        pre.add(root.val);
        return pre;
    }
}
