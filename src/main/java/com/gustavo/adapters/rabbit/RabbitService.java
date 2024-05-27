package com.gustavo.adapters.rabbit;

import com.gustavo.application.dto.response.PropostaResponseDto;
import com.gustavo.domain.ports.out.RabbitNotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitService implements RabbitNotificationService {

    private final RabbitTemplate rabbitTemplate;

    public void notificar(PropostaResponseDto proposta, String exchange) {
        rabbitTemplate.convertAndSend(exchange, "", proposta);
    }
}
