package JGenerics;

public class ClasseGenericaTeste2 {

	public static void main(String[] args) {
		BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
		Barco barco = barcoRentavelService.buscarBarcoDisponivel();
		System.out.println("usando barco por um mês...");
		barcoRentavelService.retornarBarcoAlugado(barco);

	}

}
