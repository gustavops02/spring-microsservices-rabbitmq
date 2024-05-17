package com.gustavo.domain.ports.in;

import com.gustavo.application.dto.request.PropostaRequestDto;
import com.gustavo.application.dto.response.PropostaResponseDto;

import java.util.List;

public interface PropostaServicePort {

    PropostaResponseDto save(PropostaRequestDto proposta);
    List<PropostaResponseDto> findAll();
}
