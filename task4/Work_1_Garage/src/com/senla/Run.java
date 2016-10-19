package com.senla;
import java.util.Date;
import java.util.List;

import com.senla.facade.GarageFacade;
import com.senla.model.AvtoMaster;
import com.senla.model.Order;
import com.senla.model.WorkPlace;
import com.senla.service.AvtoMasterService;
import com.senla.service.OrderService;
import com.senla.service.WorkPlaceService;

public class Run {

	public static void main(String[] args) {
		GarageFacade facade = new GarageFacade();

		// Work places
		WorkPlace place1 = facade.createWorkPlaceWithMaster(new WorkPlace("Гараж 1"), new AvtoMaster("Петрович", "", ""));
		WorkPlace place2 = facade.createWorkPlaceWithMaster(new WorkPlace("Гараж 2"), new AvtoMaster("Петрович", "", ""));
		WorkPlace place3 = facade.createWorkPlaceWithMaster(new WorkPlace("Гараж 3"), new AvtoMaster("Владимирович", "", ""));
		WorkPlace place4 = facade.createWorkPlaceWithMaster(new WorkPlace("Гараж 4"), null);
		
		Order order = new Order();
		order.setStartDate(new Date());
		order.setEndDate(new Date());
		order.setName("Order 1");
		order.setPrice("30 USD");
		facade.create(order);
		
		order = new Order();
		order.setStartDate(new Date());
		order.setEndDate(new Date());
		order.setName("Order 2");
		order.setPrice("70 USD");
		facade.create(order);
		
		order = new Order();
		order.setStartDate(new Date());
		order.setEndDate(new Date());
		order.setName("Order 3");
		order.setPrice("100 USD");
		facade.create(order);		
		
		order = new Order();
		order.setStartDate(new Date());
		order.setEndDate(new Date());
		order.setName("Order 4");
		order.setPrice("56 USD");
		facade.create(order);		
		
		order = new Order();
		order.setStartDate(new Date());
		order.setEndDate(new Date());
		order.setName("Order 5");
		order.setPrice("43 USD");
		facade.create(order);
		
		showLinyByLine("Work places:", facade.getWorkPlaces());
		showLinyByLine("Masters:", facade.getAvtoMasters());
		showLinyByLine("Orders:", facade.getOrders());
	}
	
	private static void showLinyByLine(String title, List<? extends Object> objects) {
		System.out.println(title);
		for (Object object : objects) {
			System.out.println(object);
		}
	}
}
