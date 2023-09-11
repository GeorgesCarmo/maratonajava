package JGenerics;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste3 {

	public static void main(String[] args) {
		 List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
		 List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));
		 
		 RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
		 Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
		 System.out.println("usando o carro por um mês...");
		 rentalServiceCarro.retornarObjetoAlugado(carro);
		 System.out.println("---------------------");
		 RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
		 Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
		 System.out.println("usando o carro por um mês...");
		 rentalServiceBarco.retornarObjetoAlugado(barco);

	}

}
