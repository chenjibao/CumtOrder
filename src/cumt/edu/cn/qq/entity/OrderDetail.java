package cumt.edu.cn.qq.entity;

/**
 *@date:2018��5��21��
 *@author:chenjibao
 *@description:������Ŀ
 */
public class OrderDetail {
	private int orderDetailId;//������Ŀid
	private int orderId;//��������id
	private int foodId;//ʳ��id
	private int num;//��������
	private String description;//����
	
	public OrderDetail(int orderDetailId, int orderId, int foodId, int num, String description) {
		super();
		this.orderDetailId = orderDetailId;
		this.orderId = orderId;
		this.foodId = foodId;
		this.num = num;
		this.description = description;
	}

	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(int orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
