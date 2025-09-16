package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.jspecify.annotations.NonNull;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tab_cargos", schema="rtcecom_rh")
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
}
