public class Cajero {

    //private Cliente cliente();

    private int saldo = 100;
    private int pin = 1234;

    Menu menu = new Menu();
    public void verificarPin(int inputPin){
        for(int intentos = 0 ; intentos < 3; intentos++){
            if(inputPin == pin){
                menu.menuPrincipal();
            } else {
                menu.pinIncorrecto();
            }

    }

    public void deposito(int cantidad){
        saldo += cantidad;
    }

    public void retiro(int cantidad){
        if(cantidad > saldo){
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= cantidad;
        }
        System.out.println("Tu saldo es " + saldo);
    }

}
