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
        Trek annaPurna = new Trek("Annapurna Circuit", "/images/Annapurna Circuit (small).jpg", "The Annapurna Circuit is a trek within the mountain ranges of central Nepal. The total length of the route varies between 100 and 145 miles. The highlights include reaching an altitude of almost 18,000 feet at Thorung La summit pass and watching the sun rise over towering peaks at Poon Hill.", asia, southAsia, difficult, "Backpack, Walking Stick, Camping Supplies, Head Lamp, Climbing Shoes, Food, and Cooking Supplies.", "Fifteen to Twenty Five Days");
        trekRepo.save(annaPurna);
        
        Trek banaueRiceTerraces = new Trek("Banaue Rice Terraces", "/images/Banaue Rice Terraces (small).jpg", "The Banaue Rice Terraces are terraces carved into the mountains in the Phillipines. The terraces are located approximately 4,900 feet above sea level. These are fed by an ancient irrigation system from the rainforests above the terraces.", asia, southeastAsia, easy, "Backpack, Water Bottle, Camping Supplies, Food, Cooking Supplies, Walking Stick, and Rain Jacket.","Two to Three Days.");
        trekRepo.save(banaueRiceTerraces);
        
        Trek kumanoKodo = new Trek("Kumano Kodo", "/images/Kumano Kodo (small).jpg", "The Kumano Kodo is a series of pilgrimage trails in Japan. It has various routes with most people spending 2-4 days trekking. The Kumano Kudo reaches elevated height of up to 3,280 feet. The most popular is the Nakahechi route.", asia, eastAsia, easy, "Backpack, Walking Stick, Jacket, Water Bottle, Camping Supplies, Food, Cooking Supplies, and  Head Lamp", "Two to Three Days.");
        trekRepo.save(kumanoKodo);
        
        Trek mountFuji = new Trek("Mount Fuji", "/images/Mount Fuji (small).jpg", "Climbing Mount Fuji is a challenge and is something that all Japanese do at least once in their life. Mount Fuji reaches heights of up to 12,400 feet. The trek lasts two days and there are no straight roads. It is all uphill, so it’s best to be prepared.", asia, eastAsia, difficult, "Backpack, Walking Stick, Cramptons, Camping Supplies, Food, Cooking Supplies, Head Lamp, and  Waterproof Climbing Shoes.", "Two Days.");
        trekRepo.save(mountFuji);
        
        Trek shamanseerMountain = new Trek("Shamanseer Mountain", "/images/Shamanseer Mountain.jpg", "Mount Shamanseer is located in Saudi Arabia. It is 5,500 feet above sea level and known for its drawings and inscriptions that depict ancient civilization. This is a very light trail that will only take about 2 to 3 days to complete. Hikers will walk a total of 65 miles over. Heights will reach up to 5,500 feet. The path is rocky.", asia, southwestAsia, easy, "Water Bottle, Camping Supplies, Food, Cooking Supplies, Sunglasses, Sunscreen, Hat or Visor", "Two to Three Days.");
        trekRepo.save(shamanseerMountain);
        
        Trek danaToPetra = new Trek("Dana to Petra Trek", "/images/Dana to Petra (small).jpg", "Trek for eight days through Jordan's beautiful and rugged countryside, following the 'Jordan Trail' from Dana Nature Reserve to the ancient 'Rose-Red City' of Petra, and camping Bedouin style. Enjoy a wonderful week of discovery, walking and Jordanian hospitality. This trek will reach heights of 3,800 feet.", asia, southwestAsia, moderate, "Backpack, Water Bottle, Camping Supplies, Food, Cooking Supplies, Hat or Visor, and Sunscreen.", "Eight Days.");
        trekRepo.save(danaToPetra);
        
        Trek everestBaseCamp = new Trek("Everest Base Camp", "/images/Everest Base Camp (small).jpg", "The trek to Everest Base Camp is among the most dramatic and picturesque in the Himalaya. The scenery is varied and spectacular, the lodgings and treks are of a very high standard. Will reach heights of 29,000 feet.", asia, southAsia, difficult, " 2 Pairs of Climbing Boots, Cramptons, Ice Axes, Backpack, Camping Supplies, Food, Cooking Supplies, Ropes, Winter Clothing, and Head Lamp.", "Twelve Days");
        trekRepo.save(everestBaseCamp);

        //      Continent:Antarctica
        Trek mtVinson = new Trek("Mount Vinson", "/images/Mount Vinson.jpg", "Mount Vinson, located approximately 600 miles from the South Pole, is the highest peak in Antarctica. This 15 day trek will test your limits. Temperatures can dip below -40 degrees F, and you will have to weather ice, snow, and rocks to reach the peak. ", antarctica, southPole, difficult, "Mountain Boots, Overboots, Water bottle, Camping Supplies, Food, Cooking Supplies, Ski Goggles, and Head Lamp", "Fifteen Days");
        trekRepo.save(mtVinson);

        //      Continent: Africa
        Trek mountKilimanjaro = new Trek ("Mount Kilimanjaro", "/images/Mount Kilimanjaro (small).jpg", "The highest mountain in Africa rising to more than 19,000 feet in elevation.", africa, savanna, moderate, "Water Bottle, Camping Supplies, Food, Cooking Supplies, Sunglasses, Sunscreen, Hat or Visor","Three to Five Days");
        trekRepo.save(mountKilimanjaro);

        Trek maasaiMara = new Trek("Maasai Mara", "/images/Maasai Mara (small).jpg", "The Maasai Mara is a National Reserve in Kenya that offers several cross-country treks. Animals you may encounter include cheetahs, leopards, zebras, and elephants. It is all across flat lands.", africa, southernAfrica, moderate,"Water Bottle, Camping Supplies, Food, Cooking Supplies, Sunglasses, Sunscreen, Hat or Visor", "Five to Seven Days");
        trekRepo.save(maasaiMara);

        Trek blydeRiverCanyon = new Trek("Blyde River Canyon","/images/Blyde River Canyon (small).jpg",  "This lush valley is the third-largest canyon in the world, and is marked by a clear, blue river cutting through sheer stone drop-offs 2,600 feet high.", africa, southernAfrica, strenuous, "Water Bottle, Camping Supplies, Food, Cooking Supplies, Sunglasses, Sunscreen, Hat or Visor, Hunting Knife", "Twenty Days");
        trekRepo.save(blydeRiverCanyon);

        Trek danakilDepression = new Trek("Danakil Depression",  "/images/Danakil Depression (small).jpg","The Danakil Depression is one of the most inhospitable places on the planet, and yet life flourishes here. The Afar people thrive here.", africa, ethiopianHighlands, moderate, "Water Bottle, Sunglasses, Sunscreen, Hat or Visor, and Head Lamp", "One day and One Night");
        trekRepo.save(danakilDepression);

        Trek livingstonia = new Trek("Livingstonia", "/images/Livingstonia.jpg", "The Livingstonia day hike is 10 mile hike above Lake Malawi. Attractions you will see include the Mushroom Farm, Stone House Museum, and University of Livingstonia.", africa, africanGreatLakes, easy, "Water Bottle, Sunglasses, Sunscreen, Hat or Visor", "One Day");
        trekRepo.save(livingstonia);


