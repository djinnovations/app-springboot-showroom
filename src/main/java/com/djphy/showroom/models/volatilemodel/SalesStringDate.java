package com.djphy.showroom.models.volatilemodel;




public class SalesStringDate {

	int customer_Id;
	int vehicle_Id;
	
	String order_Date;
	String delivery_Date;
	
	public int getCustomer_Id() {
		return customer_Id;
	}
	public void setCustomer_Id(int customer_Id) {
		this.customer_Id = customer_Id;
	}
	public int getVehicle_Id() {
		return vehicle_Id;
	}
	public void setVehicle_Id(int vehicle_Id) {
		this.vehicle_Id = vehicle_Id;
	}
	
	
	
	public String getOrder_Date() {
		return order_Date;
	}
	public void setOrder_Date(String order_Date) {
		this.order_Date = order_Date;
	}
	public String getDelivery_Date() {
		return delivery_Date;
	}
	public void setDelivery_Date(String delivery_Date) {
		this.delivery_Date = delivery_Date;
	}
	@Override
	public String toString() {
		return "Sales [customer_Id=" + customer_Id + ", vehicle_Id=" + vehicle_Id + ", order_Date="
				+ order_Date + ", delivery_Date=" + delivery_Date + "]";
	}
	
	
}
