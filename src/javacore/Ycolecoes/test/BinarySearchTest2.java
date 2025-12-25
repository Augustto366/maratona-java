package javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javacore.Ycolecoes.domain.Manga;

public class BinarySearchTest2 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Attack on Titans", 19.9));
        mangas.add(new Manga(7L, "Pokemon", 18.5));
        mangas.add(new Manga(2L, "Bersek", 10.9));
        mangas.add(new Manga(9L, "Hellsing Ultimate", 9.99));
        mangas.add(new Manga(1L, "Dragon Ball Z", 25.65));

        Collections.sort(mangas, mangaByIdComparator);
        //mangas.sort(new MangaByIdComparator()); pode ser desta maneira também.

        for (Manga manga: mangas) {
            System.out.println(manga);
        }

        Manga mangaSearch = new Manga(9L, "Bersek", 10.9);

        System.out.println(Collections.binarySearch(mangas, mangaSearch, mangaByIdComparator));
    }
}
