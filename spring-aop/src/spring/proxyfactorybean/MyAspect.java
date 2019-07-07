package spring.proxyfactorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * ������
 */
public class MyAspect implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		//��ǿ����
		check();
		except();
		//ִ��Ŀ�귽��
		Object obj = arg0.proceed();
		//��ǿ����
		log();
		monitor();
		return obj;
	}

	private void monitor() {
		// TODO Auto-generated method stub
		System.out.println("���ܼ��");
	}

	private void log() {
		// TODO Auto-generated method stub
		System.out.println("ģ����־��¼");
	}

	private void except() {
		// TODO Auto-generated method stub
		System.out.println("ģ���쳣����");
	}

	private void check() {
		// TODO Auto-generated method stub
		System.out.println("ģ��Ȩ�޿���");
	}
}
