package com.gustavo.application.services;

import com.gustavo.domain.ports.in.PropostaServicePort;
import com.gustavo.application.dto.request.PropostaRequestDto;
import com.gustavo.application.dto.response.PropostaResponseDto;
import com.gustavo.domain.ports.out.PropostaRepositoryPort;
import com.gustavo.domain.ports.out.RabbitNotificationService;

import java.util.List;

public class PropostaService implements PropostaServicePort {

    private final PropostaRepositoryPort repositoryPort;
    private final RabbitNotificationService rabbitNotificationService;

    public PropostaService(PropostaRepositoryPort repositoryPort, RabbitNotificationService rabbitNotificationService) {
        this.repositoryPort = repositoryPort;
        this.rabbitNotificationService = rabbitNotificationService;
    }

    @Override
    public PropostaResponseDto save(PropostaRequestDto proposta) {

        PropostaResponseDto responseDto = repositoryPort.save(proposta);
        rabbitNotificationService.notificar(responseDto, "proposta-pendente.ex");
        return responseDto;
    }

    @Override
    public List<PropostaResponseDto> findAll() {
        return repositoryPort.findAll();
    }
}
