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
@Table(name = "tab_departamentos", schema="rtcecom_rh")
public class Departamentos {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="depto_id")
    private Long deptoId;

    @Column(name="depto_nome")
    private String deptoNome;

    @Column(name="depto_area_id")
    private Long deptoAreaId;

    @Column(name="depto_encarregado_id")
    private Long deptoEncarregadoId;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinTable(name = "tab_areas",
//            joinColumns = @JoinColumn(name = "depto_area_id"),
//            inverseJoinColumns = @JoinColumn(name = "area_id"))
//    private Set<Areas> areas;

}
