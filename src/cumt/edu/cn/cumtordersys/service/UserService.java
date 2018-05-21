package cumt.edu.cn.cumtordersys.service;

import cumt.edu.cn.cumtordersys.entity.User;

/**
 *@date:2018年5月21日
 *@author:chenjibao
 *@description:用户业务类
 */
public class UserService {
	/**
	 * @param usercode 用户编号
	 * @param password 密码
	 * @return 用户对象
	 */
	public User login(String usercode,String password) {
		if("test".equals(usercode) && "test".equals(password)) {
			User user=new User();
			user.setUserid(1);
			user.setUsercode(usercode);
			user.setPassword(password);
			user.setUsername("张王李赵");
			return user;
		}
		return null;
		
	}
}
