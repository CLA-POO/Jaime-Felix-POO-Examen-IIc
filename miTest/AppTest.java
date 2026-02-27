package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Libro l;

    @BeforeAll public static void setUp() {
        l = new Libro("9780134685991", "Java: A Beginner's Guide", "Herbert Schildt", 820);
    }

    @Test public void testISBN() {
        assertTrue(l.getISBN().equals("9780134685991"));
    }

    @Test public void testAutor() {
        assertTrue(l.getAutor().equals("Herbert Schildt"));
    }

    @Test public void testNumeroPaginas() {
        assertTrue(l.getNumeroPaginas() == 820);
    }

    @Test public void testPrecio() {
        assertTrue(l.calcularPrecio() == 820 * 1.5);
    }
}