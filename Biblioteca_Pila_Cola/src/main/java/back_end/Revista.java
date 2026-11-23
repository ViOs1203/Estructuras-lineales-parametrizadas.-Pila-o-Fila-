package back_end;

public class Revista extends Trabajo {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int anioPublicacion, int numeroEdicion) {
        super(titulo, autor, anioPublicacion);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() { return numeroEdicion; }

    @Override
    public String toString() {
        return "[REVISTA] " + super.toString() + " | Edición N.º: " + numeroEdicion;
    }
}
