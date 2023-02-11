package br.com.restricao.api.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.restricao.api.model.dto.RestricaoDTO;
import br.com.restricao.api.model.entity.RestricaoCadastral;
import br.com.restricao.api.repository.RestricaoCadastralRepository;
import br.com.restricao.api.service.RestricaoService;

@Service
public class RestricaoServiceImpl implements RestricaoService {
    private RestricaoCadastralRepository restricaoCadastralRepository;

    public RestricaoServiceImpl(RestricaoCadastralRepository restricaoCadastralRepository) {
        this.restricaoCadastralRepository = restricaoCadastralRepository;
    }

    @Override
    public List<RestricaoDTO> verificar(final Long clienteId) {
        final List<RestricaoCadastral> restricoesCadastrais = this.restricaoCadastralRepository.findAll();

        return restricoesCadastrais.stream().map(RestricaoDTO::new).collect(Collectors.toList());
    }    
}