//      Continent:Australia
        Trek larapintaTrail = new Trek("Larapinta Trail", "/images/Larapinta-Trail.jpg", "The Larapinta trail is one of Australia's best bushwalking adventures. It is a 138 mile, one-way walk; with good road access.", australia, northernTerritory, difficult, "Backpack, Walking Stick, Camping Supplies, Food, Cooking Supplies, Head Lamp, Waterproof Climbing Shoes, Hat or visor, and Sunscreen.", "Eleven to Fifteen Days.");
        trekRepo.save(larapintaTrail);

        Trek fraserIslandGreatWalk = new Trek("Fraser Island Great Walk", "/images/Fraser Island Great Walk (small).jpg", "The Fraser Island Great Walk gives you a chance to explore the world's largest sand island. With pristine lakes and rare rainforests growing on sand. While the entire walk takes six to eight days, there are shorter walks available making it a walk everyone can enjoy.", australia, tasmaniaHobart, easy,"Backpack, Walking Stick, Camping Supplies, Food, Cooking Supplies, Hat or visor, and Sunscreen.", "Six to Eight days");
        trekRepo.save(fraserIslandGreatWalk);

        Trek wildernessCoastWalk = new Trek("Wilderness Coast Walk", "/images/wildernesscoast.jpg", "The Wilderness Coast walk is a one-way; boat transport required at one end, road access at other, trek across the the far eastern coast of Victoria. Although only 62 miles in length, the scenery is quite diverse including isolated beaches, rocky headlands, crossing rivers, and walking for long stretches on sand. ", australia, victoriaMelbourne, moderate, "Backpack, Walking Stick, Camping Supplies, Food, Cooking Supplies, Head lamp, Waterproof Climbing Shoes, Hat or visor, and Sunscreen.", "Five to Seven Days");
        trekRepo.save(wildernessCoastWalk);


