public class Nurse extends Person implements Employer {

    private Integer salary;

    public Nurse() {
    }

    public Nurse(Integer salary) {
        this.salary = salary;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    
}
