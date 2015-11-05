package com.wuji.tree;

import com.wuji.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 For example:
 Given binary tree {3,9,20,#,#,15,7},
 3
 / \
 9  20
 /  \
 15   7
 return its level order traversal as:
 [
 [3],
 [9,20],
 [15,7]
 ]



 * Created by yangzhou on 15/10/30.
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        List<TreeNode> currentLevel = new ArrayList<TreeNode>();
        if (root == null) return returnList;
        currentLevel.add(root);

        while (!currentLevel.isEmpty()){
            List<Integer> currentLevelInts = new ArrayList<Integer>();
            List<TreeNode> nextLevel = new ArrayList<TreeNode>();
            for (TreeNode treeNode : currentLevel) {
                if (treeNode.left!=null) nextLevel.add(treeNode.left);
                if (treeNode.right!=null) nextLevel.add(treeNode.right);
                currentLevelInts.add(treeNode.val);
            }
            currentLevel = nextLevel;
            returnList.add(currentLevelInts);
        }
        return returnList;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        treeNode.left = treeNode2;
        new BinaryTreeLevelOrderTraversal().levelOrder(treeNode);
    }
}
