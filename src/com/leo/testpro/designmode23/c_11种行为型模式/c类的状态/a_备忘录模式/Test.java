package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.c���״̬.a_����¼ģʽ;

/**
 * ��ҪĿ���Ǳ���һ�������ĳ��״̬���Ա����ʵ���ʱ��ָ����󣬸��˾��ýб���ģʽ������Щ��ͨ�׵Ľ��£�������ԭʼ��A��A���и������ԣ�
 * A���Ծ�����Ҫ���ݵ����ԣ�����¼��B�������洢A��һЩ�ڲ�״̬����C�أ�����һ�������洢����¼�ģ���ֻ�ܴ洢�������޸ĵȲ�����
 * <p>
 * Original����ԭʼ�࣬��������Ҫ���������value������һ������¼�࣬��������valueֵ��Memento���Ǳ���¼�࣬
 * Storage���Ǵ洢����¼���࣬����Memento���ʵ������ģʽ�ܺ���⡣
 *
 * @Author Leo
 * @Date 10:45
 */
public class Test {
    public static void main(String[] args) {
        Original original = new Original("aaa");
        // �洢
        Storage storage = new Storage(original.createMemento());

        System.out.println("ԭʼ���޸�ǰ value = " + original.getValue());
        original.setValue("bbb");
        System.out.println("ԭʼ���޸ĺ� value = " + original.getValue());

        // ��ԭ
        original.restoreFromMemenoTo(storage.getMemento());
        System.out.println("ԭʼ�໹ԭ�� value = " + original.getValue());
    }
}
