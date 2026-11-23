package back_end;

public class NodoTrabajo {
    public Trabajo dato;
    public NodoTrabajo siguiente;

    public NodoTrabajo(Trabajo dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}