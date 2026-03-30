package br.com.ucsal.olimpiadas;

import java.util.Scanner;
import br.com.ucsal.olimpiadas.service.*;

public class App {

    static CalculadoraNota calculadora = new CalculadoraNotaPadrao();
    static ParticipanteService participanteService = new ParticipanteService();

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("1- Participante | 2- Sair");
            switch (in.nextLine()) {
                case "1" -> participanteService.cadastrar();
                case "2" -> { return; }
            }
        }
    }
}
