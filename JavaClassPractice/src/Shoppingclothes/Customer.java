package Shoppingclothes;

import java.time.LocalTime;

public class Customer {
	
	private int CustomerId;

	private String Name;
	
	private long MobNo;
	
	private String prefDress;
	
	private String allocatedDress;
	
	private int paidAmt;
	
	private LocalTime ld;
	
	private LocalTime rntm;
	
	Customer(int CustomerId,String Name,long MobNo,String prefDress){
		this.CustomerId=CustomerId;
		this.Name=Name;
		this.MobNo=MobNo;
		this.prefDress=prefDress;
	}

	public LocalTime getRntm() {
		return rntm;
	}

	public void setRntm(LocalTime rntm) {
		this.rntm = rntm;
	}

	public LocalTime getLd() {
		return ld;
	}

	public void setLd(LocalTime ld) {
		this.ld = ld;
	}

	public int getPaidAmt() {
		return paidAmt;
	}

	public void setPaidAmt(int paidAmt) {
		this.paidAmt = paidAmt;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getMobNo() {
		return MobNo;
	}

	public void setMobNo(long mobNo) {
		MobNo = mobNo;
	}

	public String getPrefDress() {
		return prefDress;
	}

	public void setPrefDress(String prefDress) {
		this.prefDress = prefDress;
	}

	public String getAllocatedDress() {
		return allocatedDress;
	}

	public void setAllocatedDress(String allocatedDress) {
		this.allocatedDress = allocatedDress;
	}

}
