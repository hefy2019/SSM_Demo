package tset;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import dao.TestDao;

/*public class Test {
	public static void main(String[] args) {
		// ��ʼ��Spring����ApplicationContext�����������ļ�
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ͨ��������ȡtestʵ��
		TestDao tt = (TestDao) appCon.getBean("test");	//testΪ�����ļ��е�id
		tt.sayHello();
	}
}*/
//ʹ��BeanFactoryʵ������Spring�����ļ���ʵ�ʿ����в������
public class Test {
	public static void main(String[] args) {
		// ��ʼ��Spring����,���������ļ�
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("E:\\IDE\\eclipse\\Workspace\\ch1\\src\\applicationContext.xml"));
		// ͨ��������ȡtestʵ��
		TestDao tt = (TestDao) beanFactory.getBean("test");	//testΪ�����ļ��е�id
		tt.sayHello();
		System.out.println("���ã�coder��");
	}
}

