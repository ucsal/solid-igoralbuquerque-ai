package br.com.ucsal.olimpiadas.service;

import java.util.*;
import br.com.ucsal.olimpiadas.Participante;

public class ParticipanteService {

    private List<Participante> participantes = new ArrayList<>();
    private long id = 1;

    public void cadastrar() {
        Participante p = new Participante();
        p.setId(id++);
        p.setNome("Teste");
        participantes.add(p);

        System.out.println("Participante cadastrado com sucesso!");
    }

    public List<Participante> listar() {
        return participantes;
    }
}
