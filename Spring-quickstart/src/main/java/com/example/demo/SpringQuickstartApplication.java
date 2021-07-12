package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.Customer;
import com.example.demo.model.CustomerService;
import com.example.demo.model.Invoice;
import com.example.demo.model.Product;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "org.module.first"})
public class SpringQuickstartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringQuickstartApplication.class, args);

	//	Product product1 = ctx.getBean("tv", Product.class);

		// in the above line "tv" is the Bean id

	//	System.out.println(product1);

	//	Product product2 = ctx.getBean("fridge", Product.class);

	//	System.out.println(product2);

	//	Invoice inv = ctx.getBean(Invoice.class);
		
	//	System.out.println(inv);
		
		CustomerService service = ctx.getBean(CustomerService.class);
		
		service.getCustList().forEach(System.out::println);
		
		ctx.close();
		
	//create CustomerService
		
	//	create three customer cust1 = new customer();
	//	create a Array List of type customer List<Customer> = new ArrayList<>();
	// add elements to array List list.add(cust)	
	}

	@Bean
	@Primary
	public Product tv() {

		return new Product(101, "tv", 34000);
	}

	@Bean
	public Product fridge() {

		return new Product(102, "fridge", 24000);
	}
	
	@Bean
	public Customer ram() {

		return new Customer(103, "ram", 98453);
	}
	
	@Bean
	@Primary
	public Customer suresh() {

		return new Customer(104, "suresh", 9654);
	}
	
	@Bean
	public Customer magesh() {

		return new Customer(105, "magesh", 45678);
	}
}
