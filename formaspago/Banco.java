package formaspago;

/**
 * Clase base para representar bancos.
 */
public abstract class Banco {
    protected String nombre;

    public Banco(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
