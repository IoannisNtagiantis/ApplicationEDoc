package Entity;

import jakarta.persistence.*;


@Entity
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;

    @Column
    private String name;
    @Column
    private String lastname;
    @Column
    private String amka;
    @Column
    private String city;
    @Column
    private int postalCode;
    @Column
    private String mobileNumber;
    @Column
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="citizen_profile_id")
    private CitizenProfile citizenProfile;

    public Citizen(String name, String lastname, String amka, String address, String city, int postalCode, String phoneNumber, String mobileNumber, String email, int id){
       this.name = name;
       this.amka = amka;
       this.city = city;
       this.postalCode = postalCode;
       this.mobileNumber = mobileNumber;
       this.email = email;
       this.id = id;

   }

    public Citizen() {

    }


    public void setEmail(String email) {
        this.email = email;
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

    public String getAmka() {
        return amka;
    }

    public void setAmka(String amka) {
        this.amka = amka;
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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
       return "Citizen{" +
               "name=" + name +
               ", lastname='" + lastname + '\'' +
               ", amka='" + amka + '\'' +
               ", city='" + city + '\'' +
               ", PostalCode='" + postalCode + '\'' +
               ", mobileNumber='" + mobileNumber + '\'' +
               ", email='" + email + '\'' +
               ", id='" + id + '\'' +
            '}';
    }
}


