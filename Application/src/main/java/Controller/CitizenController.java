package Controller;

import Entity.Citizen;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("Citizen")
public class CitizenController {
    private List<Citizen> citizens = new ArrayList<>();
    @PostConstruct
    public void preCitizens (){
        Citizen Cit1 = new Citizen("Panagiotis","Marinos","24100300111","hrous 15","Athens",10442,"6987773982","6987773982", "panosgfkmarinos@gmail.com", 0001);
        Citizen Cit2 = new Citizen("Giannis","Dagiantis","22020300236","pavlou mela 36","Athens",19004,"2106634708","6943234300", "ntagiantisgiannis28@gmail.com",0002 );
        citizens.add(Cit1);
        citizens.add(Cit2);
    }

}
