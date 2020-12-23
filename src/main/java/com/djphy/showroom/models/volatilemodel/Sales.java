package com.djphy.showroom.models.volatilemodel;



import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


public class Sales {

	int customer_Id;
	int vehicle_Id;
	
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	Date order_Date;
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	Date delivery_Date;
	
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
	
	public Date getOrder_Date() {
		return order_Date;
	}
	public void setOrder_Date(Date order_Date) {
		this.order_Date = order_Date;
	}
	public Date getDelivery_Date() {
		return delivery_Date;
	}
	public void setDelivery_Date(Date delivery_Date) {
		this.delivery_Date = delivery_Date;
	}
	@Override
	public String toString() {
		return "Sales [customer_Id=" + customer_Id + ", vehicle_Id=" + vehicle_Id + ", order_Date="
				+ order_Date + ", delivery_Date=" + delivery_Date + "]";
	}
	
	
}
