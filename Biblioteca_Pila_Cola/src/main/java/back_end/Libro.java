package back_end;

public class Libro extends Trabajo {
    private int numeroPaginas;

    public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas) {
        super(titulo, autor, anioPublicacion);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() { return numeroPaginas; }

    @Override
    public String toString() {
        return "[LIBRO] " + super.toString() + " | Páginas: " + numeroPaginas;
    }
}