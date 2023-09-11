package RPadroesdeprojeto;

public class AircraftSingletonLazyTest01 {

	public static void main(String[] args) {
		bookSeat("1A");
		bookSeat("1A");
	}
	private static void bookSeat(String seat) {
		AircraftSingletonLazy aircraft = AircraftSingletonLazy.getInstance();
		System.out.println(aircraft.bookSeat(seat));
	}
}
