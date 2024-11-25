package formaspago;

/**
 * Clase que representa el pago en efectivo.
 */
public class Efectivo implements FormaPago {
    private double monto;

    // Constructor para inicializar los atributos
    public Efectivo() {
        this.monto = 0.0; // Inicializamos el monto por defecto
    }

    @Override
    public void procesarPago(double monto) {
        this.monto = monto;
        System.out.println("Procesando pago de $" + monto + " en efectivo.");
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Detalles del pago: Pago en efectivo.");
    }
}