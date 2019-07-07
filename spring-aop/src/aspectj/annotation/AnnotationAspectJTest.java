package aspectj.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dynamic.jdk.TestDao;

public class AnnotationAspectJTest {
	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("/aspectj/annotation/applicationContext.xml");
		//�������л�ȡ��ǿ���Ŀ�����
		TestDao testDaoAdvice = (TestDao)appCon.getBean("testDao");
		//ִ�з���
		testDaoAdvice.save();
	}
}

