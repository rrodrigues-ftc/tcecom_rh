package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

public class DominioMunicipios {
    @Id
    @NonNull
    private Float municIbgeCodCompleto;
    private String municNome;
    private Float municCodSimples;
    private Float municMicroCod;
    private String municMicroNome;
    private Float municMacroCod;
    private String municMacroNome;
    private String municUfSigla;
    private String municUfNome;
    private Integer municUfCod;

}
