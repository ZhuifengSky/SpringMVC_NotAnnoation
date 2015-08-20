package com.user.dao;

import java.util.List;

import com.user.bean.UserQueryBean;
import com.user.model.User;

/**
 * 
 * <p>Title:   IUserMapper</p>
 * <p>Description: UserMapper�ӿ� </p>
 * <p>Company:   www.edu24ol.com</p>
 * @author   pc-zw
 * @date     2015��8��6������5:17:32
 * @version  1.0
 */
public interface UserMapper {


	/**
	 * �û��б��ѯ
	 * @param queryBean
	 * @return
	 */
	public List<User> searchUser(UserQueryBean queryBean);
}
