package cumt.edu.cn.cumtordersys.entity;
/**
*@date:2018��5��21��
*@author:chenjibao
*@description:ʳ������ʵ����
*/
public class FoodType {
	private int typeid;//ʳ������id
	private String typename;//��������
	
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
