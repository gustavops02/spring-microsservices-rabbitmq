package com.gustavo.domain.ports.in;

import com.gustavo.domain.dto.request.PropostaRequestDto;
import com.gustavo.domain.dto.response.PropostaResponseDto;

import java.util.List;

public interface PropostaServicePort {

    PropostaResponseDto insert(PropostaRequestDto proposta);
    List<PropostaResponseDto> findAll();
}
