package store;

public class Intern extends AbstractStoreEmployee {
  private String mentorName;

  private static final double INTERN_PAY_RATE = 8.0;

  public Intern(double numberOfHoursWorked, String storeDetails, String employeeName, String mentorName) {
    super(numberOfHoursWorked, 0, storeDetails, 0, employeeName);
    this.mentorName = mentorName;
  }

  @Override
  public double calculateCommission() {
    return super.calculateCommission();
  }

  @Override
  public double calculatePay() {
    return (super.getBasePay() + calculateCommission() + (super.getNumberOfHoursWorked() * super.getHourlyRate()))
        * INTERN_PAY_RATE;
  }

  @Override
  public boolean checkPromotionEligibility() {
    return getNumberOfHoursWorked() >= 200;
  }

  /**
   * Sets the intern's mentor name.
   *
   * @param mentorName The mentor's name to be set.
   */
  public void setMentorName(String mentorName) {
    // Add logic to set the mentor's name
    this.mentorName = mentorName;
  }

  /**
   * Returns the mentor's name for the intern.
   *
   * @return The mentor's name for the intern.
   */
  public String getMentorName() {
    return mentorName;
  }

  @Override
  public String toString() {
    // Customize the toString() method as needed
    return super.toString() + "\nMentor Name: " + getMentorName();
  }

  @Override
  public void performDailyTasks() {
    System.out.println("Learning and contributing to various tasks as an intern.");
  }

  // Implementing abstract method from Store interface
  @Override
  public double calculatePerformanceBonus() {
    return 0; // Interns may not receive a performance bonus
  }

  @Override
  public double calculateEmployeeContribution() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calculateEmployeeContribution'");
  }

}
