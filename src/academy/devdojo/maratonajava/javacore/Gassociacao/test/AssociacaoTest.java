package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Naruto", 15);
        Aluno aluno2 = new Aluno("Luffy", 16);
        Aluno aluno3 = new Aluno("Sakura", 14);

        Professor professor1 = new Professor("Kakashi Sensei", "Jutsu");
        Professor professor2 = new Professor("Mestre Kami", "Ki");

        Local local1 = new Local("Faculdade Estácio - Nova Iguaçu");
        Local local2 = new Local("UFRJ - Centro do RJ");

        Seminario seminario1 = new Seminario("Segunda Guerra Mundial", local1);
        Seminario seminario2 = new Seminario("Covid-19", local2);

        professor1.setSeminarios(new Seminario[]{seminario1, seminario2});
        professor2.setSeminarios(new Seminario[]{seminario1});

        aluno2.setSeminario(seminario1);
        aluno3.setSeminario(seminario2);

        seminario2.setAlunos(new Aluno[]{aluno2, aluno3});

        aluno1.imprime();
        aluno2.imprime();
        aluno3.imprime();

        professor1.imprime();
        professor2.imprime();

        local1.imprime();
        local2.imprime();

        seminario1.imprime();
        seminario2.imprime();


    }
}
