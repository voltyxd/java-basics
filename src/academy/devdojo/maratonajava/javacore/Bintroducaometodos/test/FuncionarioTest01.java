package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Goku");
        funcionario.setIdade(23);
        funcionario.setSalario(new double[]{3000, 4000, 5000});

        funcionario.imprimirDados();
        System.out.println("Media: " + funcionario.getMedia());
    }
}
