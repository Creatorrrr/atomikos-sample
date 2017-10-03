package com.test.atomikos.dao.impl;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.test.atomikos.dao.facade.OracleDao;
import com.test.atomikos.dao.mapper.oracle.OracleMapper;

@Repository
public class OracleDaoLogic implements OracleDao {
	
	@Autowired
	@Qualifier("sqlSessionOracle")
	private SqlSession session;
	
	@Override
	public int selectTest() {
		return session.getMapper(OracleMapper.class).selectTest();
	}
	
	@Override
	public boolean insertTest(Map<String, String> map) {
		return session.getMapper(OracleMapper.class).insertTest(map) > 0;
	}
	
	@Override
	public boolean updateTest(Map<String, String> map) {
		return session.getMapper(OracleMapper.class).updateTest(map) > 0;
	}
	
}
