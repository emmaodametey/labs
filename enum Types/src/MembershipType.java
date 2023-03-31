public enum MembershipType {

    BRONZE(5){
        public boolean canTrade(int numOfTrades, double totalTradesToday){
            if(numOfTrades < BRONZE.maxTrades){
                return true;
            }
            return false;
        }
    },
    GOLD(10){
        public boolean canTrade(int numOfTrades, double totalTradesToday){
            if(numOfTrades < GOLD.maxTrades){
                return true;
            }
            return false;
        }
    },
    SILVER(20){
        private double maxTradeValue = 10000;
        public boolean canTrade(int numOfTrades, double totalTradesToday){
            if(numOfTrades < SILVER.maxTrades){
                return hasReachedLimit(totalTradesToday);
            }
            return false;
        }

        public boolean hasReachedLimit(double totalTradesToday){
            if(totalTradesToday < maxTradeValue){
                return  true;
            }
            return false;
        }
    };

    int maxTrades;

    MembershipType(int maxNumberOfTrades){
        maxTrades = maxNumberOfTrades;

    }
    public static MembershipType assignMembership(int points){

        if(points > 0 && points < 10){
            return BRONZE;
        }
        else if(points >= 10 && points <= 19){
            return SILVER;
        }
        return GOLD;
    }


    public abstract boolean canTrade(int numOfTrades, double totalTradesToday);

}
