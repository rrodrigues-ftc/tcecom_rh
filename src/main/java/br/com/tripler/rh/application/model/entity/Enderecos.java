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
@Table(name = "tab_enderecos", schema="rtcecom_rh")
public class Enderecos {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="end_id")
    private Long endId;

    @ManyToOne
    @JoinColumn(name = "end_logradouro_id")
    private DominioLogradouros dominioLogradouros;

    @Column(name="end_nome")
    private String endNome;

    @Column(name="end_numero")
    private Integer endNumero;

    @Column(name="end_complemento")
    private String endComplemento;

    @Column(name="end_cep")
    private String endCep;

    @ManyToOne
    @JoinColumn(name = "end_codigo_municipio")
    private DominioMunicipios dominioMunicipios;

    @Column(name="end_tipo_id")
    private Long endTipoId;

    @Column(name="end_cpf_cnpj")
    private String endCpfCnpj;


//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinTable(name = "tab_dom_logradouros",
//            joinColumns = @JoinColumn(name = "end_logradouro_id"),
//            inverseJoinColumns = @JoinColumn(name = "log_id"))
//    private Set<DominioLogradouros> dominioLogradouros;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinTable(name = "tab_dom_municipios",
//            joinColumns = @JoinColumn(name = "end_codigo_municipio"),
//            inverseJoinColumns = @JoinColumn(name = "munic_ibge_cod_completo"))
//    private Set<DominioMunicipios> dominioMunicipios;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinTable(name = "tab_dom_tipos",
//            joinColumns = @JoinColumn(name = "end_tipo_id"),
//            inverseJoinColumns = @JoinColumn(name = "tp_id"))
//    private Set<DominioTipos> dominioTipos;
}
