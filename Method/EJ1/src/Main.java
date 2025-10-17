
import java.util.ArrayList;
import java.util.List;

interface MyLambda<A> {
    A doMyLambda(String name);
}

class CreadorDeObjetos {
    static <T> List<T> crear(MyLambda<T> lambda, List<String> names) {
        List<T> objects = new ArrayList<>();

        for(String name : names) {
            objects.add(lambda.doMyLambda(name));
        }

        return objects;
    }
}

record Ciudad (String name) {}

class Album {
    String titulo;
    Album(String titulo){ this.titulo = titulo; }
    public String toString() { return "Album{titulo='" + titulo + "'}"; }
}

class Coche {
    String marca;
    Coche(String marca){ this.marca = marca; }
    public String toString() { return "Coche{marca='" + marca + "'}"; }
}


public class Main {
    static void main(String[] args) {

        List<String> nc = List.of("Barcelona", "Valencia", "Castellon");
        List<String>na=List.of("Thriller", "Real hasta la muerte", "Fitipaldi");
        List<String>nco=List.of("Ferrari","Toyota","Fiat");

        List<Ciudad> ciudades = CreadorDeObjetos.crear(Ciudad::new, nc);
        List<Album> albums = CreadorDeObjetos.crear(Album::new, na);
        List<Coche> coches = CreadorDeObjetos.crear(Coche::new, nco);

        System.out.println("Ciudades:");
        ciudades.forEach(System.out::println);

        System.out.println("\nÁlbumes:");
        albums.forEach(System.out::println);

        System.out.println("\nCoches:");
        coches.forEach(System.out::println);
    }
}

