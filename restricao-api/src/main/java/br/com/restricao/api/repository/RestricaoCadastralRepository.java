package br.com.restricao.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.restricao.api.model.entity.RestricaoCadastral;

public interface RestricaoCadastralRepository extends JpaRepository<RestricaoCadastral, Long> {}
