package formaspago;

/**
 * Clase que representa el pago por transferencia bancaria.
 */
public class TransferenciaBancaria implements FormaPago {
    private String numeroCuenta;
    private String banco;

    // Constructor para inicializar los atributos
    public TransferenciaBancaria(String numeroCuenta, String banco) {
        this.numeroCuenta = numeroCuenta;
        this.banco = banco;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando transferencia bancaria de $" + monto + " desde la cuenta " + numeroCuenta + " " + banco);
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Detalles del pago: Pago por transferencia bancaria " + banco + " - Cuenta: " + numeroCuenta);
    }
}