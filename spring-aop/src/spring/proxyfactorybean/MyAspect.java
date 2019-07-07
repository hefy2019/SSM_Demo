package spring.proxyfactorybean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 切面类
 */
public class MyAspect implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		//增强方法
		check();
		except();
		//执行目标方法
		Object obj = arg0.proceed();
		//增强方法
		log();
		monitor();
		return obj;
	}

	private void monitor() {
		// TODO Auto-generated method stub
		System.out.println("性能监测");
	}

	private void log() {
		// TODO Auto-generated method stub
		System.out.println("模拟日志记录");
	}

	private void except() {
		// TODO Auto-generated method stub
		System.out.println("模拟异常处理");
	}

	private void check() {
		// TODO Auto-generated method stub
		System.out.println("模拟权限控制");
	}
}
