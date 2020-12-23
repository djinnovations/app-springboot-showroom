package com.djphy.showroom.models;



import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Sales {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	Date order_Date;
	@DateTimeFormat(iso = ISO.DATE, pattern = "yyyy-MM-dd")
	Date delivery_Date;
	
	@ManyToOne
	Customers customers;
	@OneToOne
	Vehicles vehicles;
	
	
	public static Sales toMap(com.djphy.showroom.models.volatilemodel.SalesStringDate sales) {
		return new Sales(getDate(sales.getOrder_Date()),
				getDate(sales.getDelivery_Date()));
	}
	
	public Sales() {
		
	}

	
	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}


	public Vehicles getVehicles() {
		return vehicles;
	}


	public void setVehicles(Vehicles vehicles) {
		this.vehicles = vehicles;
	}


	public Sales(Date order_Date, Date delivery_Date) {
		super();
		this.order_Date = order_Date;
		this.delivery_Date = delivery_Date;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Sales [id=" + id + ", order_Date=" + order_Date + ", delivery_Date=" + delivery_Date + ", customers="
				+ customers + ", vehicles=" + vehicles + "]";
	}

	private static Date getDate(String date) {
		try {
			Date dateObj = new Date(new SimpleDateFormat("yyyy-mm-dd").parse(date).getTime());
			return dateObj;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
