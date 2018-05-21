package cumt.edu.cn.cumtordersys.entity;

import java.util.Date;
import java.util.List;
/**
 *@date:2018年5月21日
 *@author:chenjibao
 *@description:订单类
 */
public class Order {
	private int orderId;//订单id
	private String orderCode;//订单编号
	private int tableId;//餐桌id
	private int waiterId;//服务员id
	private Date orderTime;//下单时间
	private int customers;//顾客数量
	private int status;//-1取消     0未结算    1已结算
	private String description;//说明
	private List<OrderDetail> orderDetails;//订单所包含的所有订单条目
	
	public Order(int orderId, String orderCode, int tableId, int waiterId, Date orderTime, int customers, int status,
			String description, List<OrderDetail> orderDetails) {
		super();
		this.orderId = orderId;
		this.orderCode = orderCode;
		this.tableId = tableId;
		this.waiterId = waiterId;
		this.orderTime = orderTime;
		this.customers = customers;
		this.status = status;
		this.description = description;
		this.orderDetails = orderDetails;
	}
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public int getTableId() {
		return tableId;
	}
	public void setTableId(int tableId) {
		this.tableId = tableId;
	}
	public int getWaiterId() {
		return waiterId;
	}
	public void setWaiterId(int waiterId) {
		this.waiterId = waiterId;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public int getCustomers() {
		return customers;
	}
	public void setCustomers(int customers) {
		this.customers = customers;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}
}
