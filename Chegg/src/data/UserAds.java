package data;

import java.math.BigInteger;
import java.util.Date;

public class UserAds {
	
	
	public UserAds() {
		
	}
	
	private BigInteger address_id = BigInteger.ZERO;
	private BigInteger user_id  = BigInteger.ZERO;
	private String fistName  = "";
	private String lastName  = "";
	private String line1 = "";
	private String line2 = "";
	private String city = "";
	private String state = "";
	private String zip = "";
	private String country ="";
	private Date createdDate  = new Date();
	private int createdBy = 0;
	private int modifiedBy = 0;
	private Date modifiedDate  = new Date();
	
	public BigInteger getAddress_id() {
		return address_id;
	}
	public void setAddress_id(BigInteger address_id) {
		this.address_id = address_id;
	}
	public BigInteger getUser_id() {
		return user_id;
	}
	public void setUser_id(BigInteger user_id) {
		this.user_id = user_id;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public int getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	

}