public class Staff extends Person implements Employer {

    private Integer salary;

    private Position position;

    public Staff() {
    }

    public Staff(Integer salary, Position position, String firstname, String lastname, String code, Long id, Integer age, String birthdey, String gender) {
        super(firstname, lastname, code, id, age, birthdey, gender);
        this.salary = salary;
        this.position = position;
    }
    
}
