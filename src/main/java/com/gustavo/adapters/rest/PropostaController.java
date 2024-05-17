package com.gustavo.adapters.rest;

import com.gustavo.domain.dto.request.PropostaRequestDto;
import com.gustavo.domain.dto.response.PropostaResponseDto;
import com.gustavo.domain.ports.in.PropostaServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proposta")
@RequiredArgsConstructor
public class PropostaController {

    private final PropostaServicePort servicePort;

    @PostMapping
    public ResponseEntity<PropostaResponseDto> insert(@RequestBody PropostaRequestDto proposta){
        PropostaResponseDto response = servicePort.save(proposta);
        return ResponseEntity.ok(response);
    }
}