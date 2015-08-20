package com.user.dao;

import java.util.List;

import com.user.bean.UserQueryBean;
import com.user.model.User;

/**
 * 
 * <p>Title:   IUserMapper</p>
 * <p>Description: UserMapper接口 </p>
 * <p>Company:   www.edu24ol.com</p>
 * @author   pc-zw
 * @date     2015年8月6日下午5:17:32
 * @version  1.0
 */
public interface UserMapper {


	/**
	 * 用户列表查询
	 * @param queryBean
	 * @return
	 */
	public List<User> searchUser(UserQueryBean queryBean);
}
