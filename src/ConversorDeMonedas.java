import java.util.Scanner;

public class ConversorDeMonedas {
    public static double convertir(String valorAConvertir, String tipoDeMonedaOrigen, String tipoDeMonedaDestino, ApiMonedas consulta) {
        Monedas monedas = consulta.buscarMoneda(tipoDeMonedaOrigen, tipoDeMonedaDestino);

        if (monedas == null) {
            System.out.println("No se encuentra la tasa para realizar la conversión");
            return 0;
        }

        try {
            double cantidad = Double.parseDouble(valorAConvertir);
            return cantidad * monedas.conversion_rate();
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un número válido");
            return 0;
        }
    }
}
