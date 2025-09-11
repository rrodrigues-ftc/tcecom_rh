package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

public class Cargos {
    @Id
    @NonNull
    private Float cargosId;
    private String cargosDescr;
    private Float cargoDepto;
    private Boolean cargoLider;

}
