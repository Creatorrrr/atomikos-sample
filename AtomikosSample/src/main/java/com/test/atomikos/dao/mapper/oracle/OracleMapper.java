package com.test.atomikos.dao.mapper.oracle;

import java.util.Map;

public interface OracleMapper {
	
	public int selectTest();
	
	public int insertTest(Map<String, String> map);
	
	public int updateTest(Map<String, String> map);
	
}
