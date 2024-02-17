package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");
        Time time = new Time("Brasil");

        time.setJogadores(new Jogador[]{jogador1, jogador2, jogador3});

        time.imprime();

        jogador1.imprime();
        jogador2.imprime();
        jogador3.imprime();
    }
}
