package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Naruto";
        funcionario.idade = 22;
        funcionario.salarios = new double[]{2500.50, 3840.95, 5000.00};

        funcionario.imprimirDados();

    }
}
