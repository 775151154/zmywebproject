package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.a���������.b_ģ�巽��ģʽ;

/**
 * ����һ��ģ�巽��ģʽ������ָ��һ���������У���һ�����������ٶ���1...n�������������ǳ���ģ�Ҳ������ʵ�ʵķ���������һ���࣬�̳иó����࣬��д���󷽷�
 * ��ͨ�����ó����࣬ʵ�ֶ�����ĵ���
 * <p>
 * ������AbstractCalculator���ж���һ��������calculate��calculate()����spilt()�ȣ�
 * Plus��Minus�ֱ�̳�AbstractCalculator�࣬ͨ����AbstractCalculator�ĵ���ʵ�ֶ�����ĵ���
 * <p>
 * �Ҹ��������С�����ִ�й��̣����Ƚ�exp��"\\+"������������AbstractCalculator�����calculate(String,String
 * )��������calculate(String,String)�����ͬ���split()��֮���ٵ���calculate(int
 * ,int)������������������뵽�����У�ִ����return num1 +
 * num2�󣬽�ֵ���ص�AbstractCalculator�࣬����result����ӡ������������֤�����ǿ�ͷ��˼·��
 *
 * @author leo
 */
public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
