package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

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

        for (double s : salario) {
            media += s;
        }

        media /= salario.length;
        System.out.println("Média salarial: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
