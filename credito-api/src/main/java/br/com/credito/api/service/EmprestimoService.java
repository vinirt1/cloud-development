package br.com.credito.api.service;

import br.com.credito.api.model.dto.ContrataEmprestimoDTO;
import br.com.credito.api.model.dto.EmprestimoDTO;

public interface EmprestimoService {
    EmprestimoDTO contratar(final Long clienteId, final ContrataEmprestimoDTO contrataEmprestimoDTO);
}
