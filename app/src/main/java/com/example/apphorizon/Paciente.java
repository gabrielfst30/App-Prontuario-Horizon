package com.example.apphorizon;


import java.io.Serializable;

public class Paciente implements Serializable{

    private Integer id;
    private String nome;
    private String idade;
    private String temperatura;
    private String tosse;
    private String enxaqueca;
    private String paisesvisitados;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getTosse() {
        return tosse;
    }

    public void setTosse(String tosse) {
        this.tosse = tosse;
    }

    public String getEnxaqueca() {
        return enxaqueca;
    }

    public void setEnxaqueca(String enxaqueca) {
        this.enxaqueca = enxaqueca;
    }

    public String getPaisesvisitados() {
        return paisesvisitados;
    }

    public void setPaisesvisitados(String paisesvisitados) {
        this.paisesvisitados = paisesvisitados;
    }

    @Override
    public String toString(){
        return nome;

    }
}



