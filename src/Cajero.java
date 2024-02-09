public class Cajero {

    private int saldo;

    public Cajero (Cliente client){
        saldo = client.getSaldo();
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