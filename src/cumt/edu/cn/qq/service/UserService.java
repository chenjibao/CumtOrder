package cumt.edu.cn.qq.service;

import cumt.edu.cn.qq.entity.User;

/**
 *@date:2018��5��21��
 *@author:chenjibao
 *@description:�û�ҵ����
 */
public class UserService {
	/**
	 * @param usercode �û����
	 * @param password ����
	 * @return �û�����
	 */
	public User login(String usercode,String password) {
		if("admin".equals(usercode) && "admin".equals(password)) {
			User user=new User();
			user.setUserid(1);
			user.setUsercode(usercode);
			user.setPassword(password);
			user.setUsername("�¼̱�");
			return user;
		}
		return null;
	}
}
