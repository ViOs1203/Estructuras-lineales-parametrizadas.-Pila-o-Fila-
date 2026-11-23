package back_end;

public class PilaTrabajosLIFO {
    private NodoTrabajo tope;
    private int tamanio;

    public PilaTrabajosLIFO() {
        this.tope = null;
        this.tamanio = 0;
    }

    public void push(Trabajo trabajo) {
        if (trabajo == null) {
            throw new IllegalArgumentException("El trabajo no puede ser nulo.");
        }
        NodoTrabajo nuevo = new NodoTrabajo(trabajo);
        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public Trabajo pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía. No hay elementos para desapilar.");
        }
        Trabajo trabajoExtraido = tope.dato;
        tope = tope.siguiente;
        tamanio--;
        return trabajoExtraido;
    }

    public Trabajo peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía. No hay elemento en el tope.");
        }
        return tope.dato;
    }

    public boolean isEmpty() {
        return tope == null;
    }

    public void vaciarPila() {
        tope = null;
        tamanio = 0;
    }

    public int getTamanio() {
        return tamanio;
    }

    // Genera la representación visual identificando el Tope
    public String obtenerEstadoVisual() {
        if (isEmpty()) {
            return "=== PILA VACÍA ===\n(No hay documentos registrados en este momento)";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("=== ESTADO ACTUAL DE LA PILA (Total: ").append(tamanio).append(") ===\n\n");

        NodoTrabajo actual = tope;
        int posicion = tamanio;
        boolean esTope = true;

        while (actual != null) {
            if (esTope) {
                sb.append(" [TOPE ->] ").append(posicion).append(". ").append(actual.dato.toString()).append("\n");
                sb.append(" -----------------------------------------------------------------------\n");
                esTope = false;
            } else {
                sb.append("           ").append(posicion).append(". ").append(actual.dato.toString()).append("\n");
            }
            actual = actual.siguiente;
            posicion--;
        }
        sb.append("\n=== BASE DE LA PILA ===");
        return sb.toString();
    }
}