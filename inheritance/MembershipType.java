package q1;

public class MembershipType {
    private int maxTradesPerDay;
    public MembershipType(){

    }

    public void setMaxTradesPerDay(int numOfTradesPerDay) {
        this.maxTradesPerDay = numOfTradesPerDay;
    }

    public int getMaxTradesPerDay() {
        return maxTradesPerDay;
    }

    public static MembershipType assignMembership(int points){

        if(points > 0 && points < 10){
            return new BronzeMember();
        }
        else if(points >= 10 && points <= 19){
            return new SilverMember();
        }
        return new GoldMember();
    }

    public static boolean canTrade(int numOfTrades, MembershipType membership, double totalTradesToday){
        if (membership instanceof  BronzeMember && numOfTrades <= 5){
            System.out.println("bronze");

            return true;
        }
        if (membership instanceof  SilverMember && numOfTrades <= 10) {
            System.out.println("silver");
            return ((SilverMember) membership).hasReachedLimit(totalTradesToday);
        }
        if (membership instanceof  GoldMember && numOfTrades <= 20) {
            System.out.println("gold");
            return  true;
        }
        return false;
    }


}
