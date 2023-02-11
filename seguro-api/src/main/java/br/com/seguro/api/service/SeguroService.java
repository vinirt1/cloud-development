package br.com.seguro.api.service;

import br.com.seguro.api.model.dto.ContrataSeguroDTO;
import br.com.seguro.api.model.dto.SeguroDTO;

public interface SeguroService {
    SeguroDTO contratar(final Long clienteId, final ContrataSeguroDTO contrataSeguroDTO);
}
