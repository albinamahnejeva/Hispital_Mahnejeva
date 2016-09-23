
import util.ParseCode;


        
        
public class Person implements Peaple {

    private String firstname;

    private String lastname;

    private String code;

    //private Long id;

    private Integer age;

    private String birthdey;

    private String gender;

    private ParseCode parseCode;

    public Person() {
    }

    public Person(String firstname, String lastname, String code, Long id, Integer age, String birthdey, String gender) {
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setCode(code);
        //this.id = id;
        this.parseCode = new ParseCode(this.code);
        this.setAge(this.parseCode);
        this.setBirthdey(this.parseCode);
        this.setGender(this.parseCode);
       
    }

    @Override
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //public Long getId() {
        //return id;
    //}

    //public void setId(Long id) {
    //    this.id = id;
    //}

    public Integer getAge() {
        return age;
    }

    public void setAge(ParseCode parseCode) {
        this.age = parseCode.getAge();
    }

    public String getBirthdey() {
        return birthdey;
    }

    public void setBirthdey(ParseCode parseCode) {
        this.birthdey = parseCode.getBirthdey();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(ParseCode parseCode) {
        this.gender = parseCode.getGender();
    }

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + ", code=" + code + ", age=" + age + ", birthdey=" + birthdey + ", gender=" + gender + ", parseCode=" + parseCode + '}';
    }
    
    
}
