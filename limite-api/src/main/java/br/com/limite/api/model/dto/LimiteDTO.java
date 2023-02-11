package br.com.limite.api.model.dto;

import br.com.limite.api.model.entity.LimiteCredito;

public class LimiteDTO {

    public LimiteDTO(LimiteCredito limiteCredito) {
        this.valorLimite = limiteCredito.getValor();
    }

    private Double valorLimite;

    public Double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(Double valorLimite) {
        this.valorLimite = valorLimite;
    }

}
