package com.jackrtrekr.jackrtrekrteam3;

import com.jackrtrekr.jackrtrekrteam3.repositories.ContinentRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.TrekRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.TypeRepository;
import com.jackrtrekr.jackrtrekrteam3.models.Continent;
import com.jackrtrekr.jackrtrekrteam3.models.Trek;
import com.jackrtrekr.jackrtrekrteam3.models.Type;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TypeRepository typeRepo;
    @Resource
    ContinentRepository continentRepo;
    @Resource
    private TrekRepository trekRepo;

    @Override
    public void run(String... args) throws Exception {
        Type easy = new Type ("Easy");
        Type moderate = new Type ("Moderate");
        Type strenuous = new Type ("Strenuous");
        Type difficult = new Type ("Difficult");
        typeRepo.save(easy);
        typeRepo.save(moderate);
        typeRepo.save(strenuous);
        typeRepo.save(difficult);

        Continent northAmerica = new Continent("North America");
        Continent southAmerica = new Continent("South America");
        Continent africa = new Continent("Africa");
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent antarctica = new Continent("Antarctica");
        Continent australia = new Continent("Australia");
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(africa);
        continentRepo.save(asia);
        continentRepo.save(europe);
        continentRepo.save(antarctica);
        continentRepo.save(australia);

        Trek machuPitchu = new Trek("Matchu Picchu", "An Incan citadel set high in the Andes Mountains", southAmerica, difficult, "A big lunch", "Three Days", "It was great!" );
        trekRepo.save(machuPitchu); 
    }

}
