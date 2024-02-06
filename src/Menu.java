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
        cajero.verificarPin(pin, this);
        System.out.println();
    }

    public void pinIncorrecto(){
        System.out.println("===============");
        System.out.println("Pin incorrecto");
        System.out.println("Ingrese su pin");
        System.out.println("_ _ _ _");
        System.out.println("===============");
        int pin = sc.nextInt();
        cajero.verificarPin(pin, this);
        System.out.println();
    }

    public void menuPrincipal(){
        System.out.println("=============");
        System.out.println("Bienvenido al cajero automático");
        System.out.println("=============");
        System.out.println("Ingrese la opción que desee ejecutar: ");
        System.out.println("1. Saldo");
        System.out.println("2. Depósito");
        System.out.println("3. Retiro");
        System.out.println("4. Salir");
        System.out.println("=============");
        int opcion;
        do {
            opcion = sc.nextInt();
            switch (opcion) {
                case 1: {
                    cajero.consultarSaldo();
                    menuPrincipal();
                }
                case 2: {
                    System.out.println("Ingresa el monto que deseas depositar");
                    int cantidad = sc.nextInt();
                    cajero.deposito(cantidad);
                    menuPrincipal();
                }
                case 3: {
                    menuRetiros();
                }
                case 4: {
                    System.out.println("Gracias por usar nuestro cajero!");
                    break;
                }
                default: {
                    System.out.println("Ingresa una opción válida: ");
                }
            }
        }while (opcion!=5);
    }

    public void menuRetiros(){
        System.out.println("=============");
        System.out.println("Ingrese la opción que desee ejecutar: ");
        System.out.println("1. 20Bs.");
        System.out.println("2. 50Bs.");
        System.out.println("3. 100Bs.");
        System.out.println("4. 200Bs.");
        System.out.println("5. Seleccionar otro monto");
        System.out.println("6. Cancelar");
        System.out.println("=============");

        int opcion = sc.nextInt();
        switch (opcion){
            case 1:{
                cajero.retiro(20);
                menuPrincipal();
            }
            case 2:{
                cajero.retiro(50);
                menuPrincipal();
            }
            case 3:{
                cajero.retiro(100);
                menuPrincipal();
            }
            case 4:{
                cajero.retiro(200);
                menuPrincipal();
            }
            case 5:{
                System.out.println("Ingresa el monto que deseas retirar:");
                int cantidad = sc.nextInt();
                cajero.retiro(cantidad);
                menuPrincipal();
            }
            case 6:{
                menuPrincipal();
            }
        }
    }

}
