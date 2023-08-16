package Colecoes.dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Consumidor {
	private long id;
	private String nome;
	
	public Consumidor(String nome) {
		this.id = ThreadLocalRandom.current().nextLong(0,100000);
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Consumidor [id=" + id + ", nome=" + nome + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		return id == other.id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
