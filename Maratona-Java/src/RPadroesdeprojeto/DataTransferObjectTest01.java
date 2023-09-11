package RPadroesdeprojeto;

public class DataTransferObjectTest01 {

	public static void main(String[] args) {
		Aircraft aircraft = new Aircraft("Boeing-777");
		Country country = Country.BRAZIL;
		Currency currency = CurrencyFactory.newCurrency(country);
		Person person = new Person.PersonBuilder()
				.builder()
				.firstName("Georges")
				.lastName("Pereira")
				.build();
		
		ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
				.aircraftName(aircraft.getName())
				.country(country)
				.currency(currency)
				.personName(person.getFirstName())
				.build();
		
		System.out.println();
	}

}
