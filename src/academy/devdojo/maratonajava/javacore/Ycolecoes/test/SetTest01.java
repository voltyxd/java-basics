package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(1L,"Hellsing Ultimate", 9.5, 0));
        mangas.add(new Manga(5L,"Berserk", 19.9, 5));
        mangas.add(new Manga(3L,"Pokemon", 11.20, 0));
        mangas.add(new Manga(4L,"Attack on Titan", 3.2, 2));
        mangas.add(new Manga(2L,"Dragon ball Z", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
