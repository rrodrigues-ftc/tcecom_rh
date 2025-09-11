package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

//@Entity
public class Setor {
    @Id
    @NonNull
    private Float setorId;
    private String setorNome;
    private Float setorAreaId;
}
