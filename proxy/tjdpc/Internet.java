package tjdpc;

interface Internet {
    void connectTo(String serverhost) throws Exception;
}

class RealInternet implements Internet {
    @Override
    public void connectTo(String serverhost) {
        System.out.println("Connecting to " + serverhost);
    }
}