//      Continent: Europe
        Trek tourDeMontBlanc = new Trek("Tour De Mont Blanc", "/images/tour du mont blanc (small).jpg", "This mother of all treks circumnavigates the mighty slopes of the highest mountain in the Alps", europe,france, difficult,"Backpack, Walking Stick, Camping Supplies, Food, Cooking Supplies, Head Lamp, and Waterproof Climbing Shoes.","Ten to Fifteen Days");
        trekRepo.save(tourDeMontBlanc);

        Trek norwegianFjords = new Trek("Norwegian Fjords", "/images/Norwegian Fjords.jpg", "Take the family on treks over blue glaciers, and viewing mountains that come straight up from the narrow fjords.",europe, northernTerritory, easy, "Water Bottle, Sunglasses, Sunscreen, Hat or Visor","One Day");
        trekRepo.save(norwegianFjords);

        Trek tourDeMonteRosa = new Trek("Tour De Monte Rosa", "/images/Tour De Monte Rosa.jpg", "The trek around this 15,710 foot mountain is stunning - and it is not easy. Every day there are steep ascents and descents over ice and rock.", europe, italianPeninsula, difficult,"Backpack, Walking Stick, Camping Supplies, Food, Cooking Supplies, Head lamp, and Waterproof Climbing Shoes.", "Eleven to Fifteen Days");
        trekRepo.save(tourDeMonteRosa);

        Trek canaryIslands = new Trek("Canary Islands",  "/images/Canary Islands.jpg","The Canary Islands are considered by some to have the best climate in the world. The islands are only 2,800 square miles,  Tenerife, the largest island of the Canary Islands, boasts the world’s 3rd highest volcano, pine forests, ravines and coastal paths.", europe, iberianPeninsula, easy, "Backpack, Walking Stick, Camping Supplies, Food, Cooking Supplies, Head lamp, and Waterproof Climbing Shoes.", "Two to Three days.");
        trekRepo.save(canaryIslands);


//      Continent: South America
        Trek chapadaDiamantinaNationalPark = new Trek("Chapada Diamantina National Park", "/images/Chapada Diamantina (small).jpg", "One of the most beautiful National Parks in Brazil, Chapada Diamantina is located in Bahia in northeast Brazil. Altitudes vary from 1,600 to 3,300 feet. At the highest point, gold and diamonds have been found.", southAmerica, brazilianCoastline, moderate, "Water Bottle, Camping Supplies, Food, Cooking Supplies, Sunglasses, Sunscreen, Hat or Visor", "Two to Five Days.");
        trekRepo.save(chapadaDiamantinaNationalPark);

        Trek theIncaTrail = new Trek("The Inca Trail","/images/Inca Trail (small).jpg",  "When you think of trekking in South America, you think of the Inca Trail. It is seen by many as a top five trek in the world. It is only 26 miles long, but the payoff destination is Machu Picchu.", southAmerica, brazilianCoastline, moderate, "Water Bottle, Camping Supplies, Food, Cooking Supplies, Sunglasses, Sunscreen, Hat or Visor.", "Three to Five Days");
        trekRepo.save(theIncaTrail);

        Trek theLostCity = new Trek("The Lost City", "/images/Lost City Trek (small).jpg", "Colombia’s Inca Trail, the Lost City trek is the country’s best multi-day trekking option.", southAmerica, amazon, moderate, "Water Bottle, Camping Supplies, Food, Cooking Supplies, Sunglasses, Sunscreen, Hat or Visor.", "Three to Five Days");
        trekRepo.save(theLostCity);


//      Continent: North America
        Trek yellowstone = new Trek("Yellowstone Park", "/images/Yellowstone (small).jpg", "Yellowstone National Park in Wyoming, Montana and Idaho is a hiker's paradise, with approximately 1,000 miles of hiking trails across more than 2.2 million acres.", northAmerica, mountainousWest, difficult, "Water Bottle, Camping Supplies, Food, Cooking Supplies, Sunglasses, Sunscreen, Hat or Visor", "Five to Seven Days");
        trekRepo.save(yellowstone);

        Trek grandTetonNationalPark = new Trek("Grand Teton National Park", "/images/Grand Teton (small).jpg", "The park, which sits in Wyoming's Jackson Hole valley, caters to every level of hiker with its more than 200 miles of trails.", northAmerica, greatPlains, moderate,"Water Bottle, Camping Supplies, Food, Cooking Supplies, Sunglasses, Sunscreen, Hat or Visor", "One to Five Days");
        trekRepo.save(grandTetonNationalPark);

        Trek theAppalachianTrail = new Trek("The Appalachian Trail", "/images/Appalachian Trail (small).jpg", "The Appalachian Trail is a 2,180 mile long public footpath that traverses the scenic, wooded, pastoral, wild, and culturally resonant lands of the Appalachian Mountains.", northAmerica, variedEasternRegion, strenuous, "Water Bottle, Camping Supplies, Food, Cooking Supplies, Sunglasses, Sunscreen, Hat or Visor, Hunting Knife, Firearm.", "One to Three Months");
        trekRepo.save(theAppalachianTrail);



    }

}
