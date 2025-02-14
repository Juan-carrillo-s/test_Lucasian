import java.util.Scanner;

public class FacturaElectronica{

    public static double calcularDescuento(int totalCompra) {
        if (totalCompra >= 200000) {
            return totalCompra * 0.15;
        } else if (totalCompra >= 50000) {
            return totalCompra * 0.02;
        } else if (totalCompra >= 20000) {
            return totalCompra * 0.015;
        } else {
            return 0;
        }
    }

    public static String generarFactura(String nombre, int totalCompra, double descuento, double totalPagar) {
        return String.format(
                "-----------------------------\n" +
                        "Factura de Cobro\n" +
                        "\n" +
                        "Nombre del Comprador: %s\n" +
                        "Total de la Compra: $%d\n" +
                        "Descuento Aplicado: $%.2f\n" +
                        "Total a Pagar: $%.2f\n" +
                        "-----------------------------\n" +
                        "  ¡Gracias por su compra!\n", nombre, totalCompra, descuento, totalPagar);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del comprador: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el total de la compra: ");
        int totalCompra = scanner.nextInt();

        double descuento = calcularDescuento(totalCompra);
        double totalPagar = totalCompra - descuento;

        String factura = generarFactura(nombre, totalCompra, descuento, totalPagar);
        System.out.println(factura);

        scanner.close();
    }
}
