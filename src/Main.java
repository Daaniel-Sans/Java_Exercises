
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

    double precioDiaLibro = 0.10;
    double precioDiaPelicula = 2.75;
    double precioDiaAlbum = 1.80;
    double precioDiaVideojuego = 2.50;

    int diasAlqLibro1 = 20;
    int diasAlqLibro2 = 30;
    int diasAlqLibro3 = 15;
    int diasAlqLibro4 = 14;

    int diasAlqPelicula1 = 3;
    int diasAlqPelicula2 = 6;

    int diasAlqAlbum1 = 2;
    int diasAlqAlbum2 = 7;

    int diasAlqVideojuego1 = 30;
    int diasAlqVideojuego2 = 29;
    int diasAlqVideojuego3 = 10;

    double ingresosMesLibros = (diasAlqLibro1 + diasAlqLibro2 + diasAlqLibro3 + diasAlqLibro4) * precioDiaLibro;
    double ingresosMesPeliculas = (diasAlqPelicula1 + diasAlqPelicula2) * precioDiaPelicula;
    double ingresosMesAlbumes = (diasAlqAlbum1 + diasAlqAlbum2) * precioDiaAlbum;
    double ingresosMesVideojuegos = (diasAlqVideojuego1 + diasAlqVideojuego2 + diasAlqVideojuego3) * precioDiaVideojuego;

    final String divisaDia = "€/Día";
    final String divisa = "€";

    //Instrucciones para salida de datos

    Scanner sc = new Scanner (System.in);
    System.out.println("Pulsa 'Enter' para acceder al catálogo");
    String precios = sc.nextLine();
    System.out.println("Artículos disponibles para alquilar:");
        System.out.println("-LIBRO: " + Libro + "(" + añoLibro + ")" + " = " +precioDiaLibro + divisaDia);
        System.out.println("-PELÍCULA: " + Pelicula + "(" + añoPelicula + ")" + " = " +precioDiaPelicula + divisaDia);
        System.out.println("-ALBUM: " + Album + "(" + añoAlbum + ")" + " = " +precioDiaAlbum+ divisaDia);
        System.out.println("-VIDEOJUEGO " + Videojuego + "(" + añoVideojuego + ")" + " = " +precioDiaVideojuego+ divisaDia);

        System.out.println("\n" + "***Ejercicio 2: Ingresos totales de los artículos***");

        //Instrucciones para posibles salidas según diferentes entradas

        double totalMes= ingresosMesLibros + ingresosMesPeliculas + ingresosMesAlbumes + ingresosMesVideojuegos;
        System.out.println("Los ingresos totales de este mes han sido: " + totalMes+ divisa);

        System.out.println("Escribe el nombre de una categoria para consultar los ingresos parciales que correspondan. "+ "\n" + "Si quieres ver el desglose de los ingresos totales escribe 'ver todo'");
        String categoría = sc.nextLine();
        System.out.println(categoría);

        if (categoría.equals("ver todo") || categoría.equals("vertodo") || categoría.equals("VER TODO") || categoría.equals("ver") || categoría.equals("todo") || categoría.equals("TODO")|| categoría.equals("VER")) {
            System.out.println("Libros: " + ingresosMesLibros + divisa + " del total");
            System.out.println("Películas: " + ingresosMesPeliculas + divisa + " del total");
            System.out.println("Albumes: " + ingresosMesAlbumes + divisa + " del total");
            System.out.println("Videojuegos: " + ingresosMesVideojuegos + divisa + " del total");
            System.out.println("TOTAL: " + totalMes + divisa);

        }else if (categoría.equals("libro") || categoría.equals("Libro") || categoría.equals("Libros") || categoría.equals("libros") || categoría.equals("Matar a un ruiseñor") || categoría.equals("matar a un ruiseñor")|| categoría.equals("MATAR A UN RUISEÑOR")){
            System.out.println("Libros alquilados a 0.10€/día: "+"\n" + "LIBRO_1: 20 DIAS" + "\n" + "LIBRO_2: 30 DIAS" + "\n" + "LIBRO_3: 15 DIAS" + "\n" + "LIBRO_4: 14 DIAS" + "\n" + "INGRESOS: " + ingresosMesLibros + divisa + " del total");

        } else if (categoría.equals("película") || categoría.equals("Película") || categoría.equals("pelicula") || categoría.equals("peliculas") || categoría.equals("PELÍCULA") || categoría.equals("PELÍCULAS") || categoría.equals("películas") || categoría.equals("Películas")) {
            System.out.println("Películas alquiladas a 2.75€/día: "+"\n" + "PELICULA_1: 3 DIAS" + "\n" + "PELICULA_2: 6 DIAS" + "\n" + "INGRESOS: " + ingresosMesPeliculas + divisa + " del total");

        } else if (categoría.equals("JUEGOS") || categoría.equals("JUEGO") || categoría.equals("Juego") || categoría.equals("Juegos") || categoría.equals("juego") || categoría.equals("juegos")) {
            System.out.println("Videojuegos alquilados a 2.50€/día: "+"\n" + "VIDEOJUEGO_1: 30 DIAS" + "\n" + "VIDEOJUEGO_2: 29 DIAS" + "\n" + "VIDEOJUEGO_3: 10 DIAS"  + "\n" + "INGRESOS: " + ingresosMesVideojuegos + divisa + " del total");

        } else if (categoría.equals("ALBUM") || categoría.equals("ALBUMES") || categoría.equals("Album") || categoría.equals("Albumes") || categoría.equals("album") || categoría.equals("albumes")) {
            System.out.println("Albumes alquilados a 1.80€/día: "+"\n" + "ALBUM_1: 2 DIAS" + "\n" + "ALBUM_2: 7 DIAS" + "INGRESOS: " + ingresosMesAlbumes + divisa + " del total");

        } else System.out.println("Ups... No hemos encontrado nada con ese nombre. Reinicia el programa y prueba de nuevo :)");

        System.out.println("\n" + "***Ejercicio 3: Descuento***");
    }
}