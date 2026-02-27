package miPrincipal;

// Libro.java
// Clase para implementar un Libro y el precio del libro

public class Libro {
    // Atributos
    private String ISBN;        // ISBN del libro de 13 dígitos
    private String titulo;      // Título del libro
    private String autor;       // Autor del libro
    private int numeroPaginas; // Número de páginas del libro

    // Constructor
    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        // Mandar llamar a los métodos set de los atributos
    }

    // Métodos set/get
    public void setISBN(String ISBN) {
        // El ISBN debe tener 13 dígitos, si no es válido se asigna el ISBN por defecto
    }

    public void setTitulo(String titulo) {
        // El título no se v+alida
    }

    public void setAutor(String autor) {
        // El autor no se valida
    }

    public void setNumeroPaginas(int numeroPaginas) {
        // El número de páginas debe ser mayor o igual que 0, si no es válido se asigna 0
    }

    public String getISBN() {
        return "";
    }

    public String getTitulo() {
        return "";
    }

    public String getAutor() {
        return "";
    }

    public int getNumeroPaginas() {
        return 0;
    }

    // Método de instancia para calcular el precio del libro
    public double calcularPrecio() {
        // El precio por página es 1.50
        // El precio total es el precio por páginas
        return 0.0;
    }

    // Sobrescribir el método toString() para mostrar la información del libro
    @Override
    public String toString() {
        String temporal = String.format( "Libro: ISBN=%s, Título=%s, Autor=%s, Número de páginas=%d", 
                                    ISBN, titulo, autor, numeroPaginas);
        return temporal;
    }
}
