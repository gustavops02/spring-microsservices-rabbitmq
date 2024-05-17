package com.gustavo.domain.ports.out;

import com.gustavo.domain.dto.request.PropostaRequestDto;
import com.gustavo.domain.dto.response.PropostaResponseDto;

import java.util.List;

public interface PropostaRepositoryPort {
    PropostaResponseDto save(PropostaRequestDto proposta);
    List<PropostaResponseDto> findAll();
}
