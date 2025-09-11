package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

public class Departamentos {
    @Id
    @NonNull
    private Float deptoId;
    private String deptoNome;
    private Float deptoEmprId;
    private Float deptoEncFuncId;

}
