package com.wuji.tree;

import com.wuji.common.TreeNode;

/**
 * Given a binary tree, find its minimum depth.

 The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.



 * Created by yangzhou on 15/10/30.
 */
public class MinimumDepthOfBinaryTree {
    int min = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if (root ==null){
            return 0;
        }
        dfs(root,1);
        return min;
    }

    public void dfs(TreeNode node, int height){
        if (node.left!=null ) {
            dfs(node.left, height + 1);
        }
        if(node.right !=null){
            dfs(node.right,height+1);
        }
        if (node.left == null && node.right==null){
            min = Math.min(min,height);
        }
    }
}