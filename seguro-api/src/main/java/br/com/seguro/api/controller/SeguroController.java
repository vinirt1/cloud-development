package br.com.seguro.api.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.seguro.api.model.dto.ContrataSeguroDTO;
import br.com.seguro.api.model.dto.SeguroDTO;
import br.com.seguro.api.service.SeguroService;

@RestController
@RequestMapping("/api/seguros")
public class SeguroController {

    private SeguroService seguroService;

    public SeguroController(SeguroService seguroService) {
        this.seguroService = seguroService;
    }

    @PostMapping()
    public ResponseEntity<SeguroDTO> contratar(@RequestHeader("clienteId") Long clienteId,
            @Valid @RequestBody final ContrataSeguroDTO contrataSeguroDTO) {
        final SeguroDTO novoSeguro = this.seguroService.contratar(clienteId, contrataSeguroDTO);

        return new ResponseEntity<SeguroDTO>(novoSeguro, HttpStatus.CREATED);
    }
}
