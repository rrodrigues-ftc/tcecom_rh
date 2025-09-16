package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tab_areas", schema="rtcecom_rh")
public class Areas {
    @Id
    @Column(name="id")
    private Long areaId;

    @Column(name="area_nome")
    private String areaNome;

    @Column(name="area_depto_id")
    private Long areaDeptoId;

    @Column(name="area_enc_func_id")
    private Long areaEncFuncId;
}
