package com.leo.testpro.designmode23.b_7种结构型模式.f_组合模式;

public class Tree {
	private TreeNode root;

	public Tree(String name) {
		this.root = new TreeNode(name);
	}

	public TreeNode getTreeNode() {
		return root;
	}

}
