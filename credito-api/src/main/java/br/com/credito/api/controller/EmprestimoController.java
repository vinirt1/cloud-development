package br.com.credito.api.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.credito.api.model.dto.ContrataEmprestimoDTO;
import br.com.credito.api.model.dto.EmprestimoDTO;
import br.com.credito.api.service.EmprestimoService;

@RestController
@RequestMapping("/api/emprestimos")
public class EmprestimoController {
    private static Logger LOGGER = LoggerFactory.getLogger(EmprestimoController.class);

    private EmprestimoService emprestimoService;

    public EmprestimoController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping()
    public ResponseEntity<EmprestimoDTO> contratar(@RequestHeader("clienteId") Long clienteId,
            @Valid @RequestBody final ContrataEmprestimoDTO contrataEmprestimoDTO) {
        LOGGER.info("Gravando novo empréstimo no valor de R$ " + contrataEmprestimoDTO.getValorEmprestimo() + " em "
                + contrataEmprestimoDTO.getQuantidadeParcelas() + " vezes para o cliente " + clienteId);

        final EmprestimoDTO novoSeguro = this.emprestimoService.contratar(clienteId, contrataEmprestimoDTO);

        return new ResponseEntity<EmprestimoDTO>(novoSeguro, HttpStatus.CREATED);
    }
}
