package banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
	// declare customer for testing
	Customer customer;

	@BeforeEach
	void setUp() throws Exception {
		// initialize customer here
		this.customer = new Customer("Brandon");
	}

	@Test
	void testSetAddress() {
		// confirm the initial value of address is null
		assertNull(this.customer.getAddress());
		
		// sets address for customer
		this.customer.setAddress("University City, PA");
		
		// checks that address was set correctly
		assertEquals("University City, PA", this.customer.getAddress());
		
		// reset the address for customer
		this.customer.setAddress("Rohde Island, NY");
		
		// checks the address was reset correctly
		assertEquals("Rohde Island, NY", this.customer.getAddress());
	}

}
