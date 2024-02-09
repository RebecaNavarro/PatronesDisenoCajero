import java.util.Scanner;

public class Menu {

    int pin;
    int cantidadDeposito;
    int cantidadRetiro;
    boolean pinEsNumero = false;
    boolean cantidadEsNumeroDep = false;
    boolean cantidadEsNumeroRet = false;
    Cliente cliente = new Cliente();
    Cajero cajero = new Cajero(cliente);
    Scanner sc = new Scanner(System.in);
    public void iniciarMenu(){
        System.out.println("===============");
        System.out.println("¡Bienvenido!");
        System.out.println("Ingrese su pin");
        System.out.println("_ _ _ _");
        System.out.println("===============");
        while (!pinEsNumero) { //recorre digito por digito
            if (sc.hasNextInt()) {//ve que lo que le sigue es un entero
                pin = sc.nextInt();
                pinEsNumero = true;
                cliente.verificarPin(pin, this, cajero);
            } else {
                System.out.println("Error: Solo se permiten números. Por favor, inténtalo de nuevo.");
                sc.next(); // Limpiar el buffer del scanner
            }
        }

    }

    public void pinIncorrecto(){
        System.out.println("===============");
        System.out.println("Pin incorrecto");
        System.out.println("Ingrese su pin");
        System.out.println("_ _ _ _");
        System.out.println("===============");
        int pin = sc.nextInt();
        cliente.verificarPin(pin, this, cajero);
        System.out.println();
    }

    public void menuPrincipal(){
        System.out.println("===============");
        System.out.println("Bienvenido al cajero automático");
        System.out.println("===============");
        System.out.println("Ingrese la opción que desee ejecutar: ");
        System.out.println("1. Saldo");
        System.out.println("2. Depósito");
        System.out.println("3. Retiro");
        System.out.println("4. Salir");
        System.out.println("===============");
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
                    while (!cantidadEsNumeroDep) {
                        if (sc.hasNextInt()) {
                            cantidadDeposito = sc.nextInt();
                            cantidadEsNumeroDep = true;
                            cajero.deposito(cantidadDeposito);
                            menuPrincipal();
                        } else {
                            System.out.println("Error: Solo se permiten números. Por favor, inténtalo de nuevo.");
                            sc.next(); // Limpiar el buffer del scanner
                        }
                    }

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
        System.out.println("===============");
        System.out.println("Ingrese la opción que desee ejecutar: ");
        System.out.println("1. 20Bs.");
        System.out.println("2. 50Bs.");
        System.out.println("3. 100Bs.");
        System.out.println("4. 200Bs.");
        System.out.println("5. Seleccionar otro monto");
        System.out.println("6. Cancelar");
        System.out.println("===============");

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
                // Bucle hasta que se introduzca un número válido
                while (!cantidadEsNumeroRet) {
                    if (sc.hasNextInt()) {
                        cantidadRetiro = sc.nextInt();
                        cantidadEsNumeroRet = true;
                        cajero.retiro(cantidadRetiro);
                        menuPrincipal();
                    } else {
                        System.out.println("Error: Solo se permiten números. Por favor, inténtalo de nuevo.");
                        sc.next(); // Limpiar el buffer del scanner
                    }
                }


            }
            case 6:{
                menuPrincipal();
            }
        }
    }

}
