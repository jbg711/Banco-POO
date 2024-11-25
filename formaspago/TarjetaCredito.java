package formaspago;

/**
 * Clase que representa el pago con tarjeta de crédito.
 */
public class TarjetaCredito implements FormaPago {
    private String numeroTarjeta;
    private String banco;

    // Constructor para inicializar los atributos
    public TarjetaCredito(String numeroTarjeta, String banco) {
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " con tarjeta de crédito " + banco);
    }

    @Override
    public void imprimirDetalles() {
        String terminacion = numeroTarjeta.substring(numeroTarjeta.length() - 4);
        System.out.println("Detalles del pago: Pago con tarjeta de crédito " + banco + " - Número: **** " + terminacion);
    }
}