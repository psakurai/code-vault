//Excess_Baggage class is an aggregation to Baggage class.
//payment Stored the type of payment used by passenger,
//charge stored the charge for excess baggage.
class Excess_Baggage {
  private String payment;
  private double charge;

  public Excess_Baggage (String payment) {
    this.payment=payment;
  }
  public void setCharge(double charge) {
    this.charge=charge;
  }
  public String getPayment() {
    return payment;
  }
  public double getCharge() {
    return charge;
  }
}
