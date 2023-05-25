package stock.entity.query;



/**
 * 
 * 参数
 * 
 */
public class InventoryQuery extends BaseParam{


	/**
	 * 商品ID
	 */
	private Integer id;

	/**
	 * 商品编号
	 */
	private String productCode;

	private String productCodeFuzzy;

	/**
	 * 商品名称
	 */
	private String productName;

	private String productNameFuzzy;

	/**
	 * 商品描述
	 */
	private String productDescription;

	private String productDescriptionFuzzy;

	/**
	 * 库存数量
	 */
	private Integer stockQuantity;

	/**
	 * 创建时间
	 */
	private java.util.Date createdAt;

	private String createdAtStart;

	private String createdAtEnd;

	/**
	 * 修改时间
	 */
	private java.util.Date updatedAt;

	private String updatedAtStart;

	private String updatedAtEnd;

	/**
	 * 备注
	 */
	private String remarks;

	private String remarksFuzzy;


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

	public void setProductCodeFuzzy(String productCodeFuzzy){
		this.productCodeFuzzy = productCodeFuzzy;
	}

	public String getProductCodeFuzzy(){
		return this.productCodeFuzzy;
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

	public void setProductDescription(String productDescription){
		this.productDescription = productDescription;
	}

	public String getProductDescription(){
		return this.productDescription;
	}

	public void setProductDescriptionFuzzy(String productDescriptionFuzzy){
		this.productDescriptionFuzzy = productDescriptionFuzzy;
	}

	public String getProductDescriptionFuzzy(){
		return this.productDescriptionFuzzy;
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

	public void setCreatedAtStart(String createdAtStart){
		this.createdAtStart = createdAtStart;
	}

	public String getCreatedAtStart(){
		return this.createdAtStart;
	}
	public void setCreatedAtEnd(String createdAtEnd){
		this.createdAtEnd = createdAtEnd;
	}

	public String getCreatedAtEnd(){
		return this.createdAtEnd;
	}

	public void setUpdatedAt(java.util.Date updatedAt){
		this.updatedAt = updatedAt;
	}

	public java.util.Date getUpdatedAt(){
		return this.updatedAt;
	}

	public void setUpdatedAtStart(String updatedAtStart){
		this.updatedAtStart = updatedAtStart;
	}

	public String getUpdatedAtStart(){
		return this.updatedAtStart;
	}
	public void setUpdatedAtEnd(String updatedAtEnd){
		this.updatedAtEnd = updatedAtEnd;
	}

	public String getUpdatedAtEnd(){
		return this.updatedAtEnd;
	}

	public void setRemarks(String remarks){
		this.remarks = remarks;
	}

	public String getRemarks(){
		return this.remarks;
	}

	public void setRemarksFuzzy(String remarksFuzzy){
		this.remarksFuzzy = remarksFuzzy;
	}

	public String getRemarksFuzzy(){
		return this.remarksFuzzy;
	}

}
