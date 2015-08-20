package com.common.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
 * <p>Title:   SqlSessionFactoryUtil</p>
 * <p>Description:   SqlSessionFactory工具类</p>
 * <p>Company:   www.edu24ol.com</p>
 * @author   pc-zw
 * @date     2015年8月6日下午5:51:04
 * @version  1.0
 */
public class SqlSessionFactoryUtil {

	
	
	public static SqlSessionFactory getSqlSessionFactory(){
		String resource = "/config/mybatis_config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			System.out.println(sqlSessionFactory==null);
			return sqlSessionFactory;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	public static void main(String[] args) {
		SqlSessionFactory factory = SqlSessionFactoryUtil.getSqlSessionFactory();
		System.out.println(factory.equals(null));
	}
	
}
