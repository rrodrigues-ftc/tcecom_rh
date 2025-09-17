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
@Table(name = "tab_salarios", schema="rtcecom_rh")
public class Salarios {
    @Id
    @NonNull
    @Column(name="sal_id")
    private Long salId;

    @Column(name="sal_funcionario_id")
    private Long salFuncionarioId;

    @Column(name="sal_contrato_id")
    private Long salContratoId;

    @Column(name="sal_data_referencia")
    private LocalDate salDataReferencia;

    @Column(name="sal_valor")
    private Float salValor;

    @Column(name="sal_Motivo")
    private String salMotivo;

    @Column(name="sal_cargo_id")
    private Long salCargoId;

    @Column(name="sal_setor_id")
    private Long salSetorId;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tab_funcionarios",
    joinColumns = @JoinColumn(name = "sal_id"),
            inverseJoinColumns = @JoinColumn(name = "func_id"))
    private Set<Funcionarios> funcionarios;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tab_contratos",
            joinColumns = @JoinColumn(name = "sal_contrato_id"),
            inverseJoinColumns = @JoinColumn(name = "contr_id"))
    private Set<Contratos> contratos;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tab_setores",
            joinColumns = @JoinColumn(name = "sal_setor_id"),
            inverseJoinColumns = @JoinColumn(name = "setor_id"))
    private Set<Setores> setores;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "tab_cargos",
            joinColumns = @JoinColumn(name = "sal_cargo_id"),
            inverseJoinColumns = @JoinColumn(name = "cargo_id"))
    private Set<Cargos> cargos;

}
