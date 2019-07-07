package aspectj.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dynamic.jdk.TestDao;

public class XMLAspectJTest {
	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("/aspectj/xml/applicationContext.xml");
		//�������л�ȡ��ǿ���Ŀ�����
		TestDao testDaoAdvice = (TestDao)appCon.getBean("testDao");
		//ִ�з���
		testDaoAdvice.save();
		System.out.println("����û��ʵ�ֻ���XML���ÿ���AspectJ����û�б���Ŀǰʵ���Ҳ���ԭ��������ָ��һ����");
	}
}
