package br.com.seguro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.seguro.api.model.entity.Apolice;

public interface ApoliceRepository extends JpaRepository<Apolice, Long> {}
