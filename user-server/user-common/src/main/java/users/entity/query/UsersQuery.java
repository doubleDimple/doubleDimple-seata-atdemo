package users.entity.query;



/**
 * 
 * 参数
 * 
 */
public class UsersQuery extends BaseParam{


	/**
	 * 
	 */
	private Integer userId;

	/**
	 * 用户名
	 */
	private String username;

	private String usernameFuzzy;

	/**
	 * 姓名
	 */
	private String fullName;

	private String fullNameFuzzy;

	/**
	 * 电子邮件
	 */
	private String email;

	private String emailFuzzy;

	/**
	 * 手机号码
	 */
	private String phoneNumber;

	private String phoneNumberFuzzy;

	/**
	 * 密码哈希
	 */
	private String passwordHash;

	private String passwordHashFuzzy;

	/**
	 * 地址
	 */
	private String address;

	private String addressFuzzy;

	/**
	 * 注册日期
	 */
	private java.util.Date registrationDate;

	private String registrationDateStart;

	private String registrationDateEnd;

	/**
	 * 最后登录日期
	 */
	private java.util.Date lastLoginDate;

	private String lastLoginDateStart;

	private String lastLoginDateEnd;

	/**
	 * 账户状态
	 */
	private String accountStatus;

	private String accountStatusFuzzy;

	/**
	 * 用户类型
	 */
	private String userType;

	private String userTypeFuzzy;

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


	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return this.userId;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername(){
		return this.username;
	}

	public void setUsernameFuzzy(String usernameFuzzy){
		this.usernameFuzzy = usernameFuzzy;
	}

	public String getUsernameFuzzy(){
		return this.usernameFuzzy;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return this.fullName;
	}

	public void setFullNameFuzzy(String fullNameFuzzy){
		this.fullNameFuzzy = fullNameFuzzy;
	}

	public String getFullNameFuzzy(){
		return this.fullNameFuzzy;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setEmailFuzzy(String emailFuzzy){
		this.emailFuzzy = emailFuzzy;
	}

	public String getEmailFuzzy(){
		return this.emailFuzzy;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return this.phoneNumber;
	}

	public void setPhoneNumberFuzzy(String phoneNumberFuzzy){
		this.phoneNumberFuzzy = phoneNumberFuzzy;
	}

	public String getPhoneNumberFuzzy(){
		return this.phoneNumberFuzzy;
	}

	public void setPasswordHash(String passwordHash){
		this.passwordHash = passwordHash;
	}

	public String getPasswordHash(){
		return this.passwordHash;
	}

	public void setPasswordHashFuzzy(String passwordHashFuzzy){
		this.passwordHashFuzzy = passwordHashFuzzy;
	}

	public String getPasswordHashFuzzy(){
		return this.passwordHashFuzzy;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return this.address;
	}

	public void setAddressFuzzy(String addressFuzzy){
		this.addressFuzzy = addressFuzzy;
	}

	public String getAddressFuzzy(){
		return this.addressFuzzy;
	}

	public void setRegistrationDate(java.util.Date registrationDate){
		this.registrationDate = registrationDate;
	}

	public java.util.Date getRegistrationDate(){
		return this.registrationDate;
	}

	public void setRegistrationDateStart(String registrationDateStart){
		this.registrationDateStart = registrationDateStart;
	}

	public String getRegistrationDateStart(){
		return this.registrationDateStart;
	}
	public void setRegistrationDateEnd(String registrationDateEnd){
		this.registrationDateEnd = registrationDateEnd;
	}

	public String getRegistrationDateEnd(){
		return this.registrationDateEnd;
	}

	public void setLastLoginDate(java.util.Date lastLoginDate){
		this.lastLoginDate = lastLoginDate;
	}

	public java.util.Date getLastLoginDate(){
		return this.lastLoginDate;
	}

	public void setLastLoginDateStart(String lastLoginDateStart){
		this.lastLoginDateStart = lastLoginDateStart;
	}

	public String getLastLoginDateStart(){
		return this.lastLoginDateStart;
	}
	public void setLastLoginDateEnd(String lastLoginDateEnd){
		this.lastLoginDateEnd = lastLoginDateEnd;
	}

	public String getLastLoginDateEnd(){
		return this.lastLoginDateEnd;
	}

	public void setAccountStatus(String accountStatus){
		this.accountStatus = accountStatus;
	}

	public String getAccountStatus(){
		return this.accountStatus;
	}

	public void setAccountStatusFuzzy(String accountStatusFuzzy){
		this.accountStatusFuzzy = accountStatusFuzzy;
	}

	public String getAccountStatusFuzzy(){
		return this.accountStatusFuzzy;
	}

	public void setUserType(String userType){
		this.userType = userType;
	}

	public String getUserType(){
		return this.userType;
	}

	public void setUserTypeFuzzy(String userTypeFuzzy){
		this.userTypeFuzzy = userTypeFuzzy;
	}

	public String getUserTypeFuzzy(){
		return this.userTypeFuzzy;
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

}
