package Aenum;

public class EnumTest {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Geoges",TipoCliente.PESSOA_FISICA,TipoPagamento.CREDITO);
		Cliente cliente2 = new Cliente("Luana",TipoCliente.PESSOA_JURIDICA,TipoPagamento.DEBITO);
		
		System.out.println(cliente1);
		System.out.println(cliente2);
		
		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
		System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
		
		TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
		System.out.println(tipoCliente.getNomeRelatorio());
		TipoCliente tipoCliente2 = tipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
		System.out.println(tipoCliente2);
	}

}
