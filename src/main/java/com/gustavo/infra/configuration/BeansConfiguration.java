package com.gustavo.infra.configuration;

import com.gustavo.domain.ports.in.PropostaServicePort;
import com.gustavo.domain.ports.out.PropostaRepositoryPort;
import com.gustavo.domain.services.PropostaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    @Bean
    public PropostaServicePort propostaServicePort(PropostaRepositoryPort repositoryPort) {
        return new PropostaService(repositoryPort);

    }
}
