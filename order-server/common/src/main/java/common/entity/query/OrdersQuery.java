package common.entity.query;



/**
 * 
 * 参数
 * 
 */
public class OrdersQuery extends BaseParam{


	/**
	 * 
	 */
	private Integer id;

	/**
	 * 
	 */
	private String customerName;

	private String customerNameFuzzy;

	/**
	 * 
	 */
	private String productName;

	private String productNameFuzzy;

	/**
	 * 
	 */
	private java.util.Date orderDate;

	private String orderDateStart;

	private String orderDateEnd;

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

	public void setCustomerNameFuzzy(String customerNameFuzzy){
		this.customerNameFuzzy = customerNameFuzzy;
	}

	public String getCustomerNameFuzzy(){
		return this.customerNameFuzzy;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return this.productName;
	}

	public void setProductNameFuzzy(String productNameFuzzy){
		this.productNameFuzzy = productNameFuzzy;
	}

	public String getProductNameFuzzy(){
		return this.productNameFuzzy;
	}

	public void setOrderDate(java.util.Date orderDate){
		this.orderDate = orderDate;
	}

	public java.util.Date getOrderDate(){
		return this.orderDate;
	}

	public void setOrderDateStart(String orderDateStart){
		this.orderDateStart = orderDateStart;
	}

	public String getOrderDateStart(){
		return this.orderDateStart;
	}
	public void setOrderDateEnd(String orderDateEnd){
		this.orderDateEnd = orderDateEnd;
	}

	public String getOrderDateEnd(){
		return this.orderDateEnd;
	}

	public void setTotalAmount(java.math.BigDecimal totalAmount){
		this.totalAmount = totalAmount;
	}

	public java.math.BigDecimal getTotalAmount(){
		return this.totalAmount;
	}

}
