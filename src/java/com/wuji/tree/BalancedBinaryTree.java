package com.wuji.tree;

import com.wuji.common.TreeNode;

/**
 * Given a binary tree, determine if it is height-balanced.

 For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.


 * Created by yangzhou on 15-10-20.
 */
public class BalancedBinaryTree {


    /**
     * using dfs is more compute saving
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        return dfsHeight(root ) != -1;
    }

    private int dfsHeight(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = dfsHeight(root.left);
        int rightHeight = dfsHeight(root.right);
        if (leftHeight==-1 || rightHeight == -1) return -1;
        if (Math.abs(leftHeight-rightHeight)>1) return -1;
        return Math.max(leftHeight,rightHeight)+1;
    }
}
