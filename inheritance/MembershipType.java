package q1;

public class MembershipType {
    public MembershipType(){

    }

    public static MembershipType setMembership(int points){

        if(points > 0 && points < 10){
            return new BronzeMember();
        }
        else if(points >= 10 && points <= 19){
            return new SilverMember();
        }
        return new GoldMember();
    }


}
