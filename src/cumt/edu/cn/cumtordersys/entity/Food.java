package cumt.edu.cn.cumtordersys.entity;
/**
*@date:2018��5��21��
*@author:chenjibao
*@description:ʳ����
*/
public class Food {
	private int foodid;//����
	private String foodcode;//����
	private int typeid;//����id
	String foodname;//����
	private double price;//�۸�
	private String description;//˵��
	public Food(int foodid, String foodcode, int typeid, String foodname, double price, String description) {
		super();
		this.foodid = foodid;
		this.foodcode = foodcode;
		this.typeid = typeid;
		this.foodname = foodname;
		this.price = price;
		this.description = description;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getFoodcode() {
		return foodcode;
	}
	public void setFoodcode(String foodcode) {
		this.foodcode = foodcode;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
