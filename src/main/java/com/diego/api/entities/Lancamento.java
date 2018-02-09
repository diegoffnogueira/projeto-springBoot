package com.diego.api.entities;

import com.diego.api.enums.Tipo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "lancamento")
public class Lancamento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data", nullable = false)
    private Date data;

    @Column(name = "descricao", nullable = true)
    private String descricao;

    @Column(name = "localizacao", nullable = true)
    private String localizacao;

    @Column(name = "data_criacao", nullable = false)
    private Date dataCriacao;

    @Column(name = "data_atualizacao", nullable = false)
    private Date dataAtualizacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo", nullable = false)
    private Tipo tipo;

    @ManyToOne(fetch = FetchType.EAGER)
    private Funcionario funcionario;

    public Lancamento() {
    }

    @PreUpdate
    public void preUpdate(){
        this.dataAtualizacao = new Date();
    }

    @PrePersist
    public void prePersiste(){
        final Date dataAtual = new Date();
        this.dataAtualizacao = dataAtual;
        this.dataCriacao = dataAtual;
    }

    @Override
    public String toString() {
        return "Lancamento{" +
                "id=" + id +
                ", data=" + data +
                ", descricao='" + descricao + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", dataCriacao=" + dataCriacao +
                ", dataAtualizacao=" + dataAtualizacao +
                ", tipo=" + tipo +
                ", funcionario=" + funcionario +
                '}';
    }
}
