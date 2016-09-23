public class Doctor extends Person implements Employer {

    private Integer salary;

    public Doctor() {
    }

    public Doctor(Integer salary) {
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    
}
