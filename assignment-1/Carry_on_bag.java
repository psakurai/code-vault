//Carry_on_bag class is an aggregation to Baggage class.
//pieces Stored the number of carry on bag,
//weight stored the weight of carry on bag.
class Carry_on_bag {
  private int pieces;
  private double weight;

  public Carry_on_bag (int pieces, double weight) {
    this.pieces=pieces;
    this.weight=weight;
  }
  public int getPieces() {
    return pieces;
  }
  public double getWeight() {
    return weight;
  }
}
