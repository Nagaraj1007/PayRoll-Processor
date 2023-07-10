public class Employee {
    public void calculatePay(String name , double salary){
        System.out.println(name + " " + salary * 12);
    }

    public void calculatePay(String name , double hourlyRate , double hoursWorked){
        System.out.println(name + " " + hourlyRate * hoursWorked * 7);
    }
}

