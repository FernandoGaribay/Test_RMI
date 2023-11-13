import java.rmi.Naming;

public class MiClienteRMI {

    public static void main(String[] args) {
        try {
            //MiInterfazRemota mir = (MiInterfazRemota)Naming.lookup("//" + args[0] + ":" + args[1] + "/PruebaRMI");
            MiInterfazRemota mir = (MiInterfazRemota) Naming.lookup("//192.168.1.82:1234/PruebaRMI");

            // Imprimimos miMetodo1() tantas veces como devuelva miMetodo2()
            for (int i = 1; i <= mir.miMetodo2(); i++) {
                mir.miMetodo1();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
