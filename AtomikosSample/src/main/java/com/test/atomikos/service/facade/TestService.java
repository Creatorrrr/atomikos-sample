package com.test.atomikos.service.facade;

import java.util.Map;

public interface TestService {
	
	public int selectMssqlTest();
	
	public int selectOracleTest();
	
	public void insertMssqlTest(Map<String, String> map);
	
	public void insertOracleTest(Map<String, String> map);
	
	public void insertTest(Map<String, String> map1, Map<String, String> map2);
	
}
