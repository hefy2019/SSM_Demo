package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TestExceptionDao;

@Service("testExceptionService")
public class TestExceptionServiceImpl implements TestExceptionService {
	@Autowired
	private TestExceptionDao testExceptionDao;

	@Override
	public void servicedb() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Service�����ݿ��쳣");
	}

	@Override
	public void servicemy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Service���Զ����쳣");
	}

	@Override
	public void daodb() throws Exception {
		// TODO Auto-generated method stub
		testExceptionDao.daodb();
	}

	@Override
	public void daomy() throws Exception {
		// TODO Auto-generated method stub
		testExceptionDao.daomy();
	}

	@Override
	public void serviceno() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Service��δ֪�쳣");
	}

	@Override
	public void daono() throws Exception {
		// TODO Auto-generated method stub
		testExceptionDao.daono();
	}
}
