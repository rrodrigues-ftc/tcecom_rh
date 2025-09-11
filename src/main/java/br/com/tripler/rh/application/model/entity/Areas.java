package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "areas", schema="hr")
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

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaNome() {
        return areaNome;
    }

    public void setAreaNome(String areaNome) {
        this.areaNome = areaNome;
    }

    public Long getAreaDeptoId() {
        return areaDeptoId;
    }

    public void setAreaDeptoId(Long areaDeptoId) {
        this.areaDeptoId = areaDeptoId;
    }

    public Long getAreaEncFuncId() {
        return areaEncFuncId;
    }

    public void setAreaEncFuncId(Long areaEncFuncId) {
        this.areaEncFuncId = areaEncFuncId;
    }
}
