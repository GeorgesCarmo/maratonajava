package RPadroesdeprojeto;

public class AircraftSingletonEagerTest1 {

	public static void main(String[] args) {
		bookSeat("1A");
		bookSeat("1A");
	}
	private static void bookSeat(String seat) {
		AircraftSingletonEager aircraft = AircraftSingletonEager.getInstance();
		System.out.println(aircraft.bookSeat(seat));
	}
}
