//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


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

    Scanner sc = new Scanner (System.in);
    System.out.println("Para consultar el precio de nuestros títulos disponibles prueba a escribir 'Precios':");
    String precios = sc.nextLine();
    System.out.println("Actualmente tenemos en el catálogo:");
        System.out.println("-El libro " + Libro + " publicado en " +añoLibro+ " por " +precioDiaLibro+ "€ al día");
        System.out.println("-La película " + Pelicula + " publicada en " +añoPelicula+ " por " +precioDiaPelicula+ "€ al día");
        System.out.println("-El album " + Album + " publicado en " +añoAlbum+ " por " +precioDiaAlbum+ "€ al día");
        System.out.println("-El videojuego " + Videojuego + " publicado en " +añoVideojuego+ " por " +precioDiaVideojuego+ "€ al día");



    }
}