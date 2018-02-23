package com.leo.testpro.designmode23.a_5种创建模式.d建造者模式;

import java.util.ArrayList;
import java.util.List;

import com.leo.testpro.designmode23.a_5种创建模式.a工厂模式.a普通工厂模式.MailSender;
import com.leo.testpro.designmode23.a_5种创建模式.a工厂模式.a普通工厂模式.Sender;
import com.leo.testpro.designmode23.a_5种创建模式.a工厂模式.a普通工厂模式.SmsSender;

/**
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，
 * 所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。我们看一下代码：
 * 还和前面一样，一个Sender接口，两个实现类MailSender和SmsSender。最后，建造者类如下：
 * 
 * @author leo
 */
public class Builder {
	private List<Sender> list = new ArrayList<Sender>();

	public void produceMailSender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new MailSender());
		}
	}

	public void produceSmsender(int count) {
		for (int i = 0; i < count; i++) {
			list.add(new SmsSender());
		}
	}

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);
	}
}
