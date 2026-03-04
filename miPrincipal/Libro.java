package miPrincipal;

// Libro.java
// Clase para implementar un Libro y el precio del libro

public class Libro {
    // Atributos
    private String ISBN;        // ISBN del libro de 13 digitos
    private String titulo;      // Titulo del libro
    private String autor;       // Autor del libro
    private int numeroPaginas; // Numero de paginas del libro

    // Constructor
    public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
        // Mandar llamar a los metodos set de los atributos
    }

    // Metodos set/get
    public void setISBN(String ISBN) {
        // El ISBN debe tener 13 digitos, si no es valido se asigna el ISBN por defecto
    }

    public void setTitulo(String titulo) {
        // El titulo no se valida
    }

    public void setAutor(String autor) {
        // El autor no se valida
    }

    public void setNumeroPaginas(int numeroPaginas) {
        // El numero de paginas debe ser mayor o igual que 0, si no es valido se asigna 0
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

    // Metodo de instancia para calcular el precio del libro
    public double calcularPrecio() {
        // El precio por pagina es 1.50
        // El precio total es el precio por paginas multiplicado por el numero de paginas
        return 0.0;
    }

    // Sobrescribir el metodo toString() para mostrar la informacion del libro
    @Override
    public String toString() {
        String temporal = String.format( "Libro: ISBN=%s, Titulo=%s, Autor=%s, Numero de paginas=%d", 
                                    ISBN, titulo, autor, numeroPaginas);
        return temporal;
    }
}
