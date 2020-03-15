package data;

import java.math.BigInteger;
import java.util.Date;

public class OrdersAds {
	
	public BigInteger getOrder_id() {
		return order_id;
	}
	public void setOrder_id(BigInteger order_id) {
		this.order_id = order_id;
	}
	public BigInteger getLine_id() {
		return line_id;
	}
	public void setLine_id(BigInteger line_id) {
		this.line_id = line_id;
	}
	public BigInteger getAddress_id() {
		return address_id;
	}
	public void setAddress_id(BigInteger address_id) {
		this.address_id = address_id;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	private BigInteger order_id = BigInteger.ZERO;
	private BigInteger line_id = BigInteger.ZERO; 
    private BigInteger address_id = BigInteger.ZERO;
    private Date createdDate  = new Date();
	private Date modifiedDate  = new Date();

}
