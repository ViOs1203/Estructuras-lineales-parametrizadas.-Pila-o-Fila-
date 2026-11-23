package back_end;

public class Articulo extends Trabajo {
    private String nombreConferencia;

    public Articulo(String titulo, String autor, int anioPublicacion, String nombreConferencia) {
        super(titulo, autor, anioPublicacion);
        this.nombreConferencia = nombreConferencia;
    }

    public String getNombreConferencia() { return nombreConferencia; }

    @Override
    public String toString() {
        return "[ARTÍCULO] " + super.toString() + " | Conferencia: " + nombreConferencia;
    }
}