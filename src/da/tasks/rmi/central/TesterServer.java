package da.tasks.rmi.central;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class TesterServer {
    public static void main(String[] args) {
        try {
            ServiceImpl service = new ServiceImpl();
            Naming.rebind("ServiceImpl", service);
        } catch (RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}