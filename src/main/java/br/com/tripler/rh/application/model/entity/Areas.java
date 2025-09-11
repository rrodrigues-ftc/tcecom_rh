package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

public class Areas {
    @Id
    @NonNull
    private Float areaId;
    private String areaNome;
    private Float areaDeptoId;
    private Float areaEncFuncId;

}
