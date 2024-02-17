package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    static {
        System.out.println("Dentro do bloco de inicializaçao estatico de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicializaçao de Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicializaçao de Funcionario 2");
    }

    private double salario;

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + " recebi o salario de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
