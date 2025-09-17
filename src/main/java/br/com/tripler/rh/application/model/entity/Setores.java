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
@Table(name = "tab_setores", schema="rtcecom_rh")
public class Setores{
    @Id
    @NonNull
    @Column(name="setor_id")
    private Long setorId;

    @Column(name="setor_nome")
    private String setorNome;

    @Column(name="setor_departamento_id")
    private Long setorDepartamentoId;

    @Column(name="setor_encarregado_id")
    private Long setorEncarregadoId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "tab_enderecos",
            joinColumns = @JoinColumn(name = "emp_endereco_Id"),
            inverseJoinColumns = @JoinColumn(name = "end_id"))
    private Set<Enderecos> enderecos;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "tab_departamentos",
            joinColumns = @JoinColumn(name = "setor_departamento_id"),
            inverseJoinColumns = @JoinColumn(name = "depto_id"))
    private Set<Departamentos> departamentos;

}
