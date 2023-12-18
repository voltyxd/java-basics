package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Goku";
        funcionario.idade = 21;
        funcionario.salario = new double[]{3000, 4000, 5000};

        funcionario.imprimirDados();
    }
}
