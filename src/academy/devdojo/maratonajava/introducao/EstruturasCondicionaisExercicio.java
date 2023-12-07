package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salary = 23050;

        double tax;

        if (salary > 0 && salary <= 34712) {
            tax = 9.70;
        } else if (salary <= 68507) {
            tax = 37.35;
        } else {
            tax = 49.50;
        }

        double taxIncome = salary * (tax / 100);

        System.out.println(taxIncome);

    }
}
