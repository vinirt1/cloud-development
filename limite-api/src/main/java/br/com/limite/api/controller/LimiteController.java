package br.com.limite.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.limite.api.model.dto.LimiteDTO;
import br.com.limite.api.service.LimiteService;

@RestController
@RequestMapping("/api/limites")
public class LimiteController {

    private LimiteService limiteService;

    public LimiteController(LimiteService limiteService) {
        this.limiteService = limiteService;
    }

    @GetMapping()
    public ResponseEntity<LimiteDTO> contratar(@RequestHeader("clienteId") Long clienteId) {
        final LimiteDTO limite = this.limiteService.verificar(clienteId);

        return new ResponseEntity<LimiteDTO>(limite, HttpStatus.OK);
    }
}
