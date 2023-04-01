public class Main {
    public static void main(String[] args) {
        Client client = new Client("emma", "odametey");
        Trade trade1 = new Trade("AP", "APPL", 10, 20 );
        for(int i =0; i < 6; i++){
            client.newTrade(trade1);
        }
        System.out.println(client.getMembership());
    }
}