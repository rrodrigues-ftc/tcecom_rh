package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tab_areas", schema="rtcecom_rh")
public class Areas {
    @Id
    @Column(name="id")
    private Long areaId;

    @Column(name="area_nome")
    private String areaNome;

    @Column(name="area_empresa_id")
    private String areaEmpresaId;

    @Column(name="area_encarregado_id")
    private Long areaEncarregadoId;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinTable(name = "tab_empresas",
//            joinColumns = @JoinColumn(name = "area_empresa_id"),
//            inverseJoinColumns = @JoinColumn(name = "emp_id"))
//    private Set<Empresas> empresas;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinTable(name = "tab_funcionarios",
//            joinColumns = @JoinColumn(name = "area_encarregado_id"),
//            inverseJoinColumns = @JoinColumn(name = "func_id"))
//    private Set<Funcionarios> funcionarios;

}
