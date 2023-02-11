package br.com.credito.api.model.dto;

import br.com.credito.api.model.entity.Emprestimo;

public class EmprestimoDTO {
    public EmprestimoDTO(Emprestimo emprestimo) {
        this.id = emprestimo.getId();
        this.clienteId = emprestimo.getClienteId();
        this.valorEmprestimo = emprestimo.getValorEmprestimo();
        this.quantidadeParcelas = emprestimo.getQuantidadeParcelas();
    }

    private Long id;
    private Long clienteId;
    private Double valorEmprestimo;
    private Integer quantidadeParcelas;

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

    public Double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(Double valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public Integer getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(Integer quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

}
