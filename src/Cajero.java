public class Cajero {

    private int saldo = 1000;
    private int pin = 1234;
    private int intentos = 0;

    public void verificarPin(int inputPin, Menu menu){
        if (inputPin == pin) {
            menu.menuPrincipal();
        } else {
            intentos++;
            if(intentos<3){
                menu.pinIncorrecto();
            }else if(intentos>=3){
                intentos = 0;
                System.out.println("");
                System.out.println("Cantidad de intentos sobrepasada, vuelva a intentar en 10 segundos");
                System.out.println("");
                try {
                    Thread.sleep(10*1000);
                }
                catch (Exception e) {
                    System.out.println("");
                    System.out.println(e);
                    System.out.println("");
                }
                menu.iniciarMenu();
            }
        }
    }

    public void deposito(int cantidad){
        saldo += cantidad;
        System.out.println("");
        System.out.println("Tu saldo actual es: " + saldo);
        System.out.println("");
    }

    public void retiro(int cantidad){
        if(cantidad > saldo){
            System.out.println("");
            System.out.println("Saldo insuficiente para realizar el retiro");
            System.out.println("");
        } else {
            saldo -= cantidad;
        }
        System.out.println("");
        System.out.println("Tu saldo actual es: " + saldo);
        System.out.println("");
    }
     public void consultarSaldo(){
         System.out.println("");
         System.out.println("El saldo actual es: " + saldo);
         System.out.println("");
     }

}