package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Naruto");
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[]{1200.0, 987.32, 2000.00});

        funcionario.imprimirDados();
        System.out.println("Media: " + funcionario.getMedia());

    }
}
