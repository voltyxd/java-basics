package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Kirito";
        String endereco = "Rua Ambrosio 155";
        double salario = 3255.22;
        String data = "04/02/2024";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário" +
                " de " + salario + ", na data " + data);
    }
}
