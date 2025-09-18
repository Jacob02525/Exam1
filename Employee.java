/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee {
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;
// Question 11
    
    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
        
        int getYearOfBirth; 
        System.out.println(yearOfBirth);
    int setYearOfBirth;
    return yearOfBirth;
        
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
            return true;
        } else  {
            System.out.println("Not eligible. You nee to wait" + (18 - age) 
            + "Year to be eligible to drive.");
            return false;
        }
    
        }
    

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    // Question 13 
    
    private double calculatePay() {
        unpaidHours * hourlyAge/0.3 = salary;
        return salary;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    //Question 14
    public void paySalary() {
       System.out.println(fullName + "is going to be paid: " + hourlyWage);
         unpaidHour = 0;
    }

}