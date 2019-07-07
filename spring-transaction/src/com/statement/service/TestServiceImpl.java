package com.statement.service;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.statement.dao.TestDao;

@Service("testService")
@Transactional(rollbackFor = { Exception.class })
// 加上注解@Transactional,就可以指定这个类需要受Spring的事务管理
// @Transactional只能针对public违反内的方法添加
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao testDao;

	@Override
	public void test() {
		String deleteSql = "delete from user";
		String saveSql = "insert into user values(?,?,?)";
		Object param[] = { 1, "陈恒", "男" };
		try {
			testDao.delete(deleteSql, null);
			testDao.save(saveSql, param);
			// 插入两条主键重复的数据
			testDao.save(saveSql, param);
		} catch (Exception e) {
			System.out.println("主键重复，事务回滚");
			throw new RuntimeException();
		}
	}
}
