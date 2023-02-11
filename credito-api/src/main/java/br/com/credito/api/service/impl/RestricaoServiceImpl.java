package br.com.credito.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.credito.api.model.api.Restricao;
import br.com.credito.api.service.RestricaoService;

@Service
public class RestricaoServiceImpl implements RestricaoService {
    private RestTemplate restTemplate;

    @Value("${environment.uri}")
    private String uri;

    public RestricaoServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Restricao> verificar(final Long clienteId) {
        final String URL = uri + ":8083/api/restricoes";

        final ResponseEntity<List<Restricao>> response = restTemplate.exchange(
                URL, HttpMethod.GET, new HttpEntity<>(montarHeaders(clienteId)),
                new ParameterizedTypeReference<List<Restricao>>() {
                });

        return response.getBody();
    }

    private HttpHeaders montarHeaders(final Long clienteId) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("clienteId", "1");

        return headers;
    }
}
