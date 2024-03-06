package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais04Exercicio {
//    € 0	    € 34,712	9.70%
//    € 34,713	€ 68,507	37.35%
//    € 68,508		        49.50%
    public static void main(String[] args) {
        double salarioAnual = 25000;
        double porcentagemDeImposto;

        if (salarioAnual > 0 && salarioAnual <= 34712) {
            porcentagemDeImposto = (9.70 / 100);
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            porcentagemDeImposto = (37.35 / 100);
        } else {
            porcentagemDeImposto = (49.50 / 100);
        }

        double valorImposto = salarioAnual * porcentagemDeImposto;

        System.out.println(valorImposto);
    }
}
