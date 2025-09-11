package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

import java.time.LocalDate;

public class Dependentes {
    @Id
    @NonNull
    private Float depId;
    private Float depFuncId;
    private String depNome;
    private Float depCpf;
    private LocalDate depDtNascimento;
    private LocalDate depDtInclusao;
    private LocalDate depDtExclusao;
    private String depMotivoExclusao;
    private String depObservacoes;

}
