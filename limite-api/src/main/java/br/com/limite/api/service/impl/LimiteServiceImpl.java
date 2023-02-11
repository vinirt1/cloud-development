package br.com.limite.api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.limite.api.model.dto.LimiteDTO;
import br.com.limite.api.model.entity.LimiteCredito;
import br.com.limite.api.repository.LimiteCreditoRepository;
import br.com.limite.api.service.LimiteService;

@Service
public class LimiteServiceImpl implements LimiteService {
    private LimiteCreditoRepository limiteCreditoRepository;

    public LimiteServiceImpl(LimiteCreditoRepository limiteCreditoRepository) {
        this.limiteCreditoRepository = limiteCreditoRepository;
    }

    @Override
    public LimiteDTO verificar(final Long clienteId) {
        final List<LimiteCredito> limitesCredito = this.limiteCreditoRepository.findAll();

        return new LimiteDTO(limitesCredito.get(0));
    }    
}
