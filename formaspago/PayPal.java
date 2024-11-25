package formaspago;

/**
 * Clase que representa el pago con PayPal.
 */
public class PayPal implements FormaPago {
    private String correo;

    // Constructor para inicializar los atributos
    public PayPal(String correo) {
        this.correo = correo;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con PayPal (Cuenta: " + correo + ")");
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Detalles del pago: Pago con PayPal - Cuenta: " + correo);
    }
}