//MembershipTest class is an aggregation to Passenger class.
//The enum membership denote the 3 type of passenger's membership,
//abbreviation stored the extra weight for different membership,
//membership stored the type of passenger's membership,
//value stored the passenger extra weight depending on their membership.
enum Membership {
  SILVER("5"),
  GOLD("10"),
  PLATINUM("15");

  private String abbreviation;
	private Membership(String abbreviation)
	{
		this.abbreviation=abbreviation;
	}
	public String getAbbreviation()
	{
		return abbreviation;
	}
}
class MembershipTest {
  String membership;
  double value;
  public MembershipTest(String membership) {
    this.membership=membership;
  }
  public void setValue(double value) {
    this.value=value;
  }
  public double getValue() {
    return value;
  }
}
