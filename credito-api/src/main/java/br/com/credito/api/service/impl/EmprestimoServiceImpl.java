package br.com.credito.api.service.impl;

import org.springframework.stereotype.Service;

import br.com.credito.api.model.dto.ContrataEmprestimoDTO;
import br.com.credito.api.model.dto.EmprestimoDTO;
import br.com.credito.api.model.entity.Emprestimo;
import br.com.credito.api.repository.EmprestimoRepository;
import br.com.credito.api.service.EmprestimoService;

@Service
public class EmprestimoServiceImpl implements EmprestimoService {
    private EmprestimoRepository apoliceRepository;

    public EmprestimoServiceImpl(EmprestimoRepository apoliceRepository) {
        this.apoliceRepository = apoliceRepository;
    }

    @Override
    public EmprestimoDTO contratar(final Long clienteId, final ContrataEmprestimoDTO contrataEmprestimoDTO) {
        final Emprestimo novaApolice = this.apoliceRepository.save(new Emprestimo(clienteId, contrataEmprestimoDTO));

        return new EmprestimoDTO(novaApolice);
    }    
}
