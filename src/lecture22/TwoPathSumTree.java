//package lecture22;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TwoPathSumTree {
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode() {
//        }
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//    public boolean hasPathSum(TreeNode root, int targetSum) {
//        if(root == null) {
//            return false;
//        }
//
//        if(root.left == null && root.right == null) {
//            return targetSum == root.val;
//        }
//
//        boolean left = hasPathSum(root.left, targetSum - root.val);
//        boolean right = hasPathSum(root.right,targetSum-root.val);
//        return left && right;
//
//    }
//
//    int maxLevel = -1;
//    List<Integer> ans;
//
//    public List<Integer> rightSideView(TreeNode root) {
//
//        ans = new ArrayList<>();
//        rec(root,0);
//        return ans;
//    }
//    private void rec(TreeNode root, int currentLevel) {
//        if (root == null) {
//            return;
//        }
//        if (currentLevel > maxLevel) {
//            ans.add(root.val);
//            maxLevel = currentLevel;
//        }
//        rec(root.right,currentLevel+1);
//        rec(root.left,currentLevel+1);
//
//    }
//
//    int diameter =0;
//    public int diameterOfBinaryTree(TreeNode root) {
//        if (root==null) return 0;
//        int ld = diameterOfBinaryTree(root.left);
//        int rd = diameterOfBinaryTree(root.right);
//        int safeDiemeter = height(root.right) + height(root.left) + 2;
//    }
//    private void height(TreeNode root) {
//        if (root == null) {
//            return;
//        }
//    }
//}
