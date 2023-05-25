package stock.entity.pojo;

import java.io.Serializable;


/**
 * 
 * 
 * 
 */
@SuppressWarnings("serial")
public class Inventory implements Serializable {


	/**
	 * 商品ID
	 */
	private Integer id;

	/**
	 * 商品编号
	 */
	private String productCode;

	/**
	 * 商品名称
	 */
	private String productName;

	/**
	 * 商品描述
	 */
	private String productDescription;

	/**
	 * 库存数量
	 */
	private Integer stockQuantity;

	/**
	 * 创建时间
	 */
	private java.util.Date createdAt;

	/**
	 * 修改时间
	 */
	private java.util.Date updatedAt;

	/**
	 * 备注
	 */
	private String remarks;


	public void setId(Integer id){
		this.id = id;
	}

	public Integer getId(){
		return this.id;
	}

	public void setProductCode(String productCode){
		this.productCode = productCode;
	}

	public String getProductCode(){
		return this.productCode;
	}

	public void setProductName(String productName){
		this.productName = productName;
	}

	public String getProductName(){
		return this.productName;
	}

	public void setProductDescription(String productDescription){
		this.productDescription = productDescription;
	}

	public String getProductDescription(){
		return this.productDescription;
	}

	public void setStockQuantity(Integer stockQuantity){
		this.stockQuantity = stockQuantity;
	}

	public Integer getStockQuantity(){
		return this.stockQuantity;
	}

	public void setCreatedAt(java.util.Date createdAt){
		this.createdAt = createdAt;
	}

	public java.util.Date getCreatedAt(){
		return this.createdAt;
	}

	public void setUpdatedAt(java.util.Date updatedAt){
		this.updatedAt = updatedAt;
	}

	public java.util.Date getUpdatedAt(){
		return this.updatedAt;
	}

	public void setRemarks(String remarks){
		this.remarks = remarks;
	}

	public String getRemarks(){
		return this.remarks;
	}

	public String toString (){
		return "商品ID:"+(id == null ? "空" : id)+"，商品编号:"+(productCode == null ? "空" : productCode)+"，商品名称:"+(productName == null ? "空" : productName)+"，商品描述:"+(productDescription == null ? "空" : productDescription)+"，库存数量:"+(stockQuantity == null ? "空" : stockQuantity)+"，创建时间:"+(createdAt == null ? "空" : createdAt)+"，修改时间:"+(updatedAt == null ? "空" : updatedAt)+"，备注:"+(remarks == null ? "空" : remarks);
	}
}
