package RPadroesdeprojeto;

public class AircraftTest01 {

	public static void main(String[] args) {
		bookSeat("1A");
		bookSeat("1A");
		bookSeat("1a");
	}
	private static void bookSeat(String seat) {
		Aircraft aircraft = new Aircraft("Boing-787");
		System.out.println(aircraft.bookSeat(seat));
	}
}
