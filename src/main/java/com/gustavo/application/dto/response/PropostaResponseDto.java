package com.gustavo.application.dto.response;

public class PropostaResponseDto {

    private Long id;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String cpf;
    private Double renda;
    private Double valorSolicitado;
    private int prazoPagamento;
    private Boolean aprovado;
    private String observacao;
    private String valorSolicitadoFmt;

    public PropostaResponseDto() {
    }

    public PropostaResponseDto(Long id, String nome, String sobrenome, String telefone, String cpf, Double renda, Double valorSolicitado, int prazoPagamento, Boolean aprovado, String observacao, String fmt) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.renda = renda;
        this.valorSolicitado = valorSolicitado;
        this.prazoPagamento = prazoPagamento;
        this.aprovado = aprovado;
        this.observacao = observacao;
        this.valorSolicitadoFmt = fmt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    public Double getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(Double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    public int getPrazoPagamento() {
        return prazoPagamento;
    }

    public void setPrazoPagamento(int prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getValorSolicitadoFmt() {
        return valorSolicitadoFmt;
    }

    public void setValorSolicitadoFmt(String valorSolicitadoFmt) {
        this.valorSolicitadoFmt = valorSolicitadoFmt;
    }
}
