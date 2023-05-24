package common.entity.pojo;

import java.io.Serializable;


/**
 * 
 * 
 * 
 */
@SuppressWarnings("serial")
public class Orders implements Serializable {


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String customerName;

	/**
	 * 
	 */
	private String productName;

	/**
	 * 
	 */
	private java.util.Date orderDate;

	/**
	 * 
	 */
	private java.math.BigDecimal totalAmount;


	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}

	public String getCustomerName(){
		return this.customerName;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return this.productName;
	}

	public void setOrderDate(java.util.Date orderDate){
		this.orderDate = orderDate;
	}

	public java.util.Date getOrderDate(){
		return this.orderDate;
	}

	public void setTotalAmount(java.math.BigDecimal totalAmount){
		this.totalAmount = totalAmount;
	}

	public java.math.BigDecimal getTotalAmount(){
		return this.totalAmount;
	}

	public String toString (){
		return "id:"+(id == null ? "空" : id)+"，customerName:"+(customerName == null ? "空" : customerName)+"，productName:"+(productName == null ? "空" : productName)+"，orderDate:"+(orderDate == null ? "空" : orderDate)+"，totalAmount:"+(totalAmount == null ? "空" : totalAmount);
	}
}
