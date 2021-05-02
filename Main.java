package CoffeeShopAutomation;

import java.time.LocalDate;


import CoffeeShopAutomation.Entities.Customer;
import CoffeeShopAutomation.Adapters.MernisServiceAdapter;
import CoffeeShopAutomation.Concrete.*;

public class Main {

	public static void main(String[] args) {
		Customer burak = new Customer(1,"Burak","Kosova",LocalDate.of(1999, 1, 26),"11122233344");

		StarbucksCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		starbucksCustomerManager.save(burak);
		
		NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(burak);
	}
}
