package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

import java.time.LocalDate;

public class Salarios {
    @Id
    @NonNull
    private Float salId;
    private Float salFuncId;
    private Float salContratoId;
    private LocalDate salData;
    private Float salValor;
    private String salMotivo;
    private Float salCargo;
    private Float salSetorId;

}
