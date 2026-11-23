package back_end;

public abstract class Trabajo {
    protected String titulo;
    protected String autor;
    protected int anioPublicacion;

    public Trabajo(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    @Override
    public String toString() {
        return "\"" + titulo + "\" | Autor: " + autor + " (" + anioPublicacion + ")";
    }
}