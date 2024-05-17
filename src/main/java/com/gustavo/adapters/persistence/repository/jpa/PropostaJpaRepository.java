package com.gustavo.adapters.persistence.repository.jpa;

import com.gustavo.adapters.persistence.model.PropostaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropostaJpaRepository extends JpaRepository<PropostaEntity, Long> {
}
