package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.b������֮��.b_������ģʽ;

/**
 * ����˼�壬������ģʽ����˳����ʾۼ��еĶ���һ����˵�������зǳ�����������Լ�����Ƚ���Ϥ�Ļ���
 * ��Ȿģʽ��ʮ�����ɡ���仰����������˼��һ����Ҫ�����Ķ��󣬼��ۼ����󣬶��ǵ������������ڶԾۼ�������б������ʡ�
 *
 * @Author Leo
 * @Date 20:38 2018/2/2
 **/
public class Test {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        System.out.println(collection.size());
        System.out.println(collection.iterator().hasNext());
        System.out.println(collection.iterator().next());
        System.out.println(collection.iterator().next());
        System.out.println(collection.iterator().pervious());
    }
}