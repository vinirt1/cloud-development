package br.com.restricao.api.model.dto;

import java.time.LocalDateTime;

import br.com.restricao.api.model.entity.RestricaoCadastral;

public class RestricaoDTO {

    public RestricaoDTO(RestricaoCadastral restricaoCadastral) {
        this.codigoRestricao = restricaoCadastral.getCodigoRestricao();
        this.valor = restricaoCadastral.getValor();
        this.inicioVigencia = restricaoCadastral.getInicioVigencia();
        this.fimVigencia = restricaoCadastral.getFimVigencia();
    }

    private Integer codigoRestricao;
    private Double valor;
    private LocalDateTime inicioVigencia;
    private LocalDateTime fimVigencia;

    public Integer getCodigoRestricao() {
        return codigoRestricao;
    }

    public void setCodigoRestricao(Integer codigoRestricao) {
        this.codigoRestricao = codigoRestricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getInicioVigencia() {
        return inicioVigencia;
    }

    public void setInicioVigencia(LocalDateTime inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public LocalDateTime getFimVigencia() {
        return fimVigencia;
    }

    public void setFimVigencia(LocalDateTime fimVigencia) {
        this.fimVigencia = fimVigencia;
    }

}
