class Employee {
    protected String firstName;
    protected String lastName;
    protected String socialSecurity;
    public Employee(String firstName, String lastName, String socialSecurity){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurity = socialSecurity;
    }

    // Accessors
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getSocialSecurity(){return socialSecurity;}

    // Mutators
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSocialSecurity(String socialSecurity){
        this.socialSecurity = socialSecurity;
    }
}

class SalariedEmployee extends Employee {
    private int weeklySalary;
    public SalariedEmployee(String firstName, String lastName, String socialSecurity, int weeklySalary){
        super(firstName, lastName, socialSecurity);
        this.weeklySalary = weeklySalary;
    }

    // Accessor
    public int getWeeklySalary(){return weeklySalary;}

    // Mutator
    public void setWeeklySalary(int weeklySalary){
        this.weeklySalary = weeklySalary;
    }
}

class HourlyEmployee extends Employee{
    private int wage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurity, int wage, int hoursWorked){
        super(firstName, lastName, socialSecurity);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    // Accessor
    public int getWage(){return wage;}
    public int getHoursWorked(){return hoursWorked;}

    // Mutator
    public void setWage(int wage){
        this.wage = wage;
    }
    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
}

class CommissionEmployee extends Employee{
    private int commissionRate;
    private int grossSales;
    public CommissionEmployee(String firstName, String lastName, String socialSecurity, int commissionRate, int grossSales){
        super(firstName, lastName, socialSecurity);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    // Accessor
    public int getCommissionRate(){return commissionRate;}
    public int getGrossSales(){return grossSales;}

    // Mutator
    public void setCommissionRate(int commissionRate){
        this.commissionRate = commissionRate;
    }
    public void setGrossSales(int grossSales){
        this.grossSales = grossSales;
    }
}

class BaseEmployee extends Employee{
    private int baseSalary;
    public BaseEmployee(String firstName, String lastName, String socialSecurity, int baseSalary){
        super(firstName, lastName, socialSecurity);
        this.baseSalary = baseSalary;
    }

    // Accessor
    public int getBaseSalary(){return baseSalary;}

    // Mutator
    public void setBaseSalary(int baseSalary){
        this.baseSalary = baseSalary;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        SalariedEmployee one = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        System.out.println("First Name: " + one.getFirstName() + "\nLast Name: " + one.getLastName() + "\nSocial Security Number: " + one.getSocialSecurity() + "\nWeekly Salary: $" + one.getWeeklySalary());
        System.out.println();

        HourlyEmployee two = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        System.out.println("First Name: " + two.getFirstName() + "\nLast Name: " + two.getLastName() + "\nSocial Security Number: " + two.getSocialSecurity() + "\nWage: $" + two.getWage() + "\nHours Worked: " + two.getHoursWorked());
        System.out.println();

        HourlyEmployee three = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        System.out.println("First Name: " + three.getFirstName() + "\nLast Name: " + three.getLastName() + "\nSocial Security Number: " + three.getSocialSecurity() + "\nWage: $" + three.getWage() + "\nHours Worked: " + three.getHoursWorked());
        System.out.println();

        CommissionEmployee four = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000);
        System.out.println("First Name: " + four.getFirstName() + "\nLast Name: " + four.getLastName() + "\nSocial Security Number: " + four.getSocialSecurity() + "\nCommission Rate: " + four.getCommissionRate() + "%"+ "\nGross Salary: $" + four.getGrossSales());
        System.out.println();

        SalariedEmployee five = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        System.out.println("First Name: " + five.getFirstName() + "\nLast Name: " + five.getLastName() + "\nSocial Security Number: " + five.getSocialSecurity() + "\nWeekly Salary: $" + five.getWeeklySalary());
        System.out.println();

        BaseEmployee six = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        System.out.println("First Name: " + six.getFirstName() + "\nLast Name: " + six.getLastName() + "\nSocial Security Number: " + six.getSocialSecurity() + "\nWeekly Salary: $" + six.getBaseSalary());
        System.out.println();

        CommissionEmployee seven = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000);
        System.out.println("First Name: " + seven.getFirstName() + "\nLast Name: " + seven.getLastName() + "\nSocial Security Number: " + seven.getSocialSecurity() + "\nCommission Rate: " + seven.getCommissionRate() + "%"+ "\nGross Salary: $" + seven.getGrossSales());
    }
}