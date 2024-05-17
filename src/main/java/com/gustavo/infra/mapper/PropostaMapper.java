package com.gustavo.infra.mapper;

import com.gustavo.domain.model.Proposta;
import com.gustavo.domain.model.Usuario;
import com.gustavo.domain.dto.request.PropostaRequestDto;
import com.gustavo.domain.dto.response.PropostaResponseDto;

public class PropostaMapper {

    public static Proposta toModel(PropostaRequestDto request) {
        Usuario usuario = new Usuario();
        usuario.setNome(request.getNome());
        usuario.setCpf(request.getCpf());
        usuario.setRenda(request.getRenda());
        usuario.setSobrenome(request.getSobrenome());
        usuario.setTelefone(request.getTelefone());

        Proposta proposta = new Proposta();
        proposta.setUsuario(usuario);
        proposta.setPrazoPagamento(request.getPrazoPagamento());
        proposta.setValorSolicitado(request.getValorSolicitado());

        return proposta;
    }

    public static PropostaResponseDto toResponse(Proposta proposta) {

        PropostaResponseDto responseDto = new PropostaResponseDto();
        responseDto.setId(proposta.getId());
        responseDto.setNome(proposta.getUsuario().getNome());
        responseDto.setSobrenome(proposta.getUsuario().getSobrenome());
        responseDto.setCpf(proposta.getUsuario().getCpf());
        responseDto.setRenda(proposta.getUsuario().getRenda());
        responseDto.setTelefone(proposta.getUsuario().getTelefone());
        responseDto.setPrazoPagamento(proposta.getPrazoPagamento());
        responseDto.setValorSolicitado(proposta.getValorSolicitado());
        responseDto.setAprovado(proposta.getAprovada());
        responseDto.setObservacao(proposta.getObservacao());

        return responseDto;
    }
}
