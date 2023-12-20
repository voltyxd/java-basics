package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Naruto", 18);
        Aluno aluno2 = new Aluno("Gojo", 23);
        Aluno aluno3 = new Aluno("Hinata", 16);
        Aluno aluno4 = new Aluno("Ichigo", 27);
        Professor professor = new Professor("Kakashi", "Matematica");
        Local local1 = new Local("Rua Joaquim 239");
        Local local2 = new Local("Avenida Antonieta 812");
        Local local3 = new Local("Rua Alves 993");
        Seminario seminario1 = new Seminario("Segunda Guerra Mundial", local2);
        Seminario seminario2 = new Seminario("Colonização", local3);

        seminario1.setAlunos(new Aluno[]{aluno2,aluno3});
        seminario2.setAlunos(new Aluno[]{aluno1,aluno4});
        aluno1.setSeminario(seminario2);
        aluno2.setSeminario(seminario1);
        aluno3.setSeminario(seminario2);
        aluno4.setSeminario(seminario1);
        professor.setSeminarios(new Seminario[]{seminario1});

        seminario1.imprime();
        seminario2.imprime();

        aluno1.imprime();
        aluno4.imprime();

        local1.imprime();
        local3.imprime();

        professor.imprime();

    }
}
