package cumt.edu.cn.qq.service;

import cumt.edu.cn.qq.entity.User;

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
		if("admin".equals(usercode) && "admin".equals(password)) {
			User user=new User();
			user.setUserid(1);
			user.setUsercode(usercode);
			user.setPassword(password);
			user.setUsername("陈继宝");
			return user;
		}
		return null;
	}
}
