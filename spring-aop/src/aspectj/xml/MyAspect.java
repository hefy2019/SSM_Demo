package aspectj.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * �����࣬�ڴ����б�д�������͵�֪ͨ
 */
public class MyAspect {
	/**
	 * ǰ��֪ͨ��ʹ��JoinPoint�ӿ���Ϊ�������Ŀ�������Ϣ
	 */
	public void before(JoinPoint jp) {
		System.out.println("ǰ��֪ͨ��ģ��Ȩ�޿���");
		System.out.println(",Ŀ�������" + jp.getTarget() + ",����ǿ����ķ�����" + jp.getSignature().getName());
	}

	/**
	 * ���÷���֪ͨ
	 */
	public void afterReturning(JoinPoint jp) {
		System.out.println("���÷���֪ͨ��" + "ģ��ɾ����ʱ�ļ�");
		System.out.println(",����ǿ����ķ�����" + jp.getSignature().getName());
	}

	/**
	 * ����֪ͨ ProceedingJoinPoint��JoinPoint���ӽӿڣ��������ִ�е�Ŀ�귽��
	 * ����ֵ�����ͱ�����ProceedingJoinPoint���� ����throws Throwable
	 */
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		// ��ʼ
		System.out.println("���ƿ�ʼ��ִ��Ŀ�귽��ǰ��ģ�⿪������");
		// ִ�е�ǰĿ�귽��
		Object obj = pjp.proceed();
		// ����
		System.out.println("���ƽ�����ִ��Ŀ�귽����ģ��ر�����");
		return obj;
	}

	/**
	 * �쳣֪ͨ
	 */
	public void except(Throwable e) {
		System.out.println("�쳣֪ͨ��" + "����ִ���쳣" + e.getMessage());
	}
	/**
	 * ����(����)֪ͨ
	 */
	public void after() {
		System.out.println("����֪ͨ��ģ���ͷ���Դ");
	}
}
