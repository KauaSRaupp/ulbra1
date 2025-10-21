package Atividade5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Principal {
    static void main() {

        Video v1 = new Video();
        Podcast p1 = new Podcast();
        ArtigoNarrado an1 = new ArtigoNarrado();

        ArrayList<Midia> feed = new ArrayList<>();
        feed.add(an1);
        feed.add(v1);
        feed.add(p1);


        Collections.sort(feed, new Comparator<Midia>() {
            @Override
            public int compare(Midia m1, Midia m2) {
                return m1.duracao().compareTo(m2.duracao());
            }
        });

        for(int i = 0; i < feed.size(); i++){
            feed.get(i).reproduzir();
            System.out.println("Duração: " + feed.get(i).duracao());
        }
    }
}
