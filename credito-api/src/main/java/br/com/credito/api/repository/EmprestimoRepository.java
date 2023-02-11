package br.com.credito.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.credito.api.model.entity.Emprestimo;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {}
