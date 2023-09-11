package JGenerics;

public class ClasseGenericaTeste01 {

	public static void main(String[] args) {
		CarroRentavelService carroRentavelService = new CarroRentavelService();
		Carro carro = carroRentavelService.buscarCarroDisponivel();
		System.out.println("usando carro por um mês...");
		carroRentavelService.retornarCarroAlugado(carro);

	}

}
