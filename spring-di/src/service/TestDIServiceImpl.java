package service;

import dao.TestDIDao;

public class TestDIServiceImpl implements TestDIService {
	private TestDIDao testDIDao;

	// ���췽��������ʵ������ע��ӿڶ���testDIDao
	public TestDIServiceImpl(TestDIDao testDIDao) {
		super();
		this.testDIDao = testDIDao;
	}
	@Override
	public void sayHello() {
		//����testDIDao�е�sayHello����
		testDIDao.sayHello();
		System.out.println("TestDIService���췽��ע��say��Hello��Study hadr��");
	}
}
