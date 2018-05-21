package cumt.edu.cn.cumtordersys.entity;
/**
*@date:2018年5月21日
*@author:chenjibao
*@description:用户类
*/
public class User {
	private int userid;//主键
	private String usercode;//编号
	private String username;//姓名
	private String password;//密码
	public User(int userid, String usercode, String username, String password) {
		super();
		this.userid = userid;
		this.usercode = usercode;
		this.username = username;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
