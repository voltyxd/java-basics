package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
        System.out.print("Salarios: ");
        for (double salario : salarios) {
            System.out.print(salario + " | ");
        }
        System.out.println();
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {
        if (salarios == null) {
            return;
        }

        double soma = 0;

        for (double salario : salarios) {
            soma += salario;
        }
        double media = soma / salarios.length;
        System.out.printf("Media salarial: %.2f", media);


    }
}
