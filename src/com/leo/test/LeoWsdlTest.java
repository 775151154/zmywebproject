package com.leo.test;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

/**
 * Web Services以XML作为数据交换的标准格式，它是跨平台的应用，允许以任何方式创建Web Services，在.NET、Java平台上访问。
      在Java平台创建和访问Web Service多通过Axis完成。Axis本质上就是一个SOAP引擎，提供创建服务器端、客户端和网关SOAP操作的基本框架。
      Axis目前版本是为Java编写的。在使用Axis访问Web Service时，需要引入以下包（10个）：axis-ant.jar、axis.jar、commons-discovery-0.2.jar、
      commons-logging-1.0.4.jar、jaxrpc.jar、log4j-1.2.8.jar、saaj.jar、wsdl4j-1.5.1.jar、activation-1.1.jar和mail-1.4.jar。
 * @author Administrator
 *
 */
public class LeoWsdlTest {
	public static void main(String[] args) {
		try {
			String endpoint = "http://localhost:8080/easi/eas_commif/services/IMeterInterface";
			Service service = new Service();
			Call call = (Call) service.createCall();
			call.setTargetEndpointAddress(new java.net.URL(endpoint));
			call.setOperationName("mpacMpDayRead");
			String parm = "<data><paras><para name='ID'>9941404000000020</para><para name='START_DATE'>2016-05-01</para><para name='END_DATE'>2016-09-30</para></paras></data>";
			String res = (String) call.invoke(new Object[] {parm});
			System.out.println(res);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
