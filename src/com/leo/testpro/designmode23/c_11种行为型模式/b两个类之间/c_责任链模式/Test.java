package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.b������֮��.c_������ģʽ;
/** 
 * ���������ǽ�Ҫ̸̸������ģʽ���ж������ÿ��������ж���һ����������ã������ͻ��γ�һ�������������������ϴ��ݣ�
 * ֱ��ĳһ���������������󡣵��Ƿ����߲���������������Ǹ�����ᴦ����������ԣ�������ģʽ����ʵ�֣��������ͻ��˵�����£�
 * ��ϵͳ���ж�̬�ĵ�����
 * 
 * @Author Leo
 * @Date 21:01
*/
public class Test {
    public static void main(String[] args) {
        MyHandler handler1 = new MyHandler("one");
        MyHandler handler2 = new MyHandler("two");
        MyHandler handler3 = new MyHandler("three");

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);
        handler1.operator();
    }
}
