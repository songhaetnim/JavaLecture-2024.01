package ch12_interface.sec04_dao;
import java.util.List;
public interface CustomerDao {
Customer getCustomer(int cid);
	
	List<Customer> getCustomerList();
	
	void insertCustomer(Customer customer);
	
	void updateCustomer(Customer customer);
	
	void deleteCustomer(int cid);
	
}