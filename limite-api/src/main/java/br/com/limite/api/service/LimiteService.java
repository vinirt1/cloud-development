package br.com.limite.api.service;

import br.com.limite.api.model.dto.LimiteDTO;

public interface LimiteService {
    LimiteDTO verificar(final Long clienteId);
}
