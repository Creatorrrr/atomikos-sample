package com.test.atomikos.dao.facade;

import java.util.Map;

public interface MssqlDao {
	public int selectTest();
	
	public boolean insertTest(Map<String, String> map);
	
	public boolean updateTest(Map<String, String> map);
}
