package br.com.seguro.api.model.dto;

import java.time.LocalDateTime;

import br.com.seguro.api.model.entity.Apolice;

public class SeguroDTO {

    public SeguroDTO(Apolice apolice) {
        this.id = apolice.getId();
        this.clienteId = apolice.getClienteId();
        this.veiculo = apolice.getVeiculo();
        this.inicioVigencia = apolice.getInicioVigencia();
        this.fimVigencia = apolice.getFimVigencia();
    }

    private Long id;
    private Long clienteId;
    private String veiculo;
    private LocalDateTime inicioVigencia;
    private LocalDateTime fimVigencia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getClienteId() {
        return clienteId;
    }

    public void setClienteId(Long clienteId) {
        this.clienteId = clienteId;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
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
