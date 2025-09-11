package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

public class DominioLogradouros {
    @Id
    @NonNull
    private Float logId;
    private String logDescricao;
    private String logApelido;
}
