package com.diego.api.entities;

//import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

//@Entity
//@Table(name = "empresa")
public class Empresa implements Serializable{

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column(name = "razao_social", nullable = false)
//    private String razaoSocial;
//
//    @Column(name = "cnpj", nullable = false)
//    private String cnpj;
//
//    @Column(name = "data_criacao", nullable = false)
//    private Date dataCriacao;
//
//    @Column(name = "data_atualizacao", nullable = false)
//    private Date dataAtualizacao;

//    @OneToMany(mappedBy = "empresa", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Funcionario> funcionarios;


//    public Empresa() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getRazaoSocial() {
//        return razaoSocial;
//    }
//
//    public void setRazaoSocial(String razaoSocial) {
//        this.razaoSocial = razaoSocial;
//    }
//
//    public String getCnpj() {
//        return cnpj;
//    }
//
//    public void setCnpj(String cnpj) {
//        this.cnpj = cnpj;
//    }
//
//    public Date getDataCriacao() {
//        return dataCriacao;
//    }
//
//    public void setDataCriacao(Date dataCriacao) {
//        this.dataCriacao = dataCriacao;
//    }
//
//    public Date getDataAtualizacao() {
//        return dataAtualizacao;
//    }
//
//    public void setDataAtualizacao(Date dataAtualizacao) {
//        this.dataAtualizacao = dataAtualizacao;
//    }

//    public List<Funcionario> getFuncionarios() {
//        return funcionarios;
//    }
//
//    public void setFuncionarios(List<Funcionario> funcionarios) {
//        this.funcionarios = funcionarios;
//    }

//    @PreUpdate
//    public void preUpdate(){
//        this.dataAtualizacao = new Date();
//    }
//
//    @PrePersist
//    public void prePersiste(){
//        final Date dataAtual = new Date();
//        this.dataAtualizacao = dataAtual;
//        this.dataCriacao = dataAtual;
//    }
//
//    @Override
//    public String toString() {
//        return "Empresa{" +
//                "id=" + id +
//                ", razaoSocial='" + razaoSocial + '\'' +
//                ", cnpj='" + cnpj + '\'' +
//                ", dataCriacao=" + dataCriacao +
//                ", dataAtualizacao=" + dataAtualizacao +
//                '}';
//    }
}
