package com.leo.testpro.designmode23.b_7种结构型模式.f_组合模式;

/**
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便
 * 
 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 * 
 * @author leo
 */
public class Test {
	public static void main(String[] args) {
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		nodeB.add(nodeC);

		Tree tree = new Tree("A");
		tree.getTreeNode().add(nodeB);
	}
}
