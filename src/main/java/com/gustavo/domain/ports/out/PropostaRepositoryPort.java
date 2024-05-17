package com.gustavo.domain.ports.out;

import com.gustavo.domain.model.Proposta;

import java.util.List;
import java.util.Optional;

public interface PropostaRepositoryPort {
    Optional<Proposta> findById(Long id);
    void save(Proposta proposta);
    List<Proposta> findAll();
}
