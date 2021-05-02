package CoffeeShopAutomation.Concrete;

import CoffeeShopAutomation.Abstract.BaseCustomerManager;
import CoffeeShopAutomation.Abstract.CustomerCheckService;
import CoffeeShopAutomation.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(!customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Not a valid person!");
			return;
		}
		super.save(customer);
	}
}
