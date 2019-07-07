package aspectj.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dynamic.jdk.TestDao;

public class XMLAspectJTest {
	public static void main(String[] args) {
		ApplicationContext appCon = new ClassPathXmlApplicationContext("/aspectj/xml/applicationContext.xml");
		//从容器中获取增强后的目标对象
		TestDao testDaoAdvice = (TestDao)appCon.getBean("testDao");
		//执行方法
		testDaoAdvice.save();
		System.out.println("这里没能实现基于XML配置开发AspectJ，因没有报错，目前实在找不出原因，望大佬指点一二！");
	}
}
