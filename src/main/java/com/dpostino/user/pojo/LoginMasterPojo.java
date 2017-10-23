package com.dpostino.user.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="DPOSTINO_LOGIN_MASTER")
public class LoginMasterPojo implements Serializable {

	/**
	 * @author JDEVS
	 */
	private static final long serialVersionUID = 1L;

	//fields 
	@Id
	@Column(name="USERNAME")
	private String USERNAME;
	
	@Column(name="PASSWORD")
	private String PASSWORD;
	
	@Column(name="COUNTRY_ID")
	private String COUNTRY_ID;
	
	@Column(name="CATEGORY_ID")
	private String CATEGORY_ID;
	
	@Column(name="CREATED_DATE")
	private Date CREATED_DATE;
	
	@Column(name="CREATED_ON")
	private String CREATED_ON;
	
	@Column(name="CREATED_BY")
	private String CREATED_BY;
	
	@Column(name="CREATED_TIME")
	private Date CREATED_TIME;
	
	@Column(name="RECORD_STATUS")
	private Integer RECORD_STATUS;
	
	@Column(name="ROLE_ID")
	private Integer ROLE_ID;
	
	@Column(name="PWD_CHNG_FLAG")
	private Integer PWD_CHNG_FLAG;
	
	@Column(name="USER_EMAIL")
	private String USER_EMAIL;
	
	@Column(name="MOBILE_NO")
	private String MOBILE_NO;
	
	
	
	// getters and setters
	
	
	public String getUSERNAME() {
		return USERNAME;
	}
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	public String getPASSWORD() {
		return PASSWORD;
	}
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	public String getCOUNTRY_ID() {
		return COUNTRY_ID;
	}
	public void setCOUNTRY_ID(String cOUNTRY_ID) {
		COUNTRY_ID = cOUNTRY_ID;
	}
	public String getCATEGORY_ID() {
		return CATEGORY_ID;
	}
	public void setCATEGORY_ID(String cATEGORY_ID) {
		CATEGORY_ID = cATEGORY_ID;
	}
	public Date getCREATED_DATE() {
		return CREATED_DATE;
	}
	public void setCREATED_DATE(Date cREATED_DATE) {
		CREATED_DATE = cREATED_DATE;
	}
	public String getCREATED_ON() {
		return CREATED_ON;
	}
	public void setCREATED_ON(String cREATED_ON) {
		CREATED_ON = cREATED_ON;
	}
	public String getCREATED_BY() {
		return CREATED_BY;
	}
	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}
	public Date getCREATED_TIME() {
		return CREATED_TIME;
	}
	public void setCREATED_TIME(Date cREATED_TIME) {
		CREATED_TIME = cREATED_TIME;
	}
	public Integer getRECORD_STATUS() {
		return RECORD_STATUS;
	}
	public void setRECORD_STATUS(Integer rECORD_STATUS) {
		RECORD_STATUS = rECORD_STATUS;
	}
	public Integer getROLE_ID() {
		return ROLE_ID;
	}
	public void setROLE_ID(Integer rOLE_ID) {
		ROLE_ID = rOLE_ID;
	}
	public Integer getPWD_CHNG_FLAG() {
		return PWD_CHNG_FLAG;
	}
	public void setPWD_CHNG_FLAG(Integer pWD_CHNG_FLAG) {
		PWD_CHNG_FLAG = pWD_CHNG_FLAG;
	}
	public String getUSER_EMAIL() {
		return USER_EMAIL;
	}
	public void setUSER_EMAIL(String uSER_EMAIL) {
		USER_EMAIL = uSER_EMAIL;
	}
	public String getMOBILE_NO() {
		return MOBILE_NO;
	}
	public void setMOBILE_NO(String mOBILE_NO) {
		MOBILE_NO = mOBILE_NO;
	}
	
	
	
	
}
