package com.gustavo.domain.services;

import com.gustavo.infra.mapper.PropostaMapper;
import com.gustavo.domain.model.Proposta;
import com.gustavo.domain.ports.in.PropostaServicePort;
import com.gustavo.domain.ports.out.PropostaRepositoryPort;
import com.gustavo.domain.dto.request.PropostaRequestDto;
import com.gustavo.domain.dto.response.PropostaResponseDto;

import java.util.List;

public class PropostaService implements PropostaServicePort {

    private final PropostaRepositoryPort repositoryPort;

    public PropostaService(PropostaRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    @Override
    public PropostaResponseDto insert(PropostaRequestDto request) {
        Proposta proposta = PropostaMapper.toModel(request);
        repositoryPort.save(proposta);
        return PropostaMapper.toResponse(proposta);
    }

    @Override
    public List<PropostaResponseDto> findAll() {
        List<PropostaResponseDto> response = repositoryPort
                .findAll()
                .stream()
                .map(PropostaMapper::toResponse)
                .toList();

        return response;
    }
}
