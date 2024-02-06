import java.util.Scanner;

public class Menu {

    Cajero cajero = new Cajero();
    Scanner sc = new Scanner(System.in);
    public void iniciarMenu(){
        System.out.println("===============");
        System.out.println("¡Bienvenido!");
        System.out.println("Ingrese su pin");
        System.out.println("_ _ _ _");
        System.out.println("===============");
        int pin = sc.nextInt();
        cajero.verificarPin(pin);
        System.out.println();
    }

    public void pinIncorrecto(){
        System.out.println("===============");
        System.out.println("Pin incorrecto");
        System.out.println("Ingrese su pin");
        System.out.println("_ _ _ _");
        System.out.println("===============");
        int pin = sc.nextInt();
        cajero.verificarPin(pin);
        System.out.println();
    }

    public void menuPrincipal(){
        System.out.println("=============");
        System.out.println("Ingrese la opción que desee ejecutar: ");
        System.out.println("1. Saldo");
        System.out.println("2. Depósito");
        System.out.println("3. Retiro");
        System.out.println("4. Salir");
        System.out.println("=============");
    }

    public void menuRetiros(){
        System.out.println("=============");
        System.out.println("Ingrese la opción que desee ejecutar: ");
        System.out.println("1. 20Bs.");
        System.out.println("2. 50Bs.");
        System.out.println("3. 100Bs.");
        System.out.println("4. 200Bs.");
        System.out.println("5. Cancelar");
        System.out.println("6. Seleccionar otro monto");
        System.out.println("=============");
    }

}
