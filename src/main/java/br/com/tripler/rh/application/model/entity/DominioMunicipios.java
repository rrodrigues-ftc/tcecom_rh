package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jspecify.annotations.NonNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tab_dom_municipios", schema="rtcecom_rh")
public class DominioMunicipios {
    @Id
    @NonNull
    @Column(name="munic_ibge_cod_completo")
    private Float municIbgeCodCompleto;

    @Column(name="munic_nome")
    private String municNome;

    @Column(name="munic_cod_simples")
    private Float municCodSimples;

    @Column(name="munic_micro_cod")
    private Float municMicroCod;

    @Column(name="munic_micro_nome")
    private String municMicroNome;

    @Column(name="munic_macro_cod")
    private Float municMacroCod;

    @Column(name="munic_macro_nome")
    private String municMacroNome;

    @Column(name="munic_uf_sigla")
    private String municUfSigla;

    @Column(name="munic_uf_nome")
    private String municUfNome;

    @Column(name="munic_uf_cod")
    private Integer municUfCod;

}
