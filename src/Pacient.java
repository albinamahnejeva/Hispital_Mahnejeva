
import java.util.Date;

public class Pacient extends Person {

    private Doctor doctor;

    private Date arrive;

    private Date departure;

    public Pacient() {
    }

    public Pacient(Doctor doctor, Date arrive, Date departure) {
        this.doctor = doctor;
        this.arrive = arrive;
        this.departure = departure;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getArrive() {
        return arrive;
    }

    public void setArrive(Date arrive) {
        this.arrive = arrive;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }
    
}
