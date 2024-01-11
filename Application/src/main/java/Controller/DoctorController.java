package Controller;

import Entity.Citizen;
import Entity.Doctor;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("Doctor")
public class DoctorController {
    private List<Doctor> doctors = new ArrayList<>();
    @PostConstruct
    public void preDoctors (){
        Doctor Doc1 = new Doctor("George", "Savidis", "269732008", "Spyroy Gevrgakh 8", "Athens", 19004, "2106634222", "6977315964", "georgesavidis@gmail.com", 0003);
        Doctor Doc2 = new Doctor("Anna", "Hatzilia", "489352176", "Vasileos Pavlou 186", "Athens", 19004, "2106025301", "6988563412", "annahatzilia@gmail.com",0004);
        doctors.add(Doc1);
        doctors.add(Doc2);
    }
}
