package users.entity.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;


/**
 * 
 * 
 * 
 */
@SuppressWarnings("serial")
public class Users implements Serializable {


	/**
	 * 
	 */
	private Integer userId;

	/**
	 * 用户名
	 */
	private String username;

	/**
	 * 姓名
	 */
	private String fullName;

	/**
	 * 电子邮件
	 */
	private String email;

	/**
	 * 手机号码
	 */
	private String phoneNumber;

	/**
	 * 密码哈希
	 */
	@JsonIgnore
	private String passwordHash;

	/**
	 * 地址
	 */
	private String address;

	/**
	 * 注册日期
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private java.util.Date registrationDate;

	/**
	 * 最后登录日期
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private java.util.Date lastLoginDate;

	/**
	 * 账户状态
	 */
	private String accountStatus;

	/**
	 * 用户类型
	 */
	private String userType;

	/**
	 * 创建时间
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private java.util.Date createdAt;

	/**
	 * 修改时间
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
	private java.util.Date updatedAt;


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

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return this.fullName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return this.email;
	}

	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber(){
		return this.phoneNumber;
	}

	public void setPasswordHash(String passwordHash){
		this.passwordHash = passwordHash;
	}

	public String getPasswordHash(){
		return this.passwordHash;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return this.address;
	}

	public void setRegistrationDate(java.util.Date registrationDate){
		this.registrationDate = registrationDate;
	}

	public java.util.Date getRegistrationDate(){
		return this.registrationDate;
	}

	public void setLastLoginDate(java.util.Date lastLoginDate){
		this.lastLoginDate = lastLoginDate;
	}

	public java.util.Date getLastLoginDate(){
		return this.lastLoginDate;
	}

	public void setAccountStatus(String accountStatus){
		this.accountStatus = accountStatus;
	}

	public String getAccountStatus(){
		return this.accountStatus;
	}

	public void setUserType(String userType){
		this.userType = userType;
	}

	public String getUserType(){
		return this.userType;
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

	public String toString (){
		return "userId:"+(userId == null ? "空" : userId)+"，用户名:"+(username == null ? "空" : username)+"，姓名:"+(fullName == null ? "空" : fullName)+"，电子邮件:"+(email == null ? "空" : email)+"，手机号码:"+(phoneNumber == null ? "空" : phoneNumber)+"，密码哈希:"+(passwordHash == null ? "空" : passwordHash)+"，地址:"+(address == null ? "空" : address)+"，注册日期:"+(registrationDate == null ? "空" : registrationDate)+"，最后登录日期:"+(lastLoginDate == null ? "空" : lastLoginDate)+"，账户状态:"+(accountStatus == null ? "空" : accountStatus)+"，用户类型:"+(userType == null ? "空" : userType)+"，创建时间:"+(createdAt == null ? "空" : createdAt)+"，修改时间:"+(updatedAt == null ? "空" : updatedAt);
	}

}
