package com.senla.facade;

import java.util.List;

import com.senla.model.AvtoMaster;
import com.senla.model.Order;
import com.senla.model.WorkPlace;
import com.senla.service.AvtoMasterService;
import com.senla.service.OrderService;
import com.senla.service.WorkPlaceService;

public class GarageFacade {

	private OrderService orderService = new OrderService();
	private AvtoMasterService avtoMasterService = new AvtoMasterService();
	private WorkPlaceService workPlaceService = new WorkPlaceService();	
	
	public WorkPlace createWorkPlaceWithMaster(WorkPlace workPlace, AvtoMaster master) {
		workPlace = workPlaceService.create(workPlace);
		if (master != null) {
			master.setWorkPlace(workPlace);
			master = avtoMasterService.create(master);
			//TODO problem
			/*workPlace.setAvtoMaster(master);
			workPlaceService.save(workPlace);*/
		}
		return workPlace;
	}
	
	public Order create(Order order) {
		return orderService.create(order);
	}

	public List<Order> getOrders() {
		return orderService.findAll();
	}

	public List<WorkPlace> getWorkPlaces() {
		return workPlaceService.findAll();
	};

	public List<AvtoMaster> getAvtoMasters() {
		return avtoMasterService.findAll();
	};
	
}
