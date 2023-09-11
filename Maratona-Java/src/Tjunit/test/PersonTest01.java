package Tjunit.test;

import Tjunit.dominio.Person;
import Tjunit.service.PersonService;

public class PersonTest01 {

	public static void main(String[] args) {
		Person person = new Person(15);
//		PersonService.isAdult(person);
		PersonService personService = new PersonService();
		System.out.printf("Is adult? '%s'",personService.isAdult(person));

	}

}
