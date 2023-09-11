package Tjunit.dominio;

import java.util.Objects;

public record Manga(String name, int episodes) {
	//não pode criar atributos de instancia nem blocos de inicialização(somente static)
	// é possivel usar generics
	public Manga{
		Objects.requireNonNull(name);
	}
}
