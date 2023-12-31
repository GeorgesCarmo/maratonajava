package Tjunit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Tjunit.dominio.Developer;
import Tjunit.dominio.Employee;

class DelevoperTest {

	@Test
	public void instanceOf_ExecutesChildClassMethod_WhenObjectsIsOfChildType() {
		Employee employeeDeveloper = new Developer("1","Java");
		if(employeeDeveloper instanceof Developer) {
			Developer developer = (Developer) employeeDeveloper;
			Assertions.assertEquals("Java", developer.getMainLanguage());
		}
		if(employeeDeveloper instanceof Developer developer) {
			Assertions.assertEquals("Java", developer.getMainLanguage());
		}
	}
	


	

}
