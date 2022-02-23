import java.net.*;
import java.io.*;

public class Zadacha5 {
    public static void main(String[] args) throws Exception {
        URL sURL = new URL( "http://www.devbg.org/forum/index.php");
        System.out.println("[protocol] = " + sURL.getProtocol());
        System.out.println("[server] = " + sURL.getAuthority());
        System.out.println("[resource] = " + sURL.getPath());
    }

}
