package com.gustavo.adapters.persistence.repository.jpa;

import com.gustavo.adapters.persistence.model.PropostaEntity;
import com.gustavo.adapters.rabbit.RabbitService;
import com.gustavo.application.dto.request.PropostaRequestDto;
import com.gustavo.application.dto.response.PropostaResponseDto;
import com.gustavo.domain.ports.out.PropostaRepositoryPort;
import com.gustavo.infra.annotations.Adapter;
import com.gustavo.adapters.mapper.PropostaMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Adapter
public class PropostaJpaRepositoryAdapter implements PropostaRepositoryPort {

    private final PropostaJpaRepository jpaRepository;
    private final RabbitService rabbitService;

    @Override
    public PropostaResponseDto save(PropostaRequestDto proposta) {
        PropostaEntity entity = PropostaMapper.toPropostaEntity(proposta);
        PropostaEntity save = jpaRepository.save(entity);
        PropostaResponseDto response = PropostaMapper.toResponseDto(save);
        rabbitService.notificar(response, "proposta-pendente.ex");
        return response;
    }

    @Override
    public List<PropostaResponseDto> findAll() {

        List<PropostaResponseDto> response = jpaRepository
                .findAll()
                .stream()
                .map(PropostaMapper::toResponseDto)
                .toList();

        return response;
    }
}
