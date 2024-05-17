package com.gustavo.adapters.persistence.repository.jpa;

import com.gustavo.adapters.persistence.model.PropostaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropostaJpaRepository extends JpaRepository<PropostaEntity, Long> {
}
