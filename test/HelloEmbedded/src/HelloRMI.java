import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author rockst
 */
public class HelloRMI {
    
    public static void main (String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("HelloRMI");
            System.out.println("HelloRMI");
        }
        catch (RemoteException e) {
            System.err.println("RMI exception");
        }
    }
    
}
