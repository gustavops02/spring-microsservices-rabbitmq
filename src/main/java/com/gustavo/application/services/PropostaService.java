package com.gustavo.application.services;

import com.gustavo.domain.ports.in.PropostaServicePort;
import com.gustavo.application.dto.request.PropostaRequestDto;
import com.gustavo.application.dto.response.PropostaResponseDto;
import com.gustavo.domain.ports.out.PropostaRepositoryPort;

import java.util.List;

public class PropostaService implements PropostaServicePort {

    private final PropostaRepositoryPort repositoryPort;

    public PropostaService(PropostaRepositoryPort repositoryPort) {
        this.repositoryPort = repositoryPort;
    }

    @Override
    public PropostaResponseDto save(PropostaRequestDto proposta) {
        return repositoryPort.save(proposta);
    }

    @Override
    public List<PropostaResponseDto> findAll() {
        return repositoryPort.findAll();
    }
}
