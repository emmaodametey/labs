package q1;

public class Client {
    private String firstname;
    private String lastname;
    private int points;

    private MembershipType membership;

    public Client(String first, String last){
        this.firstname = first;
        this.lastname = last;
        this.points = 0;
        this.membership = null;
    }

    public void addTrade(Trade trade){
        points++;
        membership = MembershipType.setMembership(points);

    }

    public MembershipType getMembership() {
        return membership;
    }

    public int getPoints() {
        return points;
    }
}
