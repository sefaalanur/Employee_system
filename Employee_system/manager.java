public class manager extends employee{
    private int responsible_employee;
    public manager(String name, String surname, int id, int responsible_employee) {
        super(name, surname, id);
        this.responsible_employee = responsible_employee;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("The number of employee the manager is responsible for: " + responsible_employee);
    }
    public void raiseSalary(int raiseAmount) {
        System.out.println(getName()+" raises salary for employees as: " +raiseAmount);
    }
}
