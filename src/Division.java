
import java.util.List;

public class Division {

    private String divisionName;
    private List<Nurse> nurces;
    private List<Ward> wards;
    private List<Doctor> doctors;
    private List<Staff> staffes;

    public Division() {
    }

    public Division(String divisionName, List<Nurse> nurces, List<Ward> wards, List<Doctor> doctors, List<Staff> staffes) {
        this.divisionName = divisionName;
        this.nurces = nurces;
        this.wards = wards;
        this.doctors = doctors;
        this.staffes = staffes;
    }

    public String getDivisionName() {
        return divisionName;
    }

    public void setDivisionName(String divisionName) {
        this.divisionName = divisionName;
    }

    public List<Nurse> getNurces() {
        return nurces;
    }

    public void setNurces(List<Nurse> nurces) {
        this.nurces = nurces;
    }

    public List<Ward> getWards() {
        return wards;
    }

    public void setWards(List<Ward> wards) {
        this.wards = wards;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Staff> getStaffes() {
        return staffes;
    }

    public void setStaffes(List<Staff> staffes) {
        this.staffes = staffes;
    }

    @Override
    public String toString() {
        return "Division{" + "divisionName=" + divisionName + ", nurces=" + nurces + ", wards=" + wards + ", doctors=" + doctors + ", staffes=" + staffes + '}';
    }
    
    
}
