package br.com.restricao.api.service;

import java.util.List;

import br.com.restricao.api.model.dto.RestricaoDTO;

public interface RestricaoService {
    List<RestricaoDTO> verificar(final Long clienteId);
}
