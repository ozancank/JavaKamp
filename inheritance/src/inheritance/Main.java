package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";

		CustomerManager manager = new CustomerManager();
//		manager.add(engin);
//		manager.add(hepsiBurada);
//		manager.add(abc);

		Customer[] customers = { engin, hepsiBurada, abc };

		manager.addMultiple(customers);
	}

}
