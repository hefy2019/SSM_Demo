package tset;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import dao.TestDao;

/*public class Test {
	public static void main(String[] args) {
		// 初始化Spring容器ApplicationContext，加载配置文件
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 通过容器获取test实例
		TestDao tt = (TestDao) appCon.getBean("test");	//test为配置文件中的id
		tt.sayHello();
	}
}*/
//使用BeanFactory实例加载Spring配置文件在实际开发中并不多见
public class Test {
	public static void main(String[] args) {
		// 初始化Spring容器,加载配置文件
		BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("E:\\IDE\\eclipse\\Workspace\\ch1\\src\\applicationContext.xml"));
		// 通过容器获取test实例
		TestDao tt = (TestDao) beanFactory.getBean("test");	//test为配置文件中的id
		tt.sayHello();
		System.out.println("您好，coder！");
	}
}

