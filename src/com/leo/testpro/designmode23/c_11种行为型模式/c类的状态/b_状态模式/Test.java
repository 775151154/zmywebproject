package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.c���״̬.b_״̬ģʽ;

/**
 * ����˼����ǣ��������״̬�ı�ʱ��ͬʱ�ı�����Ϊ���ܺ���⣡����QQ��˵���м���״̬�����ߡ�����æµ�ȣ�ÿ��״̬��Ӧ��ͬ�Ĳ�����
 * ������ĺ���Ҳ�ܿ������״̬�����ԣ�״̬ģʽ�����㣺1������ͨ���ı�״̬����ò�ͬ����Ϊ��2����ĺ�����ͬʱ������ı仯��
 * <p>
 * ����������ԣ�״̬ģʽ���ճ��������õ�ͦ��ģ�����������վ��ʱ��������ʱϣ�����ݶ����ĳһ���ԣ�
 * �������ǵ�һЩ���ܣ�����˵�򵥵�Ȩ�޿��Ƶȡ�
 *
 * @Author Leo
 * @Date 2018/2/6 11:21
 */
public class Test {
    public static void main(String[] args) {
        State state = new State("state1");
        Context context = new Context(state);
        context.afterChangeState();

        state.setState("state2");
        context.afterChangeState();
    }
}
