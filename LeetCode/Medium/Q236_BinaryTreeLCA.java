/*Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
 * According to the definition of LCA on Wikipedia: 
 * “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants 
 * (where we allow a node to be a descendant of itself).”
 *
 *Assumption: Both Nodes are present in Binary Tree
 * */

public class Q236_BinaryTreeLCA{
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        
        //If either of the node's values matches root, it implied that root is LCA
        if(root.val==p.val || root.val==q.val) return root;
        
        //Looking for keys in left and right subtree
        TreeNode leftTree = lowestCommonAncestor(root.left, p, q);
        TreeNode rightTree = lowestCommonAncestor(root.right, p, q);
        
        /*if both nodes are non-null, it implies that one key
         * is present in left subtree and other key is present in
         * right sub-tree, hence return the root
         */
        if(leftTree!=null && rightTree!=null) return root;
        
        //non-null subtree should have both the keys
        return (leftTree!=null ? leftTree : rightTree);
    }
}