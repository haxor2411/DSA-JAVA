package AlgoComputerNetworks;

import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class IpAddressOfsystem {
    public static void main(String[] args) throws UnknownHostException, java.net.UnknownHostException {
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println("IP Address of the System: " + localhost.getHostAddress()); 
    }                                      
}
