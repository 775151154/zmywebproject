package com.leo.testpro.designmode23.b_7�ֽṹ��ģʽ.f_���ģʽ;

/**
 * ���ģʽ��ʱ�ֽв���-����ģʽ�ڴ����������νṹ������ʱ�ȽϷ���
 * 
 * ʹ�ó�������������������һ����в����������ڱ�ʾ���νṹ�У���������������ȡ�
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
