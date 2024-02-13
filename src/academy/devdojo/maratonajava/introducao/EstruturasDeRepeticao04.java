package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
    // Condição valorParcela >= 1000;
    public static void main(String[] args) {
        double valorCarro = 57000.00;
        int parcela = 1;

        while (true) {
            double valorParcela = valorCarro / parcela;

            if (valorParcela < 1000) {
                break;
            }

            System.out.printf("%dx de R$%.2f\n", parcela, valorParcela);
            parcela++;
        }
    }
}
