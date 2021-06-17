package com.jackrtrekr.jackrtrekrteam3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.jackrtrekr.jackrtrekrteam3.models.Trek;
import com.jackrtrekr.jackrtrekrteam3.models.Continent;
import com.jackrtrekr.jackrtrekrteam3.models.Region;
import com.jackrtrekr.jackrtrekrteam3.models.Type;
import com.jackrtrekr.jackrtrekrteam3.repositories.TrekRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.ContinentRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.RegionRepository;
import com.jackrtrekr.jackrtrekrteam3.repositories.TypeRepository;

import javax.annotation.Resource;
import java.util.Collection;


@Component
public class Populator implements CommandLineRunner {

    @Resource
    private TypeRepository typeRepo;
    @Resource
    private ContinentRepository continentRepo;
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

        Continent northAmerica = new Continent("North America", "/images/northamericacontimage.jpg");
        Continent southAmerica = new Continent("South America", "images/southamericacontimage.jpg");
        Continent africa = new Continent("Africa", "/images/africacontimage.jpg");
        Continent asia = new Continent("Asia","/images/asiacontimage.jpg");
        Continent europe = new Continent("Europe", "/images/europecontimage.jpg");
        Continent antarctica = new Continent("Antarctica", "/images/antarcticacontimage.jpg");
        Continent australia = new Continent("Australia", "/images/australiacontimage.jpg");
        continentRepo.save(northAmerica);
        continentRepo.save(southAmerica);
        continentRepo.save(africa);
        continentRepo.save(asia);
        continentRepo.save(europe);
        continentRepo.save(antarctica);
        continentRepo.save(australia);

        Region mountainousWest = new Region("The Mountainous West", northAmerica);
        Region greatPlains = new Region("The Great Plains", northAmerica);
        Region canadianShield = new Region("The Canadian Shield", northAmerica);
        Region variedEasternRegion = new Region("The Varied Eastern Region", northAmerica);
        Region caribbean = new Region("The Caribbean", northAmerica);
        Region patagonia = new Region("Patagonia", southAmerica);
        Region andesMountains = new Region("The Andes Mountains", southAmerica);
        Region brazilianCoastline = new Region("The Brazilian Coastline", southAmerica);
        Region amazon = new Region("The Amazon", southAmerica);
        Region pantanal = new Region("The Pantanal", southAmerica);
        Region balkanPeninsula = new Region("The Balkan Peninsula", europe);
        Region iberianPeninsula = new Region("The Iberian Peninsula", europe);
        Region italianPeninsula = new Region("The Italian Peninsula", europe);
        Region scandinavianPeninsula = new Region("The Scandinavian Peninsula", europe);
        Region fennoscandianPeninsula = new Region("The Fennoscandian Peninsula", europe);
        Region jutlandPeninsula = new Region("The Jutland Peninsula", europe);
        Region france   = new Region("France", europe);
        Region sahel = new Region("The Sahel", africa);
        Region sahara = new Region("The Sahara", africa);
        Region ethiopianHighlands = new Region("The Ethiopian Highlands", africa);
        Region savanna = new Region("The Savanna", africa);
        Region swahiliCoast = new Region("The Swahili Coast", africa);
        Region rainForest = new Region("The Rain Forest", africa);
        Region africanGreatLakes = new Region("The African Great Lakes", africa);
        Region southernAfrica = new Region("Southern Africa", africa);
        Region centralAsia = new Region("Central Asia", asia);
        Region antarcticPeninsula = new Region("Antarctic Peninsula", antarctica);
        Region eastAntarctica = new Region("East Antarctica", antarctica);
        Region southPole = new Region("South Pole", antarctica);
        Region westAntarctica = new Region("West Antarctica", antarctica);
        Region rossSea = new Region("Ross Sea", antarctica);
        Region australianCapitalTerritory = new Region("Australian Capital Territory", australia);
        Region newSouthWales = new Region("New South Wales", australia);
        Region northernTerritory = new Region("Northern Territory", australia);
        Region queensLand = new Region("Queensland", australia);
        Region southAustralia = new Region("South Australia", australia);
        Region tasmaniaHobart = new Region("Tasmania-Hobart", australia);
        Region victoriaMelbourne = new Region("Victoria-Melbourne", australia);
        Region westernAustralia = new Region("Western Australia", australia);
        Region southeastAsia = new Region("Southeast Asia", asia);
        Region eastAsia = new Region("East Asia", asia);
        Region southAsia = new Region("South Asia", asia);
        Region southwestAsia = new Region("Southwest Asia", asia);

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
        regionRepo.save(france);
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
        regionRepo.save(antarcticPeninsula);
        regionRepo.save(eastAntarctica);
        regionRepo.save(westAntarctica);
        regionRepo.save(rossSea);

//        Continent: Asia
        Trek annaPurna = new Trek("Annapurna Circuit", "/images/Annapurna Circuit (small).jpg", "The Annapurna Circuit is a trek within the mountain ranges of central Nepal. The total length of the route varies between 100 and 145 miles. The highlights include reaching an altitude of almost 18,000 feet at Thorung La summit pass and watching the sun rise over towering peaks at Poon Hill.", asia, southAsia, difficult, "Backpack, Walking Stick, camping supplies, food and cooking supplies, Head lamp, Waterproof climbing shoes.", "Fifteen to Twenty Five Days");
        trekRepo.save(annaPurna);
        
