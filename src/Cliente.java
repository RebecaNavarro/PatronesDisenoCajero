public class Cliente {

    private int pin = 1234;
    private int saldo = 100;
    private int intentos = 0;

    public int getSaldo() {
        return saldo;
    }

    public void verificarPin(int inputPin, Menu menu, Cajero cajero){
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

}
