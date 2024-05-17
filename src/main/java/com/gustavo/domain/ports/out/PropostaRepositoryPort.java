package com.gustavo.domain.ports.out;

import com.gustavo.application.dto.request.PropostaRequestDto;
import com.gustavo.application.dto.response.PropostaResponseDto;

import java.util.List;

public interface PropostaRepositoryPort {
    PropostaResponseDto save(PropostaRequestDto proposta);
    List<PropostaResponseDto> findAll();
}
