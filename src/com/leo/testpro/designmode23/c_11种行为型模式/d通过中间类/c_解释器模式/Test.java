package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.dͨ���м���.c_������ģʽ;

/**
 * ������ģʽ��������ʱ�����һ����һ����ҪӦ����OOP�����еı������Ŀ����У�����������Ƚ�խ��
 * <p>
 * ������������������ģʽ���������ָ����Ľ���������������ʽ�ȵĽ������ȵȣ�
 *
 * @Author Leo
 * @Date 2018/2/6 16:33
 */
public class Test {

    public static void main(String[] args) {

        // ����9+2-8��ֵ
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}