        Trek banaueRiceTerraces = new Trek("Banaue Rice Terraces", "/images/Banaue Rice Terraces (small).jpg", "The terraces are located approximately 4,900 feet above sea level. These are fed by an ancient irrigation system from the rainforests above the terraces.", asia, southeastAsia, easy, "Backpack, Water bottle, camping supplies, food and cooking supplies, Walking stick, Rain jacket.","Two to Three days.");
        trekRepo.save(banaueRiceTerraces);
        
        Trek kumanoKodo = new Trek("Kumano Kodo", "/images/Kumano Kodo (small).jpg", "The Kumano Kodo has various routes, with most people spending 2-4 days. Reaches elevated height of up to 3280 feet. The most popular is the Nakahechi route.", asia, eastAsia, easy, "Backpack, Walking Stick, Jacket, Water bottle, camping supplies, food and cooking supplies, Head Lamp", "Two to Three days.");
        trekRepo.save(kumanoKodo);
        
        Trek mountFuji = new Trek("Mount Fuji", "/images/Mount Fuji (small).jpg", "Climbing Mount Fuji is a challenge and is something that all Japanese do at least once in their life. Reached heights of up to 12,400 feet makes this a challenge. The trek lasts two days and there are no straight roads, it’s all uphill, so it’s best to be prepared.", asia, eastAsia, difficult, "Backpack, Walking Stick, Cramptons, camping supplies, food and cooking supplies, Head lamp, Waterproof climbing shoes.", "Two days.");
        trekRepo.save(mountFuji);
        
        Trek shamanseerMountain = new Trek("Shamanseer Mountain", "/images/Shamanseer Mountain.jpg", "This is a very light trail that will only take about 2-3 days to complete. Hikers will walk a total of 65 miles over. Heights will reach up to 5500 feet. The path is pretty rocky.", asia, southwestAsia, easy, "Water Bottle, camping supplies, food and cooking supplies, Sunglasses, Sunscreen, Hat or Visor", "Two to Three days.");
        trekRepo.save(shamanseerMountain);
        
        Trek danaToPetra = new Trek("Dana to Petra Trek", "/images/Dana to Petra (small).jpg", "Trek for eight days through Jordan's beautiful and rugged countryside, following the 'Jordan Trail' from Dana Nature Reserve to the ancient 'Rose-Red City' of Petra, and camping Bedouin style. Enjoy a wonderful week of discovery, walking and Jordanian hospitality. This trek will reach heights of 3800 feet.", asia, southwestAsia, moderate, "Backpack, water bottle, camping supplies, food and cooking supplies, hat or visor, sunscreen.", "Eight days.");
        trekRepo.save(danaToPetra);
        
        Trek everestBaseCamp = new Trek("Everest Base Camp", "/images/Everest Base Camp (small).jpg", "The trek to Everest Base Camp is among the most dramatic and picturesque in the Himalaya. The scenery is varied and spectacular, the lodgings and tracks are of a very high standard. Will reach heights of 29,000 feet.", asia, southAsia, difficult, " 2 pairs of climbing boots, Cramptons, Ice Axes, Backpack, camping supplies, food and cooking supplies, Ropes, Winter Clothing, Head Lamp.", "Tweleve days");
        trekRepo.save(everestBaseCamp);

