package com.xinniuren.utils;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyhabisUtils {

	public static SqlSessionFactory getSessionFactory() throws Exception{
		String resource = "SqlMapConfig.xml";
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
		return sqlSessionFactory;
	}
	
	public static SqlSession getSession() throws Exception{
		SqlSession sqlSession = getSessionFactory().openSession();
		return sqlSession;
	}
}
