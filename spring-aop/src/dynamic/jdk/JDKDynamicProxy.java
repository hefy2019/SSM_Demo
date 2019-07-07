package dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import sapect.MyAspect;

public class JDKDynamicProxy implements InvocationHandler {
	// ����Ŀ����ӿڶ���(��ʵ����)
	private TestDao testDao;

	/** ��������ķ�������������������ʵ�Ĵ����ϵ�������ش������ **/
	public Object createProxy(TestDao testDao) {
		this.testDao = testDao;
		// 1.�������
		ClassLoader cld = JDKDynamicProxy.class.getClassLoader();
		// 2.���������ʵ�ֵ����нӿ�
		Class[] clazz = testDao.getClass().getInterfaces();
		// 3.ʹ�ô����������ǿ�����ش����Ķ���
		return Proxy.newProxyInstance(cld, clazz, this);
	}
	/**
	 * ������߼����������ж�̬������ķ������ö������÷�������
	 * proxy�Ǳ��������
	 * method�ǽ�Ҫ��ִ�еķ���
	 * args��ִ�з���ʱ��Ҫ�Ĳ���
	 * returnָ���ش�����
	 */

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		//����һ������
		MyAspect myAspect=new MyAspect();
		//ǰ��ǿ
		myAspect.check();
		myAspect.except();
		//��Ŀ�����ϵ��÷���������������൱�ڵ���testDao�еķ���
		Object obj = method.invoke(testDao, args);
		//����ǿ
		myAspect.log();
		myAspect.monitor();
		return obj;
	}
}
