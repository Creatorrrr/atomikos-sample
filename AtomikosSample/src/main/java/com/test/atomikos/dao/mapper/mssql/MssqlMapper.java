package com.test.atomikos.dao.mapper.mssql;

import java.util.Map;

public interface MssqlMapper {
	
	public int selectTest();
	
	public int insertTest(Map<String, String> map);
	
	public int updateTest(Map<String, String> map);
	
}
