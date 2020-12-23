package com.djphy.showroom;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.djphy.showroom.models.Customers;
import com.djphy.showroom.models.Dealers;
import com.djphy.showroom.models.Sales;
import com.djphy.showroom.models.volatilemodel.Vehicles;
import com.djphy.showroom.repo.CustomersRepository;
import com.djphy.showroom.repo.DealerRepository;
import com.djphy.showroom.repo.SalesRepository;
import com.djphy.showroom.repo.VehicleRepository;

@Controller
public class GenericController {

	@Autowired
	VehicleRepository vehicleRepo;
	@Autowired
	DealerRepository dealerRepo;
	@Autowired
	SalesRepository salesRepo;
	@Autowired
	CustomersRepository customerRepo;

	@RequestMapping("/index")
	public String displayLanding() {
		return "index";
	}


	//	@RequestMapping("/index")
	//	public ModelAndView displayLanding() {
	//		ArrayList<Sales> list = new ArrayList<>();
	//		list.add(new Sales(1, "dj1", "v1"));
	//		list.add(new Sales(2, "dj2", "v2"));
	//		list.add(new Sales(3, "dj3", "v3"));
	//		list.add(new Sales(4, "dj4", "v4"));
	//		ModelAndView modelAndView = new ModelAndView("display");
	//		modelAndView.addObject("data", list);
	//		return modelAndView;
	//	}


	@RequestMapping(path = "/approve", params = "dealer")
	public String displayAddDealer() {
		return "add_dealer";
	}

	@RequestMapping(path = "/approve", params = "vehicle")
	public String displayAddVehicle() {
		return "add_vehicle";
	}

	@RequestMapping(path = "/approve", params = "customer")
	public String displayAddCustomer() {
		return "add_customer";
	}

	@RequestMapping(path = "/approve", params = "sales")
	public String displayAddSales(){
		return "add_sales"; 
	}

	@RequestMapping("saveDealer")
	public ModelAndView addDealer(Dealers dealer) {
		ModelAndView modelAndView = new ModelAndView("add_dealer");
		try {
			modelAndView.addObject("msg", "Dealer added successfully");
			dealerRepo.save(dealer);
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.addObject("msg", e.getCause().getMessage());
		}
		return modelAndView;
	}

	@RequestMapping("saveCustomer")
	public ModelAndView addCustomer(Customers customer) {
		ModelAndView modelAndView = new ModelAndView("add_customer");
		try {
			modelAndView.addObject("msg", "Customer added successfully");
			customerRepo.save(customer);
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.addObject("msg", e.getCause().getMessage());
		}
		return modelAndView;
	}

	@RequestMapping("saveVehicle")
	public ModelAndView addVehicle(Vehicles vehicle) {
		ModelAndView modelAndView = new ModelAndView("add_vehicle");
		try {
			com.djphy.showroom.models.Vehicles tableData = 
					com.djphy.showroom.models.Vehicles.toMap(vehicle);
			Dealers dealer = dealerRepo.findById(vehicle.getDealer_Id()).orElse(null);
			if(dealer == null) {
				modelAndView.addObject("msg", "Dealer id not found");
			} else {
				modelAndView.addObject("msg", "Vehicle added successfully");
				tableData.setDealers(dealer);
				vehicleRepo.save(tableData);
			}
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.addObject("msg", e.getCause().getMessage());
		}
		return modelAndView;
	}

	@RequestMapping("saveSales")
	public ModelAndView addSales(
			com.djphy.showroom.models.volatilemodel.SalesStringDate sales) {
		ModelAndView modelAndView = new ModelAndView("add_sales");
		try {
			Sales tableData = Sales.toMap(sales);
			Customers customer = customerRepo.findById(sales.getCustomer_Id()).orElse(null);
			com.djphy.showroom.models.Vehicles vehicle = 
					vehicleRepo.findById(sales.getVehicle_Id()).orElse(null);

			if(customer == null) {
				modelAndView.addObject("msg", "Customer id not found");
				return modelAndView;
			} 
			if(vehicle == null) {
				modelAndView.addObject("msg", "Vehicle id not found");
				return modelAndView;
			}
			List<Sales> list = salesRepo.findByVehicles(vehicle);
			if(list != null) {
				if(list.size() > 0) {
					modelAndView.addObject("msg", "Vehicle id sold out");
					return modelAndView;
				}
			}
		
			modelAndView.addObject("msg", "Sale is created successfully");
			tableData.setCustomers(customer);
			tableData.setVehicles(vehicle);
			salesRepo.save(tableData);
		} catch (Exception e) {
			e.printStackTrace();
			modelAndView.addObject("msg", e.getCause().getMessage());
		}
		return modelAndView;
	}



}
