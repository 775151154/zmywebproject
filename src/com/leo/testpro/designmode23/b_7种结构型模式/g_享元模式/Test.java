package com.leo.testpro.designmode23.b_7�ֽṹ��ģʽ.g_��Ԫģʽ;

import java.sql.Connection;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Connection conn = ConnectionPoolFactory.getInstance().getConnection();
		conn.wait(100);
		ConnectionPoolFactory.getInstance().release(conn);
	}
	
}
