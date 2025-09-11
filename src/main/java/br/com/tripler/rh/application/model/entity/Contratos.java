package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

import java.time.LocalDate;

public class Contratos {
    @Id
    @NonNull
    private Float contrId;
    private Float contrFuncId;
    private Float contrEmprId;
    private LocalDate contrDtInicio;
    private LocalDate contrDtTermino;
    private String contrMotivoTermino;
    private Integer contrDiasExperiencia;

}
