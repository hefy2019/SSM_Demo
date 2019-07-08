package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.po.MyUser;

@Repository("userDao")
@Mapper
/*
 * ʹ��Spring�Զ�ɨ��MyBatatis�Ľӿڲ�װ�䣨Spring��ָ���������б�@Mapperע���ע�Ľӿ��Զ�װ��ΪMyBatis��ӳ��ӿڣ�
 */
public interface UserDao {
	/**
	 * �ӿڷ�����ӦSQLӳ���ļ�UserMapper.xml�е�id
	 */
	public List<MyUser> selectUserByUname(MyUser user);
}
