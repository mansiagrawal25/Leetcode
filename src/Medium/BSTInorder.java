package Medium;

import java.util.LinkedList;
import java.util.List;

public class BSTInorder {
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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> pre = new LinkedList<Integer>();
        if(root==null) return pre;
        pre.addAll(inorderTraversal(root.left));
        pre.add(root.val);
        pre.addAll(inorderTraversal(root.right));
        return pre;
    }
}
