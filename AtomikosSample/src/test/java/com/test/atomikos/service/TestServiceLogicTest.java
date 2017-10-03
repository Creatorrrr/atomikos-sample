package com.test.atomikos.service;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.atomikos.service.facade.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class TestServiceLogicTest {
	
	@Autowired
	private TestService service;

//	@Test
//	public void testSelectMssqlTest() {
//		System.out.println("MSSQL : " + service.selectMssqlTest());
//	}
//
//	@Test
//	public void testSelectOracleTest() {
//		System.out.println("ORACLE : " + service.selectOracleTest());
//	}
//
//	@Test
//	public void testInsertMssqlTest() {
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("t1", "aaaa");
//		map.put("t2", "bbbb");
//		
//		service.insertMssqlTest(map);
//
//		System.out.println("MSSQL : " + service.selectMssqlTest());
//	}
//
//	@Test
//	public void testInsertOracleTest() {
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("t1", "aaaa");
//		map.put("t2", "bbbb");
//		
//		service.insertOracleTest(map);
//
//		System.out.println("ORACLE : " + service.selectOracleTest());
//	}

	@Test
	public void testInsertTest() {
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("t1", "aaaa");
		map1.put("t2", "bbbb");
		

		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("t1", "aaaa");
		map2.put("t2", "cccc");
		
		service.insertTest(map1, map2);

		System.out.println("MSSQL : " + service.selectMssqlTest());
		System.out.println("ORACLE : " + service.selectOracleTest());
	}

}
