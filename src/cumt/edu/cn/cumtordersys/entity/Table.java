package cumt.edu.cn.cumtordersys.entity;

/**
 *@date:2018年5月21日
 *@author:chenjibao
 *@description:餐桌类
 */
public class Table {
	private int tableid;//餐桌id
	private String tablecode;//餐桌编号
	private int seats;//座位数
	private int customers;//当前就餐人数
	private String description;//描述
	
	public Table(int tableid, String tablecode, int seats, int customers, String description) {
		super();
		this.tableid = tableid;
		this.tablecode = tablecode;
		this.seats = seats;
		this.customers = customers;
		this.description = description;
	}
	
	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTableid() {
		return tableid;
	}
	public void setTableid(int tableid) {
		this.tableid = tableid;
	}
	public String getTablecode() {
		return tablecode;
	}
	public void setTablecode(String tablecode) {
		this.tablecode = tablecode;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getCustomers() {
		return customers;
	}
	public void setCustomers(int customers) {
		this.customers = customers;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
