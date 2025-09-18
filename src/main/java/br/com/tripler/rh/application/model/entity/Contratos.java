package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jspecify.annotations.NonNull;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tab_contratos", schema="rtcecom_rh")
public class Contratos {
    @Id
    @NonNull

    @Column(name="contr_id")
    private Long contrId;

    @Column(name="contr_funcionario_id")
    private Long contrFuncionarioId;

    @Column(name="contr_empresa_id")
    private Long contrEmpresaId;

    @Column(name="contr_dt_inicio")
    private LocalDate contrDtInicio;

    @Column(name="contr_dt_termino")
    private LocalDate contrDtTermino;

    @Column(name="contr_motivo_termino")
    private String contrMotivoTermino;

    @Column(name="contr_dias_experiencia")
    private Integer contrDiasExperiencia;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinTable(name = "tab_empresas",
//            joinColumns = @JoinColumn(name = "contr_empresa_id"),
//            inverseJoinColumns = @JoinColumn(name = "emp_id"))
//    private Set<Empresas> empresas;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinTable(name = "tab_funcionarios",
//            joinColumns = @JoinColumn(name = "contr_funcionario_id"),
//            inverseJoinColumns = @JoinColumn(name = "func_id"))
//    private Set<Funcionarios> funcionarios;


}
