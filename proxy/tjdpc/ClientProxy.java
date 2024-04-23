package tjdpc;

public class ClientProxy {
    public static void main(String [] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("jasonfedin.org");
            internet.connectTo("whatever.com");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}