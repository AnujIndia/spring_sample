import com.pularsight.service.CustomerService;
import com.pularsight.service.CustomerServiceImpl;


public class Applcation {

	public static void main(String[] args) {
		CustomerService service = new CustomerServiceImpl();
		System.out.print(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getLastName());
		
		

	}

}
