package br.com.credito.api.service;

import br.com.credito.api.model.api.Limite;

public interface LimiteService {
    Limite verificar(final Long clienteId);
}
