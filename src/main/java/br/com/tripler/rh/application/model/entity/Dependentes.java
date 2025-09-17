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
@Table(name = "tab_dependentes", schema="rtcecom_rh")
public class Dependentes {
    @Id
    @NonNull
    @Column(name="dep_id")
    private Long depId;

    @Column(name="dep_funcionario_id")
    private Long depFuncionarioId;

    @Column(name="dep_nome")
    private String depNome;

    @Column(name="dep_cpf")
    private Float depCpf;

    @Column(name="dep_dt_nascimento")
    private LocalDate depDtNascimento;

    @Column(name="dep_dt_inclusao")
    private LocalDate depDtInclusao;

    @Column(name="dep_dt_exclusao")
    private LocalDate depDtExclusao;

    @Column(name="dep_motivo_exclusao")
    private String depMotivoExclusao;

    @Column(name="dep_observacoes")
    private String depObservacoes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "tab_funcionarios",
            joinColumns = @JoinColumn(name = "dep_funcionario_id"),
            inverseJoinColumns = @JoinColumn(name = "func_id"))
    private Set<Funcionarios> funcionarios;


}
