package com.statement.service;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.statement.dao.TestDao;

@Service("testService")
@Transactional(rollbackFor = { Exception.class })
// ����ע��@Transactional,�Ϳ���ָ���������Ҫ��Spring���������
// @Transactionalֻ�����publicΥ���ڵķ������
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao testDao;

	@Override
	public void test() {
		String deleteSql = "delete from user";
		String saveSql = "insert into user values(?,?,?)";
		Object param[] = { 1, "�º�", "��" };
		try {
			testDao.delete(deleteSql, null);
			testDao.save(saveSql, param);
			// �������������ظ�������
			testDao.save(saveSql, param);
		} catch (Exception e) {
			System.out.println("�����ظ�������ع�");
			throw new RuntimeException();
		}
	}
}
