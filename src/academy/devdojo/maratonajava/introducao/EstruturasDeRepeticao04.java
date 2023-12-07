package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticao04 {
    // Dado o valor de um carro descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000;
    public static void main(String[] args) {
        double valorCarro = 30000;
        int count = 1;
        double valorParcela;
        while (true) {
            valorParcela = valorCarro / count;
            if (valorParcela < 1000) {
                break;
            }
            System.out.printf("%dx de R$ %.2f\n", count, valorParcela);
            count++;
        }
    }
}
