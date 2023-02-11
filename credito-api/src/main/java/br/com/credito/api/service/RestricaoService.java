package br.com.credito.api.service;

import java.util.List;

import br.com.credito.api.model.api.Restricao;

public interface RestricaoService {
    List<Restricao> verificar(final Long clienteId);
}
