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
@Table(name = "tab_empresas", schema="rtcecom_rh")
public class Empresas {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="emp_id")
    private Long empId;

    @Column(name="emp_razao_social")
    private String empRazaoSocial;

    @Column(name="emp_cnpj")
    private String empCnpj;

    @Column(name="emp_nome_fantasia")
    private String empFantasia;

    @Column(name="emp_inscricao_estadual")
    private String empInscEst;

    @Column(name="emp_inscricao_municipal")
    private String empInscMun;

    @Column(name="emp_endereco_Id")
    private Long empEnderecoId;

//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinTable(name = "tab_areas",
//            joinColumns = @JoinColumn(name = "area_empresa_id"))
//            inverseJoinColumns = @JoinColumn(name = "area_id"))
//    private Set<Empresas> empresas;


}
