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
@Table(name = "tab_funcionarios", schema="rtcecom_rh")
public class Funcionarios {
    @Id
    @NonNull
    @Column(name="func_Id")
    private Long funcId;

    @Column(name="func_cpf")
    private Float funcCpf;

    @Column(name="func_nome")
    private String funcNome;

    @Column(name="func_rg")
    private String funcRg;

    @Column(name="func_dt_nascimento")
    private LocalDate funcDtNascimento;

    @Column(name="func_apelido")
    private String funcApelido;

    @Column(name="func_mae")
    private String funcMae;

    @Column(name="func_pai")
    private String funcPai;

    @Column(name="func_natural_id")
    private String funcNaturalId;

    @Column(name="func_estrangeiro")
    private Boolean funcEstrangeiro;

    @Column(name="func_nacionalidade")
    private String funcNacionalidade;

    @Column(name="func_docto_estrangeiro")
    private String funcDoctoEstrangeiro;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "tab_municipios",
            joinColumns = @JoinColumn(name = "func_natural_id"),
            inverseJoinColumns = @JoinColumn(name = "munic_ibge_cod_completo"))
    private Set<DominioMunicipios> dominioMunicipios ;


}
