package br.com.credito.api.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import br.com.credito.api.model.api.Limite;
import br.com.credito.api.model.api.Restricao;
import br.com.credito.api.model.dto.ContrataEmprestimoDTO;
import br.com.credito.api.model.dto.EmprestimoDTO;
import br.com.credito.api.model.entity.Emprestimo;
import br.com.credito.api.repository.EmprestimoRepository;
import br.com.credito.api.service.EmprestimoService;
import br.com.credito.api.service.LimiteService;
import br.com.credito.api.service.RestricaoService;

@Service
public class EmprestimoServiceImpl implements EmprestimoService {
    private static Logger LOGGER = LoggerFactory.getLogger(EmprestimoServiceImpl.class);

    private EmprestimoRepository apoliceRepository;

    private LimiteService limiteService;
    private RestricaoService restricaoService;

    public EmprestimoServiceImpl(EmprestimoRepository apoliceRepository, LimiteService limiteService, RestricaoService restricaoService) {
        this.apoliceRepository = apoliceRepository;
        this.limiteService = limiteService;
        this.restricaoService = restricaoService;
    }

    @Override
    public EmprestimoDTO contratar(final Long clienteId, final ContrataEmprestimoDTO contrataEmprestimoDTO) { 
        final Limite limiteCliente = limiteService.verificar(clienteId);
        LOGGER.info("Limite de crédito para o cliente " + clienteId + ": R$ " + limiteCliente.getValorLimite());

        List<Restricao> restricoesCliente = restricaoService.verificar(clienteId);
        LOGGER.info("Restrições cadastrais encontradas para o cliente " + clienteId + ": " + restricoesCliente.size());

        final Emprestimo novoEmprestimo = this.apoliceRepository.save(new Emprestimo(clienteId, contrataEmprestimoDTO));

        return new EmprestimoDTO(novoEmprestimo);
    }    
}
