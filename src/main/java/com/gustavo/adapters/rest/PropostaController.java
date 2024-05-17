package com.gustavo.adapters.rest;

import com.gustavo.domain.dto.request.PropostaRequestDto;
import com.gustavo.domain.dto.response.PropostaResponseDto;
import com.gustavo.domain.ports.in.PropostaServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/proposta")
@RequiredArgsConstructor
public class PropostaController {

    private final PropostaServicePort servicePort;

    @PostMapping
    public ResponseEntity<PropostaResponseDto> insert(@RequestBody PropostaRequestDto proposta){
        PropostaResponseDto response = servicePort.save(proposta);

        return ResponseEntity.created(getPathLocation(response.getId())).body(response);
    }

    @GetMapping
    public ResponseEntity<List<PropostaResponseDto>> findAll(){
        return ResponseEntity.ok(servicePort.findAll());
    }

    private URI getPathLocation(Long id) {
        return ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id)
                .toUri();
    }
}
