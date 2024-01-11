package Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class CitizenProfile {
    @Id
    private int id;

    @Column
    private String website;

    private int getId(){
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }


    public CitizenProfile(){

    }
}

