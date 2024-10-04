public class Main {
    public static void main(String[] args) {

        AuctionMediator auctionMediatorObj = new Auction();
        AuctionMediator auctionMediatorObj1 = new Auction();

        Colleague bidder1 = new Bidder("A1 ", auctionMediatorObj);
        Colleague bidder2 = new Bidder("B1 ", auctionMediatorObj);

        Colleague bidder3 = new Bidder("A2 ", auctionMediatorObj1);
        Colleague bidder4 = new Bidder("B2 ", auctionMediatorObj1);

        bidder1.placeBid(10000);
        bidder2.placeBid(20000);

        bidder3.placeBid(30000);
        bidder4.placeBid(100000);
    }
}