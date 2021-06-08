package com.jackrtrekr.jackrtrekrteam3;

import com.jackrtrekr.jackrtrekrteam3.models.Region;
import com.jackrtrekr.jackrtrekrteam3.repositories.ContinentRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.RegionRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.TrekRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.TypeRepository;
import com.jackrtrekr.jackrtrekrteam3.models.Continent;
import com.jackrtrekr.jackrtrekrteam3.models.Trek;
import com.jackrtrekr.jackrtrekrteam3.models.Type;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.persistence.Lob;
import java.awt.*;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TypeRepository typeRepo;
    @Resource
    ContinentRepository continentRepo;
    @Resource
    private TrekRepository trekRepo;
    @Resource
    private RegionRepository regionRepo;


    @Override
    public void run(String... args) throws Exception {
        Type easy = new Type("Easy");
        Type moderate = new Type("Moderate");
        Type strenuous = new Type("Strenuous");
        Type difficult = new Type("Difficult");
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

        Region mountainousWest = new Region("The Mountainous West");
        Region greatPlains = new Region("The Great Plains");
        Region canadianShield = new Region("The Canadian Shield");
        Region variedEasternRegion = new Region("The Varied Eastern Region");
        Region caribbean = new Region ("The Caribbean");
        Region patagonia = new Region("Patagonia");
        Region andesMountains = new Region ("The Andes Mountains");
        Region brazilianCoastline = new Region("The Brazilian Coastline");
        Region amazon = new Region ("The Amazon");
        Region pantanal = new Region ("The Pantanal");
        Region balkanPeninsula = new Region("The Balkan Peninsula");
        Region iberianPeninsula = new Region("The Iberian Peninsula");
        Region italianPeninsula = new Region("The Italian Peninsula");
        Region scandinavianPeninsula = new Region("The Scandinavian Peninsula");
        Region fennoscandianPeninsula = new Region("The Fennoscandian Peninsula");
        Region jutlandPeninsula = new Region("The Jutland Peninsula");
        Region sahel = new Region ("The Sahel");
        Region sahara = new Region("The Sahara");
        Region ethiopianHighlands = new Region ("The Ethiopian Highlands");
        Region savanna = new Region ("The Savanna");
        Region swahiliCoast = new Region ("The Swahili Coast");
        Region rainForest = new Region ("The Rain Forest");
        Region africanGreatLakes = new Region ("The African Great Lakes");
        Region southernAfrica = new Region ("Southern Africa");
        Region centralAsia = new Region("Central Asia");
        Region southPole = new Region("South Pole");
        Region australianCapitalTerritory = new Region ("Australian Capital Territory");
        Region newSouthWales = new Region("New South Wales");
        Region northernTerritory = new Region ("Northern Territory");
        Region queensLand = new Region("Queensland");
        Region southAustralia = new Region("South Australia");
        Region tasmaniaHobart = new Region("Tasmania-Hobart");
        Region victoriaMelbourne = new Region ("Victoria-Melbourne");
        Region westernAustralia = new Region ("Western Australia");
        Region southeastAsia = new Region ("Southeast Asia");
        Region eastAsia = new Region ("East Asia");
        Region southAsia = new Region ("South Asia");
        Region southwestAsia = new Region ("Southwest Asia");

        regionRepo.save(mountainousWest);
        regionRepo.save(patagonia);
        regionRepo.save(balkanPeninsula);
        regionRepo.save(sahara);
        regionRepo.save(centralAsia);
        regionRepo.save(southPole);
        regionRepo.save(newSouthWales);
        regionRepo.save(queensLand);
        regionRepo.save(greatPlains);
        regionRepo.save(canadianShield);
        regionRepo.save(variedEasternRegion);
        regionRepo.save(caribbean);
        regionRepo.save(andesMountains);
        regionRepo.save(brazilianCoastline);
        regionRepo.save(amazon);
        regionRepo.save(pantanal);
        regionRepo.save(iberianPeninsula);
        regionRepo.save(italianPeninsula);
        regionRepo.save(scandinavianPeninsula);
        regionRepo.save(fennoscandianPeninsula);
        regionRepo.save(jutlandPeninsula);
        regionRepo.save(sahara);
        regionRepo.save(sahel);
        regionRepo.save(ethiopianHighlands);
        regionRepo.save(savanna);
        regionRepo.save(swahiliCoast);
        regionRepo.save(rainForest);
        regionRepo.save(africanGreatLakes);
        regionRepo.save(southernAfrica);
        regionRepo.save(australianCapitalTerritory);
        regionRepo.save(northernTerritory);
        regionRepo.save(southAustralia);
        regionRepo.save(tasmaniaHobart);
        regionRepo.save(victoriaMelbourne);
        regionRepo.save(westernAustralia);
        regionRepo.save(southeastAsia);
        regionRepo.save(eastAsia);
        regionRepo.save(southAsia);
        regionRepo.save(southwestAsia);

        Trek annaPurna = new Trek("Annapurna Circuit", "The Annapurna Circuit is a trek within the mountain ranges of central Nepal. The total length of the route varies between 100 and 145 miles. The highlights include reaching an altitude of almost 18,000 feet at Thorung La summit pass and watching the sun rise over towering peaks at Poon Hill.", asia, southAsia, difficult, "Annapurna Circuit Pack List", "Fifteen to Twenty Five Days", "It was great!");
        trekRepo.save(annaPurna);

    }

}
