package WEEK1.Design_principles_patterns.Exercise11.DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository{
  public String findCustomerById(int id)
  {
      return "Customer{id=" + id + ", name='John Doe'}";

  }
  
}
