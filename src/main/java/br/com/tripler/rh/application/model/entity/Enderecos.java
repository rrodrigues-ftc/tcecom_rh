package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

public class Enderecos {
    @Id
    @NonNull
    private Float endId;
    private Float endLogradouro;
    private String endNome;
    private Integer endNumero;
    private String endComplemento;
    private String endCep;
    private Float endMunicipio;
    private Float endTipo;
    private Float endCpfCnpj;

}
