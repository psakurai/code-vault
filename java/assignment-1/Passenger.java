//Passenger class is a composition to TestBaggage class.
//Name Stored the passenger's name,
//Destination stored passenger's destination,
//private seat baggage is for composition relation from baggage class,
//while Seat seat and MembershipTest membership denotes the aggregation relation from Seat and MembershipTest classes.
class Passenger {
  private String name;
  private String destination;
  private Baggage baggage;
  Seat seat;
  MembershipTest membership;

  public Passenger (String name, String destination, Seat seat, MembershipTest membership) {
    this.name=name;
    this.destination=destination;
    this.seat=seat;
    this.membership=membership;
  }
  public String getName() {
    return name;
  }
  public String getDestination() {
    return destination;
  }
}
