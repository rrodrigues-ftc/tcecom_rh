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
@Table(name = "tab_dom_tipos", schema="rtcecom_rh")
public class DominioTipos {
    @Id
    @NonNull
    @Column(name="tp_id")
    private Long tpId;

    @Column(name="tp_uso")
    private String tpUso;

    @Column(name="tp_descricao")
    private String tpDescricao;


}