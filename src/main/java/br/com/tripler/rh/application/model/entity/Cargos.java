package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jspecify.annotations.NonNull;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tab_cargos", schema="rtcecom_rh")
public class Cargos {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cargo_id")
    private Long cargoId;

    @Column(name="cargo_descr")
    private String cargosDescr;

    @Column(name="cargo_setor_id")
    private Long cargoSetorId;

    @Column(name="cargo_flag_lider")
    private Boolean cargoFlagLider;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinTable(name = "tab_setores",
//            joinColumns = @JoinColumn(name = "cargo_setor_id"),
//            inverseJoinColumns = @JoinColumn(name = "setor_id"))
//    private Set<Setores> setores;


}
