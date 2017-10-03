package com.test.atomikos.dao.impl;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.test.atomikos.dao.facade.MssqlDao;
import com.test.atomikos.dao.mapper.mssql.MssqlMapper;

@Repository
public class MssqlDaoLogic implements MssqlDao {
	
	@Autowired
	@Qualifier("sqlSessionMssql")
	private SqlSession session;
	
	@Override
	public int selectTest() {
		return session.getMapper(MssqlMapper.class).selectTest();
	}
	
	@Override
	public boolean insertTest(Map<String, String> map) {
		return session.getMapper(MssqlMapper.class).insertTest(map) > 0;
	}
	
	@Override
	public boolean updateTest(Map<String, String> map) {
		return session.getMapper(MssqlMapper.class).updateTest(map) > 0;
	}
	
}
