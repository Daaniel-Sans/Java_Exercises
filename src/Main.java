
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("***Ejercicio 1: Información sobre el catálogo***");

    //Definición de variables

    String Libro = "Matar a un ruiseñor";
    String Pelicula = "Matrix";
    String Album = "Master of Puppets";
    String Videojuego = "MGS3: Snake Eater";

    int añoLibro = 1960;
    int añoPelicula = 1999;
    int añoAlbum = 1986;
    int añoVideojuego = 2004;

    double precioDiaLibro = 30;
    double precioDiaPelicula = 10;
    double precioDiaAlbum = 20;
    double precioDiaVideojuego = 43.5;

    //Instrucciones para salida de datos

    Scanner sc = new Scanner (System.in);
    System.out.println("Para consultar el precio de nuestros títulos disponibles prueba a escribir 'Precios':");
    String precios = sc.nextLine();
    System.out.println("Actualmente tenemos en el catálogo:");
        System.out.println("-El libro " + Libro + " publicado en " +añoLibro+ " por " +precioDiaLibro+ "€ al día");
        System.out.println("-La película " + Pelicula + " publicada en " +añoPelicula+ " por " +precioDiaPelicula+ "€ al día");
        System.out.println("-El album " + Album + " publicado en " +añoAlbum+ " por " +precioDiaAlbum+ "€ al día");
        System.out.println("-El videojuego " + Videojuego + " publicado en " +añoVideojuego+ " por " +precioDiaVideojuego+ "€ al día");

        System.out.println("\n" + "***Ejercicio 2: Ingresos totales de los artículos***");

        //Instrucciones para posibles salidas según diferentes entradas

        System.out.println("Elige qué quieres alquilar dentro del catálogo");
        String categoría = sc.nextLine();
        System.out.println(categoría);
        if (categoría.equals("libro") || categoría.equals("Libro") || categoría.equals("Libros") || categoría.equals("libros")){
            System.out.println("Cuantas unidades quieres");
            int unitbook = sc.nextInt();
            double precio= unitbook*precioDiaLibro;
            System.out.println("Saldría por " + precio + "€ en total");
        } else if (categoría.equals("película") || categoría.equals("Película") || categoría.equals("PELÍCULA") || categoría.equals("PELÍCULAS") || categoría.equals("películas") || categoría.equals("Películas")) {
            System.out.println("Cuantas unidades quieres");
            int unitfilm = sc.nextInt();
            double precio= unitfilm*precioDiaPelicula;
            System.out.println("Saldría por " + precio + "€ en total");
        } else if (categoría.equals("JUEGOS") || categoría.equals("JUEGO") || categoría.equals("Juego") || categoría.equals("Juegos") || categoría.equals("juego") || categoría.equals("juegos")) {
            System.out.println("Cuantas unidades quieres");
            int unitgames = sc.nextInt();
            double precio= unitgames*precioDiaVideojuego;
            System.out.println("Saldría por " + precio + "€ en total");
        } else if (categoría.equals("ALBUM") || categoría.equals("ALBUMES") || categoría.equals("Album") || categoría.equals("Albumes") || categoría.equals("album") || categoría.equals("albumes")) {
            System.out.println("Cuantas unidades quieres");
            int unitalbums = sc.nextInt();
            double precio= unitalbums*precioDiaAlbum;
            System.out.println("Saldría por " + precio + "€ en total");
        } else System.out.println("No disponemos de esos artículos en el catálogo");

        System.out.println("\n" + "***Ejercicio 3: Descuento***");
    }
}