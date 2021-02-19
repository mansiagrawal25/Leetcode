package Medium;

import java.util.Stack;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {
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
    public TreeNode buildTree(int[] inorder, int[]postorder){
        int iStart=0, iEnd=inorder.length-1, pStart=0, pEnd=postorder.length-1;
        return buildTree(inorder,iStart,iEnd,postorder,pStart,pEnd);


    }
    public TreeNode buildTree(int[] inorder, int iStart, int iEnd, int[] postorder, int pStart, int pEnd ){
        if(iStart>iEnd || pStart>pEnd) return null;
        int rootValue = postorder[pEnd];
        TreeNode root = new TreeNode(rootValue);
        int k=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==rootValue){
                k=i;
                break;
            }
        }
        root.left= buildTree(inorder, iStart, k-1,postorder, pStart, pStart+k-(iStart+1));
        root.right= buildTree(inorder,k+1, iEnd,postorder,pStart+k-iStart,pEnd-1 );
        return  root;
    }
    public TreeNode buildTreeI(int[] inorder, int[] postorder) {
        //boundary case
        if(inorder.length == 0) return null;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode root = new TreeNode(postorder[postorder.length-1]);
        stack.push(root);

        int i = postorder.length-2, j = inorder.length-1;//i is index in postorder[], j is index in inorder[]

        while(i >= 0){
            TreeNode curr = stack.peek();
            if(curr.val != inorder[j]){
                //as long as we have not reach the rightmost node we can safely follow right path and attach right child
                TreeNode right = new TreeNode(postorder[i]);
                curr.right = right;
                stack.push(right);
                i--;
            }else{
                //found the node from stack where we have not visited its left subtree
                while(!stack.isEmpty() && stack.peek().val == inorder[j]){
                    curr = stack.pop();
                    j--;
                }

                TreeNode left = new TreeNode(postorder[i]);
                curr.left = left;
                stack.push(left);
                i--;
            }
        }

        return root;
    }
    public static void main(String[]args){
        int[] inorder = {9,3,15,20,7};
        int [] postorder= {9,15,7,20,3};
        ConstructBinaryTreeFromInorderAndPostorderTraversal cb = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
        System.out.println(cb.buildTree(inorder,postorder).val);
        System.out.println(cb.buildTreeI(inorder,postorder).right.val);
    }
}
