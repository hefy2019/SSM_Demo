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
		System.out.println("Service中数据库异常");
	}

	@Override
	public void servicemy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Service中自定义异常");
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
		System.out.println("Service中未知异常");
	}

	@Override
	public void daono() throws Exception {
		// TODO Auto-generated method stub
		testExceptionDao.daono();
	}
}
