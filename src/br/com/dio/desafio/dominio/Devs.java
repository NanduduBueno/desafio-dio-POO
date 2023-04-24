package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Devs {
        private String nome;
        private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
        private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

        public void inscreverBootcamp(Bootcamp bootcamp){
            this.conteudosIncritos.addAll(bootcamp.getConteudos());
            bootcamp.getDevsIncritos().add(this);
        }

        public void progredir(){
            Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
            if(conteudo.isPresent()){
                this.conteudosConcluidos.add(conteudo.get());
                this.conteudosIncritos.remove(conteudo.get());
            }
            else {
                System.err.println("Você não está matriculado em nenhum conteúdo!");
            }
        }

        public double calcularTotalXp(){
            return this.conteudosConcluidos.stream().mapToDouble(conteudos -> conteudos.calcularXp()).sum();
        }

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
