package com.leo.testpro.designmode23.b_7�ֽṹ��ģʽ.g_��Ԫģʽ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ��Ԫģʽ����ҪĿ����ʵ�ֶ���Ĺ���������أ���ϵͳ�ж�����ʱ����Լ����ڴ�Ŀ�����ͨ���빤��ģʽһ��ʹ�á�
 * 
 * FlyWeightFactory���𴴽��͹�����Ԫ��Ԫ����һ���ͻ�������ʱ��������Ҫ��鵱ǰ��������Ƿ��з��������Ķ�������У��ͷ����Ѿ����ڵĶ���
 * ���û�У��򴴽�һ���¶���FlyWeight�ǳ��ࡣһ�ᵽ����أ����Ǻ��������뵽Java�����JDBC���ӳأ�����ÿ�����ӵ��ص㣬���ǲ����ܽ����
 * �������������һЩ������������һЩ���е����ԣ��������ݿ����ӳ���˵��url��driverClassName��username��
 * password��dbname����Щ���Զ���ÿ��������˵����һ���ģ����Ծ��ʺ�����Ԫģʽ��������һ�������࣬����������������Ϊ�ڲ����ݣ�
 * ��������Ϊ�ⲿ���ݣ��ڷ�������ʱ�����������������������ͽ�ʡ�˿ռ䣬������ʵ����������
 * 
 * ͨ�����ӳصĹ���ʵ�������ݿ����ӵĹ�������Ҫÿһ�ζ����´������ӣ���ʡ�����ݿ����´����Ŀ�����������ϵͳ�����ܣ�
 * 
 * @author leo
 */
public class ConnectionPoolFactory {
	private static final Logger logger = LoggerFactory.getLogger(ConnectionPoolFactory.class);

	private Vector<Connection> pool;

	/* �������� */
	private String url = "jdbc:mysql://localhost:3306/test";
	private String username = "root";
	private String password = "root";
	private String driverClassName = "com.mysql.jdbc.Driver";

	private int poolSize = 100;
	private boolean init = false;

	private static final ConnectionPoolFactory instance = new ConnectionPoolFactory();

	public static ConnectionPoolFactory getInstance() {
		return instance;
	}

	/**
	 * �����ӳ��л�ȡ����
	 * 
	 * @return
	 */
	public synchronized Connection getConnection() {
		if (init()) {
			if (pool.size() > 0) {
				Connection conn = pool.get(0);
				pool.remove(conn);
				return conn;
			}
		} else {
			logger.error("jdbc pool δ��ʼ����");
		}
		return null;
	}

	/**
	 * �������ӵ����ӳ�
	 */
	public void release(Connection conn) {
		pool.add(conn);
	}

	/**
	 * ��ʼ�����ӳ�
	 * 
	 * @return
	 */
	private boolean init() {
		if (!init) {
			pool = new Vector<Connection>(poolSize);
			try {
				for (int i = 0; i < poolSize; i++) {
					Class.forName(driverClassName);
					Connection conn = DriverManager.getConnection(url, username, password);
					pool.add(conn);
				}
				init = true;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return init;
	}
}
