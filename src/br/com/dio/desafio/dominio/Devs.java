package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Devs {
        private String nome;
        private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
        private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

        public void increverBootcamp(Bootcamp bootcamp){}

        public void progredir(){}

        public void calcularTotalXp(){}


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Set<Conteudo> getConteudosIncritos() {
            return conteudosIncritos;
        }

        public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
            this.conteudosIncritos = conteudosIncritos;
        }

        public Set<Conteudo> getConteudosConcluidos() {
            return conteudosConcluidos;
        }

        public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
            this.conteudosConcluidos = conteudosConcluidos;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Devs devs = (Devs) o;
        return Objects.equals(nome, devs.nome) && Objects.equals(conteudosIncritos, devs.conteudosIncritos) && Objects.equals(conteudosConcluidos, devs.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosIncritos, conteudosConcluidos);
    }
}
