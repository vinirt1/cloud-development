package br.com.credito.api.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.credito.api.model.api.Limite;
import br.com.credito.api.service.LimiteService;

@Service
public class LimiteServiceImpl implements LimiteService {
    private RestTemplate restTemplate;

    @Value("${environment.uri.api.limite}")
    private String uri;

    public LimiteServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Limite verificar(final Long clienteId) {
        final String URL = uri + "/api/limites";

        final ResponseEntity<Limite> response = restTemplate.exchange(
                URL, HttpMethod.GET, new HttpEntity<>(montarHeaders(clienteId)), Limite.class);

        return response.getBody();
    }

    private HttpHeaders montarHeaders(final Long clienteId) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("clienteId", "1");

        return headers;
    }
}
