package com.test.atomikos.service.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.atomikos.dao.facade.MssqlDao;
import com.test.atomikos.dao.facade.OracleDao;
import com.test.atomikos.service.facade.TestService;

@Service
public class TestServiceLogic implements TestService {
	
	private static final Logger logger = LoggerFactory.getLogger(TestServiceLogic.class);
	
	@Autowired
	private MssqlDao mssqlDao;
	@Autowired
	private OracleDao oracleDao;

	@Override
	public int selectMssqlTest() {
		return mssqlDao.selectTest();
	}

	@Override
	public int selectOracleTest() {
		return oracleDao.selectTest();
	}

	@Override
	public void insertMssqlTest(Map<String, String> map) {
		mssqlDao.insertTest(map);
	}

	@Override
	public void insertOracleTest(Map<String, String> map) {
		oracleDao.insertTest(map);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, rollbackFor=Exception.class)
	public void insertTest(Map<String, String> map1, Map<String, String> map2) {
		logger.info("Transaction Started");
		oracleDao.insertTest(map1);
		oracleDao.updateTest(map2);
		mssqlDao.insertTest(map1);
		mssqlDao.updateTest(map2);
		//int i = 1/0;
		logger.info("Transaction Finished");
	}
	
}
