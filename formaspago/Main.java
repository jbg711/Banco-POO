package formaspago;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String opcion = JOptionPane.showInputDialog(
                "Seleccione una forma de pago:\n" +
                "1. Tarjeta de Crédito\n" +
                "2. Efectivo\n" +
                "3. Transferencia Bancaria\n" +
                "4. PayPal\n" +
                "5. Salir"
            );

            if (opcion == null || opcion.equals("5")) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                continuar = false;
            } else {
                double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a pagar:"));
                switch (opcion) {
                    case "1":
                        String numeroTarjeta = JOptionPane.showInputDialog("Ingrese el número de tarjeta:");
                        String banco = JOptionPane.showInputDialog("Seleccione el banco:\n1. Banamex\n2. Banorte\n3. Santander\n4. Banregio");
                        TarjetaCredito tarjeta = new TarjetaCredito(numeroTarjeta, obtenerNombreBanco(banco));
                        tarjeta.procesarPago(monto);
                        tarjeta.imprimirDetalles();
                        break;
                    case "2":
                        Efectivo efectivo = new Efectivo();
                        efectivo.procesarPago(monto);
                        efectivo.imprimirDetalles();
                        break;
                    case "3":
                        String numeroCuenta = JOptionPane.showInputDialog("Ingrese el número de cuenta:");
                        banco = JOptionPane.showInputDialog("Seleccione el banco:\n1. Banamex\n2. Banorte\n3. Santander\n4. Banregio");
                        TransferenciaBancaria transferencia = new TransferenciaBancaria(numeroCuenta, obtenerNombreBanco(banco));
                        transferencia.procesarPago(monto);
                        transferencia.imprimirDetalles();
                        break;
                    case "4":
                        String correo = JOptionPane.showInputDialog("Ingrese el correo de su cuenta PayPal:");
                        PayPal paypal = new PayPal(correo);
                        paypal.procesarPago(monto);
                        paypal.imprimirDetalles();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Inténtalo de nuevo.");
                }
            }
        }
    }

    private static String obtenerNombreBanco(String opcion) {
        switch (opcion) {
            case "1":
                return "Banamex";
            case "2":
                return "Banorte";
            case "3":
                return "Santander";
            case "4":
                return "Banregio";
            default:
                return "Banco Desconocido";
        }
    }
}