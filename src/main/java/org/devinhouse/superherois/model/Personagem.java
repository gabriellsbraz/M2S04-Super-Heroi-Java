package org.devinhouse.superherois.model;

public abstract class Personagem implements Comparable<Personagem> {

    private String nome;
    private String superpoder;

    public Personagem(String nome, String superpoder) {
        this.nome = nome;
        this.superpoder = superpoder;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Personagem personagem = (Personagem) obj;
        return nome.equals(personagem.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode();
    }

    @Override
    public int compareTo(Personagem outroPersonagem) {
        return this.nome.compareTo(outroPersonagem.nome);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Superpoder: " + superpoder;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSuperpoder() {
        return superpoder;
    }

    public void setSuperpoder(String superpoder) {
        this.superpoder = superpoder;
    }
}
