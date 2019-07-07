package dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import sapect.MyAspect;

public class JDKDynamicProxy implements InvocationHandler {
	// 声明目标类接口对象(真实对象)
	private TestDao testDao;

	/** 创建代理的方法，建立代理对象和真实的代理关系，并返回代理对象 **/
	public Object createProxy(TestDao testDao) {
		this.testDao = testDao;
		// 1.类加载器
		ClassLoader cld = JDKDynamicProxy.class.getClassLoader();
		// 2.被代理对象实现的所有接口
		Class[] clazz = testDao.getClass().getInterfaces();
		// 3.使用代理类进行增强，返回代理后的对象
		return Proxy.newProxyInstance(cld, clazz, this);
	}
	/**
	 * 代理的逻辑方法，所有动态代理类的方法调用都交给该方法处理
	 * proxy是被代理对象
	 * method是将要被执行的方法
	 * args是执行方法时需要的参数
	 * return指返回代理结果
	 */

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		//创建一个切面
		MyAspect myAspect=new MyAspect();
		//前增强
		myAspect.check();
		myAspect.except();
		//在目标类上调用方法并传入参数，相当于调用testDao中的方法
		Object obj = method.invoke(testDao, args);
		//后增强
		myAspect.log();
		myAspect.monitor();
		return obj;
	}
}
