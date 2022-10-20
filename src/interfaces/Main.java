package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();
	}

}


//interfaces'ler new'lenmez 
//bir class birden fazla implements edilebilir
//bir class sadece bir tane class'ı extends edebilir