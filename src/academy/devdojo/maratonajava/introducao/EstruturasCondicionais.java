package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcoolica");
        }

        System.out.println("Fora do if");
    }
}
