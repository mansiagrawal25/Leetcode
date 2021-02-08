package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
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
        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> list=new ArrayList<>();
        if(root !=null){
           list.add(root.val);
           list.addAll(preorderTraversal(root.left));
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }
    public List<Integer> preorderTraversalIt(TreeNode root) {
        List<Integer> pre = new ArrayList<Integer>();
        if(root==null) return pre;
        Stack<TreeNode> tovisit = new Stack<TreeNode>();
        tovisit.push(root);
        while(!tovisit.empty()) {
            TreeNode visiting = tovisit.pop();
            pre.add(visiting.val);
            if(visiting.right!=null) tovisit.push(visiting.right);
            if(visiting.left!=null) tovisit.push(visiting.left);
        }
        return pre;
    }
}
