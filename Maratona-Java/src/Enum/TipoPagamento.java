package Enum;

public enum TipoPagamento {
	DEBITO{
		public double calcularDesconto(double valor) {
			return valor * 0.1;
		}
	}, CREDITO{
		public double calcularDesconto(double valor) {
			return valor * 0.05;
		}
	};
	
	public abstract double calcularDesconto(double valor);
}