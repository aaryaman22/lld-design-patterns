package mediatorpattern;

// Client
public class AuctionDemo {

    public static void main(String[] args) {

        System.out.println("\n###### Mediator Design Pattern ######");

        System.out.println("\n===> Welcome to the Auction House!\n");

        // Create Mediator
        AuctionMediator auctionHouse =
                new AuctionHouse("Vintage Guitar", 100.0);

        // Create Colleagues
        IColleague alice = new Bidder("Alice", auctionHouse);

        IColleague bob = new Bidder("Bob", auctionHouse);

        IColleague charlie = new Bidder("Charlie", auctionHouse);

        // Use colleagues
        alice.placeBid(150.0);

        bob.placeBid(250.0);

        charlie.placeBid(300.0);

        alice.placeBid(300.0); // rejected

        bob.placeBid(900.0); // winner

        // Close auction
        auctionHouse.closeAuction();
    }
}