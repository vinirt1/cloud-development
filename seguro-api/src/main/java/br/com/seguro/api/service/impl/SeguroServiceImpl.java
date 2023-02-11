package br.com.seguro.api.service.impl;

import org.springframework.stereotype.Service;

import br.com.seguro.api.model.dto.ContrataSeguroDTO;
import br.com.seguro.api.model.dto.SeguroDTO;
import br.com.seguro.api.model.entity.Apolice;
import br.com.seguro.api.repository.ApoliceRepository;
import br.com.seguro.api.service.SeguroService;

@Service
public class SeguroServiceImpl implements SeguroService {
    private ApoliceRepository apoliceRepository;

    public SeguroServiceImpl(ApoliceRepository apoliceRepository) {
        this.apoliceRepository = apoliceRepository;
    }

    @Override
    public SeguroDTO contratar(final Long clienteId, final ContrataSeguroDTO contrataSeguroDTO) {
        final Apolice novaApolice = this.apoliceRepository.save(new Apolice(clienteId, contrataSeguroDTO));

        return new SeguroDTO(novaApolice);
    }    
}
