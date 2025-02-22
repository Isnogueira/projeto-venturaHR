package br.edu.infnet.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity
@Table(name = "tcriterios")
public class Criterio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private int perfil;
    private int peso;
    
    @JsonIgnore
    @JoinColumn(name = "vaga_id", referencedColumnName = "id")
    @ManyToOne
    private Vaga vaga;

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Criterio() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil) {
        this.perfil = perfil;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "Criterio{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", perfil=" + perfil +
                ", peso=" + peso +
                ", vaga=" + vaga +
                '}';
    }
}
