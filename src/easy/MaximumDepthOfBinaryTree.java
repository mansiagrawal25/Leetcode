package easy;

public class MaximumDepthOfBinaryTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val){this.val=val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }
    int answer;
    public int maxDepth(TreeNode root){
        if(root==null)return 0;
        int left_length= maxDepth(root.left);
        int right_length=maxDepth(root.right);
        return Math.max(left_length,right_length);
        //one line solution
        //return  root==null ? 0 : Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
