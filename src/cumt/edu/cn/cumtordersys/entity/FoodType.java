package cumt.edu.cn.cumtordersys.entity;
/**
*@date:2018年5月21日
*@author:chenjibao
*@description:食物类型实体类
*/
public class FoodType {
	private int typeid;//食物类型id
	private String typename;//类型名称
	
	public FoodType(int typeid, String typename) {
		super();
		this.typeid = typeid;
		this.typename = typename;
	}
	
	public FoodType() {
		super();
	}

	public int getTypeid() {
		return typeid;
	}

	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}
	
	
	
}
