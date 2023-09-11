package IColecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
	private Long id;
	private String nome;
	private Double valor;
	private int quantidade;
	
	public Manga(Long id, String nome, Double valor) {
		Objects.requireNonNull(id,"Id não pode ser nulo");
		Objects.requireNonNull(nome,"Nome não pode ser nulo");
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	
	public Manga(Long id, String nome, Double valor, int quantidade) {
		this(id, nome, valor);
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manga other = (Manga) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

	public int getQuantidade() {
		return quantidade;
	}



	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}



	@Override
	public String toString() {
		return "Manga [id=" + id + ", nome=" + nome + ", valor=" + valor + ", quantidade=" + quantidade + "]";
	}



	@Override
	public int compareTo(Manga outroManga) {
		// negativo se o this < outromanga
		// se this == outromanga, return 0
		// positivo se this > outromanga
	/*if(this.id < outroManga.getId()) {
			return -1;
		}
		else if(this.id.equals(outroManga.getId())) {
			return 0;
		}else {
			return 1;
		}*/
		//return this.nome.compareTo(outroManga.getNome()); // organizando pelo nome
		//return Double.compare(valor, outroManga.getValor()); // organizando pelo valor
		return this.id.compareTo(outroManga.getId()); // organizando pelo id
	}

}
