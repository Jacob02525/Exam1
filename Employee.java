/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;
// question 11
    {
        Public int getYearOfBirth(); 
        System.out.println(yearOfBirth);
    int setYearOfBirth();
    Sysem.out.printl(yearOfBirth)
    
    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    // Question 12
    public boolean canDrive(){
        int age = calculateAge(2025);
        if (age >= 16) {
            System.out.println("You are eligible to drive");
        } else if (age < 16) {
            Sytem.out.println("Not eliible. You nee to wait" + (18 - age") 
            + "Year to be eligible to drive.");
        }
    
        }
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    // Question 13
    private double calculatePay() {
        unpaidHours * hourlyage/0.3 = Salary;
        Print (Salary);
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    //Question 14
    public void paySalary(){
       System.ot.println(fullName + "is going to be paid: " + hourlyWage);
         unpaidHour = 0;
    }
}