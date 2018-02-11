package com.diego.api.entities;

import com.diego.api.enums.Perfil;

//import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

//@Entity
//@Table(name = "funcionario")
public class Funcionario implements Serializable{

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @Column(name = "nome", nullable = false)
//    private String nome;
//
//    @Column(name = "email", nullable = false)
//    private String email;
//
//    @Column(name = "senha", nullable = false)
//    private String senha;
//
//    @Column(name = "cpf", nullable = false)
//    private String cpf;
//
//    @Column(name = "valor_hora", nullable = true)
//    private BigDecimal valorHora;
//
//    @Column(name = "qtd_horas_trabalho_dia", nullable = true)
//    private Float qtdHorasTrabalhoDia;
//
//    @Column(name = "qtd_horas_almoco", nullable = true)
//    private Float qtdHorasAlmoco;
//
//    @Enumerated(EnumType.STRING)
//    @Column(name = "perfil", nullable = false)
//    private Perfil perfil;
//
//    @Column(name = "data_criacao", nullable = false)
//    private Date dataCriacao;
//
//    @Column(name = "data_atualizacao", nullable = false)
//    private Date dataAtualizacao;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    private Empresa empresa;
//
//    @OneToMany(mappedBy = "funcionario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Lancamento> lancamentos;
//
//    public Funcionario() {
//    }
//
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
//        return "Funcionario{" +
//                "id=" + id +
//                ", nome='" + nome + '\'' +
//                ", email='" + email + '\'' +
//                ", senha='" + senha + '\'' +
//                ", cpf='" + cpf + '\'' +
//                ", valorHora=" + valorHora +
//                ", qtdHorasTrabalhoDia=" + qtdHorasTrabalhoDia +
//                ", qtdHorasAlmoco=" + qtdHorasAlmoco +
//                ", perfil=" + perfil +
//                ", dataCriacao=" + dataCriacao +
//                ", dataAtualizacao=" + dataAtualizacao +
//                ", empresa=" + empresa +
//                ", lancamentos=" + lancamentos +
//                '}';
//    }
}
