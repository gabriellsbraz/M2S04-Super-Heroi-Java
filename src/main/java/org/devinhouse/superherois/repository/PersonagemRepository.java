package org.devinhouse.superherois.repository;

import java.util.ArrayList;
import java.util.List;

public class PersonagemRepository {
    private List<String> personagens;

    public PersonagemRepository() {
        this.personagens = new ArrayList<>();

    }

    public void inserirPersonagem(String nomePersonagem) {
        this.personagens.add(nomePersonagem);
    }

    public List<String> consultarPersonagens() {
        return new ArrayList<>(this.personagens);
    }

}
