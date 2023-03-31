package q1;

public class SilverMember extends MembershipType{
    private double maxvalue = 10000;
    public SilverMember() {
        super();
        setMaxTradesPerDay(10);
    }

    public void setMaxvalue(double maxvalue){
        this.maxvalue = maxvalue;
    }

    public double getMaxvalue() {
        return maxvalue;
    }

    public boolean hasReachedLimit(double totalTradesToday){
        if(totalTradesToday < maxvalue){
            return  true;
        }
        return false;
    }
}
