package br.com.tripler.rh.application.model.entity;

import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

public class Empresas {
    @Id
    @NonNull
    private Float empId;
    private String empRazaoSocial;
    private String empCnpj;
    private String empFantasia;
    private String empInscEst;
    private String empInscMun;
    private Float empEndereco;

}
