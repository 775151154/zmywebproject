package com.leo.testpro.designmode23.b_7种结构型模式.g_享元模式;

import java.sql.Connection;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Connection conn = ConnectionPoolFactory.getInstance().getConnection();
		conn.wait(100);
		ConnectionPoolFactory.getInstance().release(conn);
	}
	
}
