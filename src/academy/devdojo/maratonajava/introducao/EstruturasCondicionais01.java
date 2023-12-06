package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade > 18;
        // !

        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcóolica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcóolica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcóolica");
        }

        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}
