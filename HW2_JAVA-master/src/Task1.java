
//https://leetcode.com/problems/symmetric-tree/submissions/860327081/
public class Task1 {
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);// делим рут на два аргумента
    }

    boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSymmetric(p.left, q.right) && isSymmetric(q.right, p.left);
    }
}
