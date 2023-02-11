package br.com.restricao.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.restricao.api.model.dto.RestricaoDTO;
import br.com.restricao.api.service.RestricaoService;

@RestController
@RequestMapping("/api/restricoes")
public class RestricaoController {

    private RestricaoService restricaoService;

    public RestricaoController(RestricaoService restricaoService) {
        this.restricaoService = restricaoService;
    }

    @GetMapping()
    public ResponseEntity<List<RestricaoDTO>> verificar(@RequestHeader("clienteId") Long clienteId) {
        final List<RestricaoDTO> restricoes = this.restricaoService.verificar(clienteId);

        return new ResponseEntity<List<RestricaoDTO>>(restricoes, HttpStatus.OK);
    }
}
