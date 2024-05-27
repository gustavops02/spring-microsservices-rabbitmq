package com.gustavo.domain.ports.out;

import com.gustavo.application.dto.response.PropostaResponseDto;

public interface RabbitNotificationService {

    void notificar(PropostaResponseDto proposta, String exchange);
}