        //      Continent:Antarctica
        Trek mtVinson = new Trek("Mt Vinson", "/images/Mount Vinson.jpg", "Explore the natural environment and closeup encounters with wildlife on our forward-facing zodiac’s and on foot.", antarctica, southPole, difficult, "Raft, Water bottle, camping supplies, food and cooking supplies, Head Lamp", "Eleven days");
        trekRepo.save(mtVinson);

        //      Continent: Africa
        Trek mountKilimanjaro = new Trek ("Mount Kilimanjaro", "/images/Mount Kilimanjaro (small).jpg", "The highest mountain in Africa—rising to 5,895 more than 19,000 feet in elevation.", africa, savanna, moderate, "Water Bottle, camping supplies, food and cooking supplies, Sunglasses, Sunscreen, Hat or Visor","Three to Five days");
        trekRepo.save(mountKilimanjaro);

        Trek maasaiMara = new Trek("Maasai Mara.", "/images/Maasai Mara (small).jpg", "The Maasai Mara offers several cross-counrty tours. It is all across flat lands.", africa, southernAfrica, moderate,"Water Bottle, camping supplies, food and cooking supplies, Sunglasses, Sunscreen, Hat or Visor", "Five to seven days");
        trekRepo.save(maasaiMara);

        Trek blydeRiverCanyon = new Trek("Blyde River Canyon","/images/Blyde River Canyon (small).jpg",  "This lush valley is the third-largest canyon in the world, and is marked by a clear, blue river cutting through sheer stone drop-offs 800 meters high.", africa, southernAfrica, strenuous, "Water Bottle, camping supplies, food and cooking supplies, Sunglasses, Sunscreen, Hat or Visor, Hunting Knife", "Twenty Days");
        trekRepo.save(blydeRiverCanyon);

        Trek danakilDepression = new Trek("Danakil Depression",  "/images/Danakil Depression (small).jpg","The Danakil Depression is one of the most inhospitable places on the planet, and yet life flourishes here. The Afar people thrive here.", africa, ethiopianHighlands, moderate, "Water Bottle, camping supplies, food and cooking supplies, Sunglasses, Sunscreen, Hat or Visor, Head Lamp", "One day and One Night");
        trekRepo.save(danakilDepression);

        Trek livingstonia = new Trek("Livingstonia", "/images/Livingstonia.jpg", "Livingstonia is 900 meters above the lake and is accessible by either driving up hairpin African dirt roads or hiking from Khondowe.", africa, africanGreatLakes, easy, "Water Bottle, Sunglasses, Sunscreen, Hat or Visor", "One Day");
        trekRepo.save(livingstonia);


//      Continent:Australia
        Trek larapintaTrail = new Trek("Larapinta Trail", "/images/Larapinta-Trail.jpg", "One-way walk; good road access along track, including at ends", australia, northernTerritory, difficult, "Backpack, Walking Stick, camping supplies, food and cooking supplies, Head lamp, Waterproof climbing shoes, Hat or visor, sunscreen.", "Eleven to fifteen days.");
        trekRepo.save(larapintaTrail);

        Trek fraserIslandGreatWalk = new Trek("Fraser Island Great Walk", "/images/Fraser Island Great Walk (small).jpg", "One is a spectacular World Heritage area, with pristine lakes, rare rainforests growing on sand.", australia, tasmaniaHobart, easy,"Backpack, Walking Stick, camping supplies, food and cooking supplies, Hat or visor, sunscreen.", "Three to five days");
        trekRepo.save(fraserIslandGreatWalk);

        Trek wildernessCoastWalk = new Trek("Wilderness Coast Walk", "/images/wildernesscoast.jpg", "One-way; boat transport required at one end, road access at other", australia, victoriaMelbourne, moderate, "Five to seven days", "Backpack, Walking Stick, camping supplies, food and cooking supplies, Head lamp, Waterproof climbing shoes, Hat or visor, sunscreen.");
        trekRepo.save(wildernessCoastWalk);


//      Continent: Europe
        Trek tourDeMontBlanc = new Trek("Tour De Mont Blanc", "/images/tour du mont blanc (small).jpg", "This mother of all treks circumnavigates the mighty slopes of the highest mountain in the Alps", europe,france, difficult,"Backpack, Walking Stick, camping supplies, food and cooking supplies, Head lamp, Waterproof climbing shoes.","ten to fifteen days");
        trekRepo.save(tourDeMontBlanc);

