package br.com.projeto.repository;

import java.util.Optional;

import br.com.projeto.domain.Preco;

public interface PrecoRepository {
	public Optional<Preco> findByprecoatual(Double precoatual);
	


}
