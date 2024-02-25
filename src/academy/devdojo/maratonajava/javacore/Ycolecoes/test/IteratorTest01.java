package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(1L,"Hellsing Ultimate", 9.5, 0));
        mangas.add(new Manga(5L,"Berserk", 19.9, 5));
        mangas.add(new Manga(3L,"Pokemon", 11.20, 0));
        mangas.add(new Manga(4L,"Attack on Titan", 3.2, 2));
        mangas.add(new Manga(2L,"Dragon ball Z", 2.99, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);

    }
}
