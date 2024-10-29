import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        double conversion = 0;
        double valorAConvertir;
        ApiMonedas consultar = new ApiMonedas();


        //Mensaje de bienvenida y opciones
        String mostrarMensaje = """
                *********************************\n
                ¡Sea bienvenido/a al conversor de monedas!\n
                1) Dólar a Peso argentino
                2) Peso argentino a Dólar
                3) Dólar a Real brasileño
                4) Real brasileño a Dólar
                5) Dólar a Peso colombiano
                6)Peso colombiano a Dólar
                7)Salir\n
                Escriba el número de la opción deseada:\n
                *********************************\n
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion !=7) {
             System.out.println(mostrarMensaje);
             opcion = teclado.nextInt();
             teclado.nextLine();

              switch (opcion){
                  case 1:
                      System.out.println("¿Cual es el valor que desea convertir?: ");
                      valorAConvertir = teclado.nextDouble();
                      System.out.println("Valor a convertir: " + valorAConvertir);
                      System.out.printf("%.2f Dólares son %.2f Pesos Argentinos%n", valorAConvertir, ConversorDeMonedas.convertir(valorAConvertir + "","USD","ARS", consultar));
                      break;
                  case 2:
                      System.out.println("¿Cuál es el valor que desea convertir?: ");
                      valorAConvertir = teclado.nextDouble();
                      System.out.println("Valor a convertir: " + valorAConvertir);
                      System.out.printf("%.2f Pesos Argentinos son %.2f Dólares%n", valorAConvertir, ConversorDeMonedas.convertir(valorAConvertir + "", "ARS", "USD",  consultar));
                      break;
                  case 3:
                      System.out.println("¿Cuál es el valor que desea convertir?: ");
                      valorAConvertir = teclado.nextDouble();
                      System.out.println("Valor a convertir: " + valorAConvertir);
                      System.out.printf("%.2f Dólares son %.2f Reales Brasileños%n", valorAConvertir, ConversorDeMonedas.convertir(valorAConvertir + "", "USD", "BRL", consultar));
                      break;
                  case 4:
                      System.out.println("¿Cuál es el valor que desea convertir?: ");
                      valorAConvertir = teclado.nextDouble();
                      System.out.println("Valor a convertir: " + valorAConvertir);
                      System.out.printf("%.2f Reales Brasileños son %.2f Dólares%n", valorAConvertir, ConversorDeMonedas.convertir(valorAConvertir + "", "BRL", "USD", consultar));
                      break;
                  case 5:
                      System.out.println("¿Cuál es el valor que desea convertir?: ");
                      valorAConvertir = teclado.nextDouble();
                      System.out.println("Valor a convertir: " + valorAConvertir);
                      System.out.printf("%.2f Dólares son %.2f Pesos Colombianos%n", valorAConvertir, ConversorDeMonedas.convertir(valorAConvertir + "", "USD", "COP", consultar));
                      break;
                  case 6:
                      System.out.println("¿Cuál es el valor que desea convertir?: ");
                      valorAConvertir = teclado.nextDouble();
                      System.out.println("Valor a convertir: " + valorAConvertir);
                      System.out.printf("%.2f Pesos Colombianos son %.2f Dólares%n", valorAConvertir, ConversorDeMonedas.convertir(valorAConvertir + "", "COP","USD" , consultar));
                      break;
                  case 7:
                      System.out.println("Saliendo del programa, ¡Gracias por utilizar el Conversor de Monedas!");
                      break;
                  default:
                      System.out.println("Opción no válida");
              }
        }
    }
}

