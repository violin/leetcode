package com.wuji.test;

import com.wuji.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

 For example:
 Given binary tree {3,9,20,#,#,15,7},

   3
  / \
 9   20
    /  \
   15   7
 return its bottom-up level order traversal as:
 [
 [15,7],
 [9,20],
 [3]
 ]



 * Created by yangzhou on 15-10-24.
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<TreeNode> nodes = new ArrayList<TreeNode> ();
        if (root == null){
            return  list;
        }
        nodes.add(root);
        while (nodes!=null && nodes.size()>0){
            List<Integer> currentList = new ArrayList<Integer>();
            List<TreeNode> nextNodes = new ArrayList<TreeNode>();
            for (TreeNode node : nodes) {
                currentList.add(node.val);
                if (node.left!=null){
                    nextNodes.add(node.left);
                }
                if (node.right!=null){
                    nextNodes.add(node.right);
                }
            }
            list.add(0,currentList);
            nodes = nextNodes;
        }
        return list;
    }

}
