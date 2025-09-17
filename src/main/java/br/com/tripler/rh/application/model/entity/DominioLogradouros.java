package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.*;
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
@Table(name = "tab_dom_logradouros", schema="rtcecom_rh")
public class DominioLogradouros {
    @Id
    @NonNull
    @Column(name="lograd_id")
    private Long logradId;

    @Column(name="lograd_descricao")
    private String logradescricao;

    @Column(name="lograd_apelido")
    private String logradApelido;


}
