public class Client {
    private String firstname;
    private String lastname;
    private int points;
    private Trade[] trade;
    private double totalTradesToday;


    private MembershipType membership;

    public Client(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        this.points = 0;
        this.membership = null;
    }

    public void newTrade(Trade trade){
        points++;
        membership = MembershipType.assignMembership(points);

    }
    public MembershipType getMembership() {
        return membership;
    }

    public int getPoints() {
        return points;
    }



    public void addTrade(Trade trade){

    }


}
