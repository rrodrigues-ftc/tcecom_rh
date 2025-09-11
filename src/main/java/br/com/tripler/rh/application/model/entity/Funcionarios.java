package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

import java.time.LocalDate;

public class Funcionarios {
    @Id
    @NonNull
    private Float funcId;
    private Float funcCpf;
    private String funcNome;
    private String funcRg;
    private LocalDate funcDtNascimento;
    private String funcApelido;
    private String funcMae;
    private String funcPai;

}
