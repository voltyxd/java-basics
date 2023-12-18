package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salario == null) {
            return;
        }
        System.out.print("Salarios: ");
        for (double s : salario) {
            System.out.print(s);
            if (s == salario[salario.length - 1]) {
                break;
            }
            System.out.print(", ");
        }
        System.out.println();
        imprimirMediaSalarios();
    }

    public void imprimirMediaSalarios() {
        if (salario == null) {
            return;
        }
        double soma = 0;
        for (double s : salario) {
            soma += s;
        }
        double media = soma / salario.length;
        System.out.println("Média salarial: " + media);
    }


}