        Trek norwegianFjords = new Trek("Norwegian Fjords", "/images/Norwegian Fjords.jpg", "Take the family on treks over blue glaciers, viewing mountains that come straight up from the narrow fjords.",europe, northernTerritory, easy, "Water Bottle, Sunglasses, Sunscreen, Hat or Visor","One day");
        trekRepo.save(norwegianFjords);

        Trek tourDeMonteRosa = new Trek("Tour De Monte Rosa", "/images/Tour De Monte Rosa.jpg", "The trek around this 15710 foot mountain is stunning - and it is not easy. Every day there are steep ascents and descents over ice and rock.", europe, italianPeninsula, difficult,"Backpack, Walking Stick, camping supplies, food and cooking supplies, Head lamp, Waterproof climbing shoes.", "Eleven to fifteen days");
        trekRepo.save(tourDeMonteRosa);

        Trek canaryIslands = new Trek("Canary Islands",  "/images/Canary Islands.jpg","Enerife boasts the world’s 3rd highest volcano, pine forests, ravines and coastal paths.", europe, iberianPeninsula, easy, "Backpack, Walking Stick, camping supplies, food and cooking supplies, Head lamp, Waterproof climbing shoes.", "Two to three days.");
        trekRepo.save(canaryIslands);


//      Continent: South America
        Trek chapadaDiamantinaNationalPark = new Trek("Chapada Diamantina National Park", "/images/Chapada Diamantina (small).jpg", "One of the most beautiful National Parks in Brazil, Chapada Diamantina is located in Bahia in northeast Brazil", southAmerica, brazilianCoastline, moderate, "Water Bottle, camping supplies, food and cooking supplies, Sunglasses, Sunscreen, Hat or Visor", "Two to five days");
        trekRepo.save(chapadaDiamantinaNationalPark);

        Trek theIncaTrail = new Trek("The Inca Trail","/images/Inca Trail (small).jpg",  "When you think of trekking in South America, you think of the Inca Trail", southAmerica, brazilianCoastline, moderate, "Water Bottle, camping supplies, food and cooking supplies, Sunglasses, Sunscreen, Hat or Visor", "Three to five days");
        trekRepo.save(theIncaTrail);

        Trek theLostCity = new Trek("The Lost City", "/images/Lost City Trek (small).jpg", "Colombia’s Inca Trail, the Lost City trek is the country’s best multi-day trekking option.", southAmerica, amazon, moderate, "Water Bottle, camping supplies, food and cooking supplies, Sunglasses, Sunscreen, Hat or Visor.", "Three to Five days");
        trekRepo.save(theLostCity);


//      Continent: North America
        Trek yellowstone = new Trek("Yellowstone Park", "/images/Yellowstone (small).jpg", "Yellowstone National Park in Wyoming, Montana and Idaho is a hiker's paradise, with approximately 1,000 miles of hiking trails across more than 2.2 million acres.", northAmerica, mountainousWest, difficult, "Water Bottle, camping supplies, food and cooking supplies, Sunglasses, Sunscreen, Hat or Visor", "five to seven days");
        trekRepo.save(yellowstone);

        Trek grandTetonNationalPark = new Trek("Grand Teton National Park", "/images/Grand Teton (small).jpg", "The park, which sits in Wyoming's Jackson Hole valley, caters to every level of hiker with its more than 200 miles of trails", northAmerica, greatPlains, moderate,"Water Bottle, camping supplies, food and cooking supplies, Sunglasses, Sunscreen, Hat or Visor", "One to five days");
        trekRepo.save(grandTetonNationalPark);

        Trek theAppalachianTrail = new Trek("The Appalachian Trail", "/images/Appalachian Trail (small).jpg", "The Appalachian Trail is a 2,180+ mile long public footpath that traverses the scenic, wooded, pastoral, wild, and culturally resonant lands of the Appalachian Mountains.", northAmerica, variedEasternRegion, strenuous, "Water Bottle, camping supplies, food and cooking supplies, Sunglasses, Sunscreen, Hat or Visor, Hunting Knife, Firearm.", "One to three months");
        trekRepo.save(theAppalachianTrail);



    }

}
