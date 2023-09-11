package IColecoes.dominio;

public class Smartphone {
	private String nome;
	private String marca;
	public Smartphone(String nome, String marca) {
		this.nome = nome;
		this.marca = marca;
	}
	
	//Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
	//Simetrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
	//Transitividade: para x, y e z diferentes de null, se x.quals(y) == true, e x.equals(z) == true, logo y.equals(z) == true
	//Consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null x.equals(null) tem que retornar false;
    // Para hashcode
    // Se x.equals(y) == true y.hashCode() == x.hashCode();
    // y.hashCode() == x.hashCode() não necessariamente o equals deverá retornar true
    // x.equals(y) == false
    // y.hashCode() != x.hashCode() x.equals(y) deverá ser false
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) return false;
		Smartphone smartphone = (Smartphone) obj;
		return nome != null && nome.equals(smartphone.nome);
	}
	
	public int hashCode() {
		return nome == null ? 0 : this.nome.hashCode();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Smartphone [nome=" + nome + ", marca=" + marca + "]";
	}
	
	
}
