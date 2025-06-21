package WEEK1.Design_principles_patterns.Exercise11.DependencyInjectionExample;

public class CustomerService {
  private final CustomerRepository cr;
  public CustomerService(CustomerRepository cr)
  {
    this.cr=cr;
  }
  public void displayCustomer(int id)
  {
    String customer=cr.findCustomerById(id);
    System.out.println("customer detials"+customer);


  }

  
}
