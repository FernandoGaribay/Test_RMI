
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MiClaseRemota extends UnicastRemoteObject implements MiInterfazRemota {

    public MiClaseRemota() throws RemoteException {
        // Código del constructor
    }

    public void miMetodo1() throws RemoteException {
        // Aquí ponemos el código que queramos
        System.out.println("Estoy en miMetodo1()");
    }

    public int miMetodo2() throws RemoteException {
        // Aquí ponemos el código que queramos
        return 5;
    }

    public void otroMetodo() {
        //
        //
    }

    public static void main(String[] args) {

        try {
            Registry registry = LocateRegistry.createRegistry(Integer.parseInt("1234")); // args[0]

            MiInterfazRemota mir = new MiClaseRemota();

            // Local Host
            /*
            java.rmi.Naming.rebind("//"
                    + java.net.InetAddress.getLocalHost().getHostAddress()
                    + ":" + "1234" + "/PruebaRMI", mir); // args[0], args[1]
            */

            // Ip del servidor remoto
            java.rmi.Naming.rebind("//"
                    + "192.168.1.87"
                    + ":" + "1234" + "/PruebaRMI", mir); // args[0] = , args[1]
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
