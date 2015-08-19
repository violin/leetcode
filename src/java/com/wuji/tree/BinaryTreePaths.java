package com.wuji.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * Given a binary tree, return all root-to-leaf paths.

 For example, given the following binary tree:

      1
    /   \
   2     3
    \
     5
 All root-to-leaf paths are:

 ["1->2->5", "1->3"]



 * Created by yangzhou on 15-8-19.
 */
public class BinaryTreePaths {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null){
            return new ArrayList<>();
        }
        List<String> returnList = new ArrayList<>();
        getBinaryTreePaths(returnList,root,"");
        return returnList;

    }

    private void getBinaryTreePaths(List<String> returnList, TreeNode node,String base) {
        String current = base.length()==0?node.val+"":base+"->"+node.val;
        if(node.left == null && node.right == null){
            returnList.add(current);
        }
        if (node.left != null){
            getBinaryTreePaths(returnList,node.left,current);
        }
        if (node.right != null){
            getBinaryTreePaths(returnList,node.right,current);
        }
    }

    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }

    /**
     * other solution - iteration
     * @param root
     * @return
     */
    public List<String> binaryTreePaths2(TreeNode root) {
        Queue<TreeNode> nodes=new LinkedList<TreeNode>();
        Queue<String> strs=new LinkedList<String>();
        List<String> result=new ArrayList<String>();
        if(root!=null){
            nodes.offer(root);
            strs.offer(Integer.toString(root.val));
        }
        while(!nodes.isEmpty()){
            TreeNode node=nodes.poll();
            if(node.left==null&&node.right==null){
                result.add(strs.poll());
            }else{
                String newStr=strs.poll();
                if(node.left!=null){
                    nodes.offer(node.left);
                    strs.offer(newStr+"->"+node.left.val);
                }
                if(node.right!=null){
                    nodes.offer(node.right);
                    strs.offer(newStr+"->"+node.right.val);
                }
            }
        }
        return result;
    }
}
