package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.jspecify.annotations.NonNull;

@Entity
@Table(name = "cargos", schema="rtcecom_rh")
public class Cargos {
    @Id
    @NonNull
    @Column(name="cargo_id")
    private Long cargoId;

    @Column(name="cargo_descr")
    private String cargosDescr;

    @Column(name="cargo_depto")
    private Long cargoDepto;

    @Column(name="cargo_lider")
    private Boolean cargoLider;

    public @NonNull Long getCargoId() {
        return cargoId;
    }

    public void setCargoId(@NonNull Long cargoId) {
        this.cargoId = cargoId;
    }

    public String getCargosDescr() {
        return cargosDescr;
    }

    public void setCargosDescr(String cargosDescr) {
        this.cargosDescr = cargosDescr;
    }

    public Long getCargoDepto() {
        return cargoDepto;
    }

    public void setCargoDepto(Long cargoDepto) {
        this.cargoDepto = cargoDepto;
    }

    public Boolean getCargoLider() {
        return cargoLider;
    }

    public void setCargoLider(Boolean cargoLider) {
        this.cargoLider = cargoLider;
    }
}
