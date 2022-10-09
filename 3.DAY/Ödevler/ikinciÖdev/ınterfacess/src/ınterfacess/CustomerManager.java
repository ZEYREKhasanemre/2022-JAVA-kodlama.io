package ınterfacess;

public class CustomerManager {
	
	ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal ıcustomerDal) {
		this.customerDal = ıcustomerDal;
	}
	
	
	public void add() {
		customerDal.add();
	}

}
