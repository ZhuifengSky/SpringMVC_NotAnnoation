package com.user.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.binding.MapperRegistry;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;
import org.w3c.dom.views.AbstractView;

import com.common.util.SqlSessionFactoryUtil;
import com.sun.xml.internal.ws.encoding.SwACodec;
import com.user.bean.UserQueryBean;
import com.user.dao.UserMapper;
import com.user.model.User;

/**
 * 
 * <p>Title:   HelloWorldController</p>
 * <p>Description: HelloWorld控制类  </p>
 * <p>Company:   www.edu24ol.com</p>
 * @author   pc-zw
 * @date     2015年8月6日下午2:49:06
 * @version  1.0
 */

public class UserController extends AbstractController {
	
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		SqlSessionFactory sessionFactory = SqlSessionFactoryUtil.getSqlSessionFactory();
		SqlSession sqlSession = sessionFactory.openSession();
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		UserQueryBean queryBean = null;
		List<User> users = userMapper.searchUser(queryBean);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("users", users);
		modelAndView.setViewName("listUser");
		return modelAndView;
	}

	



	

}
