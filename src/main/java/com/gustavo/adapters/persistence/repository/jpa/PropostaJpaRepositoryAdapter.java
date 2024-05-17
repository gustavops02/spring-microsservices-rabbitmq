package com.gustavo.adapters.persistence.repository.jpa;

import com.gustavo.adapters.persistence.model.PropostaEntity;
import com.gustavo.domain.dto.request.PropostaRequestDto;
import com.gustavo.domain.dto.response.PropostaResponseDto;
import com.gustavo.application.ports.out.PropostaRepositoryPort;
import com.gustavo.infra.annotations.Adapter;
import com.gustavo.adapters.mapper.PropostaMapper;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Adapter
public class PropostaJpaRepositoryAdapter implements PropostaRepositoryPort {

    private final PropostaJpaRepository jpaRepository;

    @Override
    public PropostaResponseDto save(PropostaRequestDto proposta) {
        PropostaEntity entity = PropostaMapper.toPropostaEntity(proposta);
        PropostaEntity save = jpaRepository.save(entity);

        return PropostaMapper.toResponseDto(save);
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
