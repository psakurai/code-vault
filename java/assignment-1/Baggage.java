//Baggage class is a composition to Passenger class.
//weight Stored the baggage's weight,
//pieces stored baggage's pieces,
//Carry_on_bag carry_on_bag and Excess_Baggage excess_baggage denotes the aggregation relation from Carry_on_bag and Baggage classes.
class Baggage {
  private double weight;//Store the weight of baggage
  private int pieces;//Store the number of baggage
  Carry_on_bag carry_on_bag;
  Excess_Baggage excess_baggage;

  public Baggage (double weight, int pieces, Carry_on_bag carry_on_bag, Excess_Baggage excess_baggage) {
    this.weight=weight;
    this.pieces=pieces;
    this.carry_on_bag=carry_on_bag;
  }
  public void setWeight(double weight) {
    this.weight=weight;
  }
  public void setPieces(int pieces) {
    this.pieces=pieces;
  }
  public double getWeight() {
    return weight;
  }
  public int getPieces() {
    return pieces;
  }
}
