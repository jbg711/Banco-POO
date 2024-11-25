package formaspago;

/**
 * Interfaz que define el método común para todas las formas de pago.
 */
public interface FormaPago {
    void procesarPago(double monto); 
    void imprimirDetalles();      
    
}