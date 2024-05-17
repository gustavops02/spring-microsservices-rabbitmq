package com.gustavo.adapters.mapper;

import com.gustavo.adapters.persistence.model.PropostaEntity;
import com.gustavo.adapters.persistence.model.UsuarioEntity;
import com.gustavo.application.dto.request.PropostaRequestDto;
import com.gustavo.application.dto.response.PropostaResponseDto;


public class PropostaMapper {

    public static PropostaEntity toPropostaEntity(PropostaRequestDto proposta) {

        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setCpf(proposta.getCpf());
        usuarioEntity.setNome(proposta.getNome());
        usuarioEntity.setSobrenome(proposta.getSobrenome());
        usuarioEntity.setRenda(proposta.getRenda());
        usuarioEntity.setTelefone(proposta.getTelefone());

        PropostaEntity propostaEntity = new PropostaEntity();
        propostaEntity.setPrazoPagamento(proposta.getPrazoPagamento());
        propostaEntity.setValorSolicitado(proposta.getValorSolicitado());
        propostaEntity.setUsuario(usuarioEntity);
        propostaEntity.setIntegrada(true);

        return propostaEntity;
    }

    public static PropostaResponseDto toResponseDto(PropostaEntity proposta) {
        PropostaResponseDto dto = new PropostaResponseDto();
        dto.setId(proposta.getId());
        dto.setNome(proposta.getUsuario().getNome());
        dto.setSobrenome(proposta.getUsuario().getSobrenome());
        dto.setTelefone(proposta.getUsuario().getTelefone());
        dto.setCpf(proposta.getUsuario().getCpf());
        dto.setRenda(proposta.getUsuario().getRenda());
        dto.setValorSolicitado(proposta.getValorSolicitado());
        dto.setPrazoPagamento(proposta.getPrazoPagamento());
        dto.setAprovado(proposta.getAprovada());
        dto.setObservacao(proposta.getObservacao());
        return dto;
    }


}
