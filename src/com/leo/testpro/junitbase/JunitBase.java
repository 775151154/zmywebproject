package com.leo.testpro.junitbase;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)  //ʹ��junit4���в���  
@ContextConfiguration(locations={"classpath:applicationContext.xml", "classpath:spring-mvc.xml"}) //���������ļ�  
  
//------------����������´��룬���м̳и���Ĳ����඼����ѭ�����ã�Ҳ���Բ��ӣ��ڲ�����ķ�����///�������񣬲μ���һ��ʵ��  
//����ǳ��ؼ���������������ע�����ã�������ƾͻ���ȫʧЧ��  
//@Transactional  
//�������������������ļ��е������������transactionManager = "transactionManager"����ͬʱ//ָ���Զ��ع���defaultRollback = true�������������������ݲŲ�����Ⱦ���ݿ⣡  
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)  
//------------  
public class JunitBase {
	
}