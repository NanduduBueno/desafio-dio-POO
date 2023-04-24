package br.com.dio.desafio.dominio;

import java.time.LocalDate;
public class Mentoria {

    private String titulo;
    private String descicao;
    private LocalDate data;

    public Mentoria() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descicao='" + descicao + '\'' +
                ", data=" + data +
                '}';
    }
}
