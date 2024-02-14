package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Peugeot";
        carro01.modelo = "Sandero";
        carro01.ano = 2015;

        Carro carro02 = new Carro();
        carro02.nome = "Mustang";
        carro02.modelo = "GT 500";
        carro02.ano = 2022;

        System.out.println("--------- Carro 1 ---------");
        System.out.println("Nome: " + carro01.nome);
        System.out.println("Modelo: " + carro01.modelo);
        System.out.println("Ano: " + carro01.ano);

        System.out.println("\n--------- Carro 2 ---------");
        System.out.println("Nome: " + carro02.nome);
        System.out.println("Modelo: " + carro02.modelo);
        System.out.println("Ano: " + carro02.ano);
    }
}
