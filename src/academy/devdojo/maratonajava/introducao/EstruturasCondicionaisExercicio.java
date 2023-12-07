package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisExercicio {
    // € 0          € 34.712    9.70%
    // € 34.713     € 68.507    37.35%
    // € 68.508                 49.50%
    public static void main(String[] args) {
        double salarioAnual = 25000;

        double imposto;

        if (salarioAnual > 0 && salarioAnual <= 34712) {
            imposto = 9.70;
        } else if ( salarioAnual >= 34713 && salarioAnual <= 68507) {
            imposto = 37.35;
        } else {
            imposto = 49.50;
        }

        double valorImposto = salarioAnual * (imposto / 100);

        System.out.println(valorImposto);

    }
}
