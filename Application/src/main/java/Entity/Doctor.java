package Entity;

import jakarta.persistence.*;

import java.util.List;

public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private String afm;
    @Column
    private String city;
    @Column
    private int postalCode;
    @Column
    private String mobileNumber;
    @Column
    private String email;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name= "doctor_citizen",
            joinColumns = @JoinColumn(name = "doctor_id"),
            inverseJoinColumns = @JoinColumn(name = "citizen_id"),
            uniqueConstraints = {@UniqueConstraint(columnNames = {"citizen_id", "doctor_id"})}
    )

    private List<Citizen> citizens;

    public Doctor () {

    }

    public Doctor(String name , String lastname , String afm , String officeAddress , String city , int postalCode , String phoneNumber , String mobileNumber, String email, int id){
        this.name = name;
        this.afm = afm;
        this.city = city;
        this.postalCode = postalCode;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Citizen> getCitizens(){
        return citizens;
    }

    public void setCitizens(List<Citizen> citizens){
        this.citizens = citizens;
    }


    @Override
    public String toString() {
        return "Doctor{" +
                "name=" + name +
                ", lastname='" + lastname + '\'' +
                ", afm='" + afm + '\'' +
                ", city='" + city + '\'' +
                ", PostalCode='" + postalCode + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
