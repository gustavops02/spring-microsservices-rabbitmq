package com.gustavo.infra.constantes;

public abstract class RabbitMQConstantes {
    public static final String FILA_PROPOSTA_PENDENTE_MS_NOTIFICACAO = "proposta-pendente.ms-notificacao";
    public static final String FILA_PROPOSTA_PENDENTE_MS_ANALISE_CREDITO = "proposta-pendente.ms-analise-credito";
    public static final String FILA_PROPOSTA_CONCLUIDA_MS_NOTIFICACAO = "proposta-concluida.ms-notificacao";
    public static final String FILA_PROPOSTA_CONCLUIDA_MS_PROPOSTA = "proposta-concluida.ms-proposta";
    public static final String EXCHANGE_PROPOSTA_PENDENTE = "proposta-pendente.ex";
}